import http from './http'
import type { UserPref } from '@/types'

/** List preferences visible to the current user, optionally by type. */
export async function fetchPrefs(type?: 'view' | 'filter' | 'timeformat'): Promise<UserPref[]> {
  const res = await http.get('/user-prefs', { params: type ? { type } : {} })
  return (res.data as { items: UserPref[] }).items
}

/** Create a preference. */
export async function createPref(payload: Record<string, unknown>): Promise<UserPref> {
  const res = await http.post('/user-prefs', payload)
  return res.data as UserPref
}

/** Update a preference by id. */
export async function updatePref(id: string, payload: Record<string, unknown>): Promise<UserPref> {
  const res = await http.put(`/user-prefs/${id}`, payload)
  return res.data as UserPref
}

/** Delete a preference by id. */
export async function deletePref(id: string): Promise<void> {
  await http.delete(`/user-prefs/${id}`)
}

/** Return the effective default timestamp format for the current user. */
export async function fetchDefaultTimeFormat(): Promise<{
  format: string
  timezone: string
  showTimezone: boolean
}> {
  const res = await http.get('/user-prefs/default-timeformat')
  return res.data
}
