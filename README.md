# CEP Event Engine

> **Language**: [English](README.md) | [简体中文](README.zh-CN.md)

A rule-driven, event-driven network alarm correlation and problem-management
engine. It receives raw events (SNMP traps, syslog, HTTP, file, Kafka), parses
them with Groovy scripts, and produces normalized alarms and problems with
deduplication, severity grading, and lifecycle resolution.

> The engine is fully decoupled from any specific vendor's MIB. The bundled
> `conf/groovy/formal/` contains example parser scripts generated from standard
> (IETF) MIB definitions (IF-MIB, SNMPv2-MIB, BGP4-MIB, OSPF-TRAP-MIB, …) with
> alarm semantics (alertGroup / severity / summary) re-written from public MIB
> semantics. Vendor-private MIB source files are **not** distributed; only
> generated, license-clean parser scripts are included.

## Features

- **Groovy-driven parsing** – every trap/event is dispatched to a Groovy parser
  script; scripts are hot-reloaded by watching the script directory.
- **Dynamic alarm semantics** – generated scripts set `alertGroup`, `alertKey`,
  `severity`, `eventType`, `summary`, plus arbitrary dynamic fields, based on
  MIB field values and conditional chains (e.g. IF-MIB `ifOperStatus ×
  ifAdminStatus`).
- **Problem correlation** – domain-scoped problem lifecycle with stale-problem
  cleanup.
- **Transport-level deduplication** – Active-Active collector support with
  fingerprinting.
- **Flexible event sources** – REST ingest, Kafka consumer (optional), file
  tailer.
- **MongoDB persistence** – sole persistence layer (auto index creation).
- **JWT login authentication** – Spring Security with MongoDB-backed users
  (bootstrap `admin` account), protecting the management API.
- **Event console API + web frontend** – paged event query, predefined
  MongoDB update operations (Ack / Clear) exposed via a right-click context
  menu, and per-user views / filters / time-format configuration. A Vue 3 web
  console (`cep-web/`) is bundled.

## Web Console (cep-web)

A Vue 3 + Vite + Element Plus frontend lives in `cep-web/`. It provides a
dark ops-console view of events, right-click bulk operations (Ack/Clear by
default, extensible via `cep.operations`), custom column views, custom MongoDB
filters, and per-user time format/timezone settings.

```bash
cd cep-web
npm install
npm run dev      # dev server, proxies /api to the backend on :8080
npm run build    # production build -> dist/
```

Deploy `dist/` with Nginx and reverse-proxy `/api` to the backend
(see `cep-web/nginx.conf`). Default login: `admin / admin` — change it via the
`CEP_ADMIN_PASSWORD` environment variable.

## Architecture

```
Raw event (SNMP trap / syslog / HTTP / file / Kafka)
        │  rawEvent  {source, sourceIp, rawText, metadata{varbinds,…}}
        ▼
ScriptRegistry ──loads conf/groovy/formal/*.parser.groovy (hot-reload)──▶ GroovyShell
        │  matchScript(trapOid) + executeParseScript(rawEvent)
        ▼
AlarmEvent (alertGroup, alertKey, severity, eventType, summary,
            dynamicFields, rawEvent=JSON aggregate of original payload)
        │
        ▼
Problem correlation / dedup / severity-grade hooks (conf/groovy/hooks)
        ▼
MongoDB batch writer
```

### Key components

| Class | Responsibility |
|-------|----------------|
| `ScriptRegistry` | Discovers and compiles Groovy scripts from `conf/groovy/formal`, hot-reloads on file change |
| `EventProcessingChain` | Ingest pipeline: parse raw → correlate → write |
| `ProblemManager` | Domain-scoped problem lifecycle, stale cleanup |
| `MongoBatchWriter` | Batched persistence to MongoDB |
| `RawEvent` / `AlarmEvent` | Input / output event models |

### Raw event preservation

Each parser script aggregates the **complete original event** into
`event.rawEvent` as JSON:

```json
{
  "_source":   "snmp_trap",
  "_sourceIp": "192.0.2.10",
  "_trapOid":  "1.3.6.1.6.3.1.1.5.3",
  "_trapName": "linkDown",
  "_rawText":  "<original payload>",
  "_metadata": { "trapName": "linkDown", "varbinds": { "ifIndex": "3", "ifDescr": "eth0" } },
  "_fields":   { "ifIndex": ["3", "1.3.6.1.2.1.2.2.1.1", "name"] },
  "_varbinds": { "ifIndex": "3", "ifDescr": "eth0" }
}
```

The same structured data is exposed in `event.getDynamicFields()["raw_fields"]`
for programmatic access without JSON parsing.

## Requirements

- Java 21+
- Maven 3.8+
- MongoDB (local or remote)
- Node.js 18+ / npm (only to build the `cep-web` console)

## Build

```bash
mvn clean package
```

Produces a Spring Boot fat jar in `target/`.

## Run

```bash
# Start MongoDB first (e.g. docker run -p 27017:27017 -d mongo)
java -jar target/cep-engine-1.0.0-SNAPSHOT.jar --spring.config.location=classpath:application.yml
```

Default HTTP port: `8080`. Health: `GET /actuator/health`.

### Configuration

`src/main/resources/application.yml` configures MongoDB, Kafka (optional),
script directory, dedup TTL, and problem lifecycle. All connection settings use
`localhost` by default; override via environment variables when deploying.

| Key | Default | Description |
|-----|---------|-------------|
| `spring.data.mongodb.uri` | `mongodb://localhost:27017/cep` | MongoDB connection |
| `cep.script.dir` | `classpath:conf/groovy` | Groovy script root (formal + hooks) |
| `cep.dedup.ttl` | (see yml) | Transport-level dedup window |
| `cep.problem.stale.*` | (see yml) | Problem stale/cleanup lifecycle |
| `cep.kafka.*` | disabled | Optional Kafka consumer |
| `cep.security.jwt.secret` | (dev default) | JWT signing secret (override with `CEP_JWT_SECRET`) |
| `cep.security.bootstrap-admin` | `admin` / `admin` | Initial admin account (override with `CEP_ADMIN_USER` / `CEP_ADMIN_PASSWORD`) |
| `cep.operations` | `ack`, `clear` | Predefined MongoDB update operations for the context menu |

See `src/main/resources/application.yml` for the complete default set.

### Included parser scripts

`conf/groovy/formal/` ships license-clean parser scripts whose alarm semantics
were re-written from public IETF MIB definitions (no proprietary vendor MIB text
or third-party rule text is embedded):

- Interface / general: `IF-MIB`, `SNMPv2-MIB`, `ENTITY-MIB`
- Routing: `BGP4-MIB`, `OSPF-TRAP-MIB`, `ISIS-MIB`, `IPV6-MIB`
- Bridging/HA: `BRIDGE-MIB`, `VRRP-MIB`, `LLDP-MIB`, `RMON-MIB`
- MPLS: `MPLS-LSR/LDP/TE/L3VPN/VPN-STD-MIB`
- OAM & tunnels: `DISMAN-PING/TRACEROUTE-MIB`, `L2TP-MIB`, `FRAME-RELAY-DTE-MIB`
- Vendor example set: `HUAWEI-*.parser.groovy` (generated from Huawei NE8000
  MIB trap definitions, semantics re-written from public network-operation
  knowledge; the vendor MIB source files are not distributed)

> New MIBs are converted to parser scripts with the companion `mib-parser`
> generator project; add scripts to `conf/groovy/formal/` and they are
> hot-reloaded automatically.

## Contributing

Please read `LICENSE` (Apache-2.0) before contributing. Contributions are
welcome via pull requests and must follow the Apache-2.0 contribution terms.

## Contact

- Email: chenke@dujitech.cn
