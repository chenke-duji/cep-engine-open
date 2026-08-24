# Changelog

All notable changes to this project are documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

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
