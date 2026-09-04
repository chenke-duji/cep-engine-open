# CEP Event Engine — Deployment Guide

This guide walks through a production deployment of the CEP Event Engine:
MongoDB, build, configuration, run, and verification.

Two deployment paths are covered:

| Path | When to use | Section |
|------|-------------|---------|
| **Docker Compose** (recommended) | Quick start, dev, CI, single-host prod | [§ Docker Compose](#docker-compose) below |
| **Bare metal** | Custom infrastructure, existing MongoDB/Nginx | [§ Bare Metal](#1-prerequisites) below |

---

## Docker Compose

The `docker/` directory contains a complete multi-service stack:
**MongoDB 7 + cep-engine (Spring Boot) + cep-web (Nginx)**.

### Architecture

```
                    ┌──────────────────────────────────────────────┐
                    │  Host                                         │
                    │                                               │
  :9443 HTTPS ─────►│  cep-web (nginx)  ── /api/ ──►  cep-engine   │
  :9988 HTTP  ─────►│  (SPA + reverse proxy)       (:8080)         │
                    │                                      │        │
                    │  cep-engine ── MONGO_URI ──►  mongo  │        │
                    │                                      │        │
  :27017 ──────────►│  mongo:7  (init scripts, indexes)    │        │
                    └──────────────────────────────────────────────┘
```

### Files

| File | Purpose |
|------|---------|
| `docker/Dockerfile` | Multi-stage build: Maven → JRE 21 runtime |
| `docker/Dockerfile.web` | Multi-stage build: Node 20 → Nginx |
| `docker/docker-compose.yml` | Service orchestration (mongo + engine + web) |
| `docker/nginx-docker.conf` | Nginx config adapted for Docker networking |
| `docker/.env.example` | Environment template (copy to `.env`) |
| `docker/.dockerignore` | Build context exclusions |
| `docker/mongo-init.js` | MongoDB collections + indexes (first start) |

### Quick Start

```bash
cd docker
cp .env.example .env        # edit secrets!
docker compose up -d
```

After startup:
- **Console**: https://localhost:9443 (accept self-signed cert for dev)
- **API**: https://localhost:9443/api/
- **Backend health**: http://localhost:8080/actuator/health

### Configuration

All secrets are in `.env` (never committed). Key variables:

| Variable | Default | Notes |
|----------|---------|-------|
| `MONGO_ROOT_USER` | `cep` | MongoDB root user |
| `MONGO_ROOT_PASSWORD` | `change-me` | **Set a strong password** |
| `CEP_JWT_SECRET` | (placeholder) | ≥ 32 chars, `openssl rand -hex 32` |
| `CEP_ADMIN_USER` | `admin` | Bootstrap admin username |
| `CEP_ADMIN_PASSWORD` | (empty) | Empty = auto-generated on first start |

**No rebuild needed for config changes** — the `config/` and `conf/groovy/`
directories are mounted as volumes, so editing `config/application.yml` or
hot-reloading Groovy scripts takes effect immediately.

### Optional: prometheus-webhook

The `docker-compose.yml` includes a commented-out `prometheus-webhook`
service. To enable it:

1. Uncomment the `prometheus-webhook` block in `docker-compose.yml`.
2. Set `WEBHOOK_AUTH_TOKEN` in `.env`.
3. Configure Alertmanager to send webhooks to `http://<host>:9093/webhook`.
4. `docker compose up -d prometheus-webhook`

### Production TLS

The image bundles self-signed certificates for dev/internal use. For
production, mount CA-signed certificates:

```yaml
# docker-compose.yml — override the cert volume
volumes:
  - /path/to/prod.crt:/etc/nginx/tls/self-signed.crt:ro
  - /path/to/prod.key:/etc/nginx/tls/self-signed.key:ro
```

### Common Commands

```bash
docker compose up -d              # start all services
docker compose logs -f cep-engine # follow backend logs
docker compose restart cep-engine # restart after config change
docker compose down              # stop (keeps data volume)
docker compose down -v           # stop + delete MongoDB data
docker compose build             # rebuild after code changes
```

---

## Bare Metal

The following sections cover bare-metal deployment for environments where
Docker is unavailable or a custom infrastructure is required.

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
- `spring.data.mongodb.username` / `password` / `authentication-database` — MongoDB
  auth (alternative to embedding credentials in the URI). Overridable via
  `MONGO_URI` / `MONGO_DATABASE` / `MONGO_USERNAME` / `MONGO_PASSWORD` / `MONGO_AUTH_DB`
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

### 5.1 Linux start/stop script (recommended)

`bin/cep-engine.sh` manages the process (`start|stop|restart|status`):

```bash
./bin/cep-engine.sh start     # run in background, logs to logs/cep-engine.log
./bin/cep-engine.sh status
./bin/cep-engine.sh restart
./bin/cep-engine.sh stop      # graceful stop with 30s force-kill timeout
```

The script runs from the jar directory and tracks the PID in `cep-engine.pid`.
Override via env: `APP_HOME`, `JAVA_OPTS`, `APP_ARGS`, `JAVA_HOME`.

### 5.2 Direct run

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

**Unresolved events**: events that no parser script could recognize (e.g. an
unsupported MIB trap) are not dropped. Their raw payload is persisted to
`events_unresolved` and can be inspected in the console's "Unresolved events"
view (`GET /api/v1/events/unresolved`).

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
