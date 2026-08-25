import http from './http'
import type { CurrentUser } from '@/types'

/** Login and obtain a JWT. */
export async function login(username: string, password: string): Promise<CurrentUser> {
  const res = await http.post('/auth/login', { username, password })
  return res.data as CurrentUser
}
