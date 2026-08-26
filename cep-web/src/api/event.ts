import http from './http'
import type { AlarmEvent, Operation, PagedResult, OperateResult } from '@/types'

export interface EventListQuery {
  page?: number
  size?: number
  /** Raw MongoDB query JSON, e.g. {"status":"Active"} */
  filter?: string
  sortBy?: string
  sortDesc?: boolean
}

/** Paged event list with an optional custom MongoDB filter. */
export async function fetchEvents(q: EventListQuery = {}): Promise<PagedResult<AlarmEvent>> {
  const res = await http.get('/events/list', { params: q })
  return res.data as PagedResult<AlarmEvent>
}

/** Return the predefined update operations for the context menu. */
export async function fetchOperations(): Promise<Operation[]> {
  const res = await http.get('/operations')
  return (res.data as { operations: Operation[] }).operations
}

/** Apply a predefined operation to the given event identifiers. */
export async function operate(
  operation: string,
  identifiers: string[],
): Promise<OperateResult> {
  const res = await http.post('/events/operate', { operation, identifiers })
  return res.data as OperateResult
}

/** An event that no script could parse (unsupported MIB trap etc). */
export interface UnresolvedEvent {
  id?: string
  source?: string
  sourceIp?: string
  originTimestamp?: number
  receivedAt?: number
  reason?: string
  metadata?: Record<string, unknown>
  rawJson?: string
}

/** Paged query of unresolved events. */
export async function fetchUnresolved(q: {
  page?: number
  size?: number
} = {}): Promise<PagedResult<UnresolvedEvent>> {
  const res = await http.get('/events/unresolved', { params: q })
  return res.data as PagedResult<UnresolvedEvent>
}
