# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

---

## [Unreleased]

### Changed

- **`AlarmEvent.frequency` renamed to `tally`**: the event model field, its
  getter/setter (`getFrequency`/`setFrequency` → `getTally`/`setTally`), the
  MongoDB persisted field (`frequency` → `tally` in `MongoBatchWriter.buildUpdate`),
  the dedup increment logic in `DomainProcessor`, and the `toString` output all
  now use `tally`. Frontend types and the custom-view field list in `cep-web`
  are updated accordingly. Any external consumer reading the `frequency` field
  from MongoDB must switch to `tally`.

### Added

- **JWT login authentication** (Spring Security): user store in MongoDB
  `users` collection, default bootstrap `admin` account, `POST /api/v1/auth/login`.
  Requires Spring Security 6.2.4 + jjwt 0.12.5 dependencies.
- **Event console backend APIs**:
  - `GET /api/v1/events/list` — paged event query with optional custom MongoDB filter
  - `GET /api/v1/operations` — predefined update operations (from `cep.operations`)
  - `POST /api/v1/events/operate` — bulk-apply a predefined operation to identifiers
  - `GET/POST/PUT/DELETE /api/v1/user-prefs` — per-user views, filters, time formats
- **`cep.operations` YAML config**: predefined MongoDB update operations
  (default examples: `ack` → `status=Acked`, `clear` → `status=Cleared`), rendered
  as a dynamic right-click context menu in the frontend.
- **`cep.security` YAML config**: JWT secret/expiration/issuer and bootstrap
  admin credentials (overridable via `CEP_JWT_SECRET`, `CEP_ADMIN_PASSWORD` env).

### Frontend (cep-web)

- New Vue 3 + Vite + Element Plus console: login page, event list (paged,
  multi-select, severity/status visualization, auto refresh), right-click
  context menu with configured operations, and dialogs for custom views
  (column model), custom filters (MongoDB query) and timestamp format/timezone.

### Frontend security & engineering hardening (cep-web)

Security:

- **JWT in-memory storage**: the access token is now held in a module-level
  variable and is never written to `localStorage`/`sessionStorage`, eliminating
  XSS token theft via Web Storage APIs. (Trade-off: page refresh re-prompts login.)
- **NoSQL injection guard**: the custom-filter dialog now validates user queries
  against an operator allow-list, rejecting dangerous operators (`$where`,
  `$function`, …).
- **ReDoS guard**: free-text node filters escape regex metacharacters.
- **CSRF defense-in-depth**: the HTTP client sends an `X-Requested-With` header
  on every request (cross-site form submissions cannot set custom headers).
- **Login brute-force throttling**: 5 consecutive failures trigger a 30 s cooldown.
- **Safe error surface**: raw backend error messages are mapped to friendly
  text; original errors are logged to the console only.
- **Redirect validation**: post-login redirect targets are restricted to
  same-origin paths (`/...`, rejecting `//`).

Deployment:

- **HTTPS/TLS**: Nginx config now serves over TLS (`listen 9443 ssl`) with a
  9988→9443 redirect, `Strict-Transport-Security`, and bundled self-signed certs
  under `deploy/tls/` (replace with CA-signed certs in production).

Engineering:

- **Tests**: Vitest + @vue/test-utils introduced; unit tests cover token expiry,
  context-menu condition parsing, and timestamp formatting.
- **Lint/format**: ESLint (eslint:recommended + vue3-recommended +
  @typescript-eslint + prettier) and Prettier added, with `lint`/`format` scripts.
- **Strict TypeScript**: `noUnusedLocals`, `noUnusedParameters`,
  `noImplicitReturns`, `noFallthroughCasesInSwitch` enabled.
- **i18n**: vue-i18n plumbing added (zh-CN baseline); key UI surfaces localized.
- **Refactor**: `EventConsoleView` split into five composables
  (`useEventList`, `useEventOperations`, `useFilterManagement`,
  `useViewManagement`, `useTimeFormat`); timestamp preferences moved from a
  module singleton into a Pinia store.
- **Error boundary**: unhandled promise rejections are now captured globally.
- **Accessibility**: context menu uses `role="menu"`/`role="menuitem"`.

---

## Problem/Resolution logic rework

### Changed

- **Pairing key & identifier convention**: `identifier` is now
  `pairKey + "|" + eventType`, where `pairKey = domainId/agentType/node/
  alertGroup/alertKey` (empty segments skipped; blank `agentType` defaults to
  `generic`). Events sharing the same `pairKey` across `eventType=1` (Problem)
  and `eventType=2` (Resolution) form the automatic recovery condition.
  - `agentType` identifies the ingestion interface (snmp_trap / syslog / other);
    events from different interfaces never auto-recover.
  - `eventType=13` and any other non-`2` value are **not** treated as a Resolution.
- **`resolveProblem` concurrency**: now uses an atomic `remove` on the active
  store so concurrent Resolution events for the same Problem only resolve once.
- **Status semantics**: a resolved Problem is marked `status=Cleared` with
  `severity=0` (the previous `CLOSED` status value is removed).
- **Resolution persistence**: a Resolution event is now persisted (previously it
  was dropped after matching).
- **mib-parser generator**: `GroovyScriptGenerator` now emits
  `identifier = pairKey + "|" + eventType` with a default `generic` agentType.
  All deployed parser scripts in `conf/groovy/formal/` were regenerated.
- **`problem_resolution` hook**: builds the new `pairKey` and looks up the
  matched Problem by `pairKey + "|" + PROBLEM.code`.

### Added

- **Event history** (`events_history` collection): a scheduled cleaner moves
  resolved events (Cleared Problems and Resolution events) from `events_current`
  into `events_history` after a retention window.
  - Config: `cep.mongo.history.retention-ms` (default 300000 = 5 min) and
    `cep.mongo.history.cleanup-interval-ms` (default 30000).
- **`EventHistoryCleaner`** component: periodic sweep of resolved events.
