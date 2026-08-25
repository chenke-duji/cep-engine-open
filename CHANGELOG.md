# Changelog

All notable changes to this project are documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Added

- **JWT login authentication** (Spring Security): MongoDB-backed `users`
  collection, bootstrap `admin` account, `POST /api/v1/auth/login`. New
  dependencies: Spring Security 6.2.4 + jjwt 0.12.5.
- **Event console APIs**:
  - `GET /api/v1/events/list` — paged event query with optional custom MongoDB filter
  - `GET /api/v1/operations` — predefined update operations (from `cep.operations`)
  - `POST /api/v1/events/operate` — bulk-apply a predefined operation to identifiers
  - `GET/POST/PUT/DELETE /api/v1/user-prefs` — per-user views, filters, time formats
- **`cep.operations` YAML config**: predefined MongoDB update operations
  (default examples: `ack` → `status=Acked`, `clear` → `status=Cleared`), rendered
  as a dynamic right-click context menu.
- **`cep.security` YAML config**: JWT secret/expiration/issuer and bootstrap
  admin credentials (overridable via `CEP_JWT_SECRET`, `CEP_ADMIN_PASSWORD` env).
- **CEP Web Console** (`cep-web/`): Vue 3 + Vite + Element Plus frontend —
  login page, event list (paged, multi-select, severity/status visualization,
  auto refresh), right-click context menu with configured operations, and dialogs
  for custom views (column model), custom filters (MongoDB query) and timestamp
  format/timezone. Deploy with Nginx (`cep-web/nginx.conf`).

### Changed

- **`AlarmEvent.frequency` renamed to `tally`**: the model field, its getter/setter
  (`getFrequency`/`setFrequency` → `getTally`/`setTally`), the MongoDB persisted
  field (`frequency` → `tally` in `MongoBatchWriter`), the dedup increment logic in
  `DomainProcessor`, and `toString` now use `tally`. Frontend types and the
  custom-view field list in `cep-web` are updated accordingly. External consumers
  reading `frequency` from MongoDB must switch to `tally`.

## [1.0.0] - 2026-08-24

### Initial open-source release

Rule-driven, event-driven network alarm correlation and problem-management
engine, decoupled from any vendor MIB.

### Added

- **Groovy-driven parsing** with hot-reload (`ScriptRegistry`): scripts under
  `conf/groovy/formal/` are discovered and recompiled on file change.
- **Dynamic alarm semantics** via generated parser scripts:
  `alertGroup`, `alertKey`, `severity`, `eventType`, `summary`, and arbitrary
  `dynamicFields`, including conditional chains (e.g. IF-MIB
  `ifOperStatus × ifAdminStatus`).
- **rawEvent preservation**: each parser aggregates the complete original event
  into `event.rawEvent` as JSON (`_source`, `_sourceIp`, `_trapOid`, `_trapName`,
  `_rawText`, `_metadata`, `_fields`, `_varbinds`), mirrored in
  `event.getDynamicFields()["raw_fields"]` for structured access.
- **Problem correlation**: domain-scoped problem lifecycle with stale-problem
  cleanup.
- **Transport-level deduplication**: Active-Active collector support with
  fingerprinting.
- **Flexible event sources**: REST ingest, optional Kafka consumer, file tailer.
- **MongoDB persistence**: batched writes and automatic index management.
- **Example parser scripts** under `conf/groovy/formal/` for standard IETF MIB
  semantics (IF-MIB, SNMPv2-MIB, BGP4-MIB, OSPF-TRAP-MIB, MPLS-*, …) plus a
  vendor example set (`HUAWEI-*.parser.groovy`). Vendor MIB source files are
  **not** distributed.

### License

Licensed under the Apache License, Version 2.0. See `LICENSE`.
