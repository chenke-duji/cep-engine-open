// ---- Domain types aligned with cep-engine backend ----

/** AlarmEvent model from cep-engine (subset used by the console). */
export interface AlarmEvent {
  identifier: string
  /** Monotonic numeric id assigned once on first insert (stable, unique). */
  serial?: number
  node?: string
  nodeAlias?: string
  severity?: number
  originalSeverity?: number
  summary?: string
  tally?: number
  firstOccurrence?: number
  lastOccurrence?: number
  domainId?: string
  status?: string
  alertKey?: string
  alertGroup?: string
  alertGroupName?: string
  vendor?: string
  eventType?: string
  specificTrap?: string
  receiveTime?: number
  clearTime?: number
  deleteTime?: number
  recoveryTime?: number
  dynamicFields?: Record<string, unknown>
  [key: string]: unknown
}

/** Paged query response. */
export interface PagedResult<T> {
  items: T[]
  total: number
  page: number
  size: number
  /** Present when the events collection does not exist yet (no writes so far). */
  collectionExists?: boolean
  /** Human-readable message shown when collectionExists is false. */
  message?: string
}

/** A predefined update operation exposed by the backend. */
export interface Operation {
  name: string
  menuLabel: string
  confirmMessage: string
  /** Optional server-side condition (e.g. "status!=Acked") enabling the menu item. */
  enableWhen?: string
}

/** A column definition within a custom view. */
export interface ColumnDef {
  field: string
  title: string
  width?: number
  sortable?: boolean
}

/** A custom view: defines the column model (which fields, and their titles). */
export interface ViewConfig {
  id?: string
  name: string
  isPublic: boolean
  isDefault: boolean
  config: {
    columns: ColumnDef[]
  }
}

/** A custom filter: an arbitrary MongoDB query statement. */
export interface FilterConfig {
  id?: string
  name: string
  isPublic: boolean
  isDefault: boolean
  config: {
    query: string
  }
}

/** Timestamp display format preference (per user). */
export interface TimeFormatConfig {
  id?: string
  name: string
  isPublic: boolean
  isDefault: boolean
  config: {
    format: string
    timezone: string
    showTimezone: boolean
  }
}

/** Generic user preference record as returned by /api/v1/user-prefs. */
export interface UserPref {
  id: string
  type: 'view' | 'filter' | 'timeformat'
  owner: string
  name: string
  isPublic: boolean
  isDefault: boolean
  config: Record<string, unknown>
}

/** Result of a bulk operation execution. */
export interface OperateResult {
  operation: string
  matched: number
  modified: number
}

/** Current authenticated user. */
export interface CurrentUser {
  token?: string
  username: string
  displayName: string
  role: string
}
