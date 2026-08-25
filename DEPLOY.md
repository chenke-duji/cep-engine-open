# CEP Event Engine — Deployment Guide

This guide walks through a production deployment of the CEP Event Engine:
MongoDB, build, configuration, run, and verification.

## 1. Prerequisites

- **Java 21+** (JDK) — build & run
- **Maven 3.8+** — build
- **MongoDB** — persistence (a `docker` snippet is provided in section 2)

## 2. Start MongoDB

```bash
docker run -d --name cep-mongo \
  -p 27017:27017 \
  -e MONGO_INITDB_ROOT_USERNAME=cep \
  -e MONGO_INITDB_ROOT_PASSWORD=<strong-password> \
  mongo:7
```

Or use the bundled init script as a guide:

```bash
docker run -d --name cep-mongo -p 27017:27017 \
  -v "$PWD/docker/mongo-init.js:/docker-entrypoint-initdb.d/mongo-init.js:ro" \
  mongo:7
```

## 3. Build

```bash
mvn clean package
```

The Spring Boot fat jar is produced at `target/cep-engine-<version>.jar`.

## 4. Configuration

### 4.1 External config file (recommended)

A run-time editable template ships at `config/application.yml`. Place the jar
and the `config/` directory in the same run directory; Spring Boot loads
`./config/application.yml` automatically and it **overrides** the defaults
bundled inside the jar (MongoDB, logging levels, port, auth, history, ops):

```bash
test-env/
├── cep-engine-<version>.jar
└── config/
    └── application.yml      # edit here; no jar rebuild needed

java -jar cep-engine-<version>.jar
# or explicitly:
java -jar cep-engine-<version>.jar --spring.config.additional-location=file:./config/
```

Key values to adjust in `config/application.yml`:
- `spring.data.mongodb.uri` / `database` — MongoDB connection
- `logging.level.com.raysdata.cep` — set `DEBUG` to trace Problem/Resolution pairing
- `server.port` — HTTP port
- `cep.security.jwt.secret` / `cep.security.bootstrap-admin.password` — auth

### 4.2 Environment overrides

Edit `src/main/resources/application.yml` or override via environment
variables. Key settings:

| Env / key | Purpose |
|-----------|---------|
| `SPRING_DATA_MONGODB_URI` | MongoDB connection string |
| `CEP_SCRIPT_DIR` | Groovy script root (default `classpath:conf/groovy`) |
| `CEP_DEDUP_TTL` | Deduplication window (seconds) |
| `CEP_PROBLEM_STALE_*` | Problem stale/cleanup lifecycle tuning |

> Keep production credentials out of the repo — always use environment
> variables or a secrets manager.

## 5. Run

```bash
java -jar target/cep-engine-<version>.jar
```

- HTTP port: `8080` (override with `SERVER_PORT`)
- Health check: `GET /api/v1/health`
- Console login: `POST /api/v1/auth/login`
- Groovy scripts under `conf/groovy/formal/` are **hot-reloaded** when the
  directory changes (no restart needed).

## 5.1 Problem/Resolution pairing & event history

**Event types (`eventType`)**: `1` = Problem, `2` = Resolution (only `2`
participates in auto-recovery), any other value (including `13`) is not treated
as a Resolution.

**Pairing key**: `identifier = pairKey + "|" + eventType`, where

```
pairKey = domainId / agentType / node / alertGroup / alertKey
```

- `agentType` identifies the ingestion interface (`snmp_trap` / `syslog` / other);
  blank defaults to `generic`. Events from different interfaces never pair.
- Same `pairKey` across `eventType=1` (Problem) and `eventType=2` (Resolution)
  forms the automatic recovery condition. Empty pairKey segments are skipped.

**Flow**: a Resolution event (eventType=2) is matched against the active Problem
(`pairKey + "|1"`). `resolveProblem` atomically removes it (concurrency-safe),
sets `status=Cleared` + `severity=0`, and persists both the cleared Problem and
the Resolution event to `events_current`. After the retention window they are
moved to `events_history`.

**Event history**: resolved events are kept in `events_current` for the retention
window, then a scheduled cleaner moves them to `events_history`.

| Env / key | Default | Purpose |
|-----------|---------|---------|
| `CEP_MONGO_HISTORY_RETENTION_MS` | 300000 (5 min) | How long a resolved event stays in `events_current` |
| `CEP_MONGO_HISTORY_CLEANUP_INTERVAL_MS` | 30000 | History sweep interval |

**Authentication**: the management API requires a JWT. The default bootstrap
admin is `admin` / `admin`; override via `CEP_ADMIN_USER` / `CEP_ADMIN_PASSWORD`
and set a production JWT secret via `CEP_JWT_SECRET`.

## 6. Ingest events

POST a `RawEvent` JSON to the ingest endpoint:

```json
{
  "source": "snmp_trap",
  "sourceIp": "192.0.2.10",
  "rawEvent": "<original payload>",
  "metadata": {
    "trapOid": "1.3.6.1.6.3.1.1.5.3",
    "trapName": "linkDown",
    "varbinds": { "ifIndex": "3", "ifDescr": "eth0" }
  }
}
```

The engine matches the trap OID to a parser script, produces an `AlarmEvent`
(alertGroup / alertKey / severity / eventType / summary / dynamicFields /
rawEvent-JSON), then correlates into problems and persists to MongoDB.

## 7. Verify

```bash
# health
curl http://localhost:8080/actuator/health

# check alerts persisted
mongosh mongodb://localhost:27017/cep --eval "db.alarm.find().limit(5)"
```

## 8. Troubleshooting

| Symptom | Likely cause / fix |
|---------|--------------------|
| No parser loaded | `cep.script.dir` points to wrong location; check startup log for `Script reload complete: N parse scripts` |
| Script compile failure | A `.groovy` in `formal/` fails to compile; fix the script and reload (hot) |
| Events not ingested | Verify ingest endpoint and `metadata.trapOid` matches a parser's OID |
| MongoDB auth failure | Check `SPRING_DATA_MONGODB_URI` credentials |

## 9. Notes on distributed content

- The repository ships **parser scripts only**; vendor MIB source files are not
  distributed.
- All parser scripts were generated with license-clean semantics (no third-party
  rule-library text); see `LICENSE`.
