import { describe, it, expect, beforeEach } from 'vitest'
import { getToken, setToken, clearToken, isTokenExpired } from '@/api/http'

/**
 * Helper: create a JWT with a given payload.
 * The signature is irrelevant for isTokenExpired — only the payload is decoded.
 */
function makeJwt(payload: Record<string, unknown>): string {
  const header = btoa(JSON.stringify({ alg: 'HS256', typ: 'JWT' }))
  const body = btoa(JSON.stringify(payload))
  return `${header}.${body}.fake-signature`
}

describe('token management', () => {
  beforeEach(() => {
    clearToken()
  })

  it('getToken returns empty string by default', () => {
    expect(getToken()).toBe('')
  })

  it('setToken stores the token and getToken retrieves it', () => {
    setToken('my-jwt-token')
    expect(getToken()).toBe('my-jwt-token')
  })

  it('setToken with falsy value clears the token', () => {
    setToken('some-token')
    setToken('')
    expect(getToken()).toBe('')
  })

  it('clearToken resets to empty string', () => {
    setToken('abc123')
    clearToken()
    expect(getToken()).toBe('')
  })
})

describe('isTokenExpired', () => {
  beforeEach(() => {
    clearToken()
  })

  it('returns true when no token is set', () => {
    expect(isTokenExpired()).toBe(true)
  })

  it('returns true for a malformed token (less than 3 parts)', () => {
    setToken('not-a-jwt')
    expect(isTokenExpired()).toBe(true)
  })

  it('returns true for a token with unparseable payload', () => {
    setToken('header.!!!invalid-base64!!!.signature')
    expect(isTokenExpired()).toBe(true)
  })

  it('returns false for a valid token with no exp claim', () => {
    setToken(makeJwt({ sub: 'user1' }))
    expect(isTokenExpired()).toBe(false)
  })

  it('returns false for a token with a future expiration', () => {
    const futureExp = Math.floor(Date.now() / 1000) + 3600 // +1 hour
    setToken(makeJwt({ sub: 'user1', exp: futureExp }))
    expect(isTokenExpired()).toBe(false)
  })

  it('returns true for an expired token', () => {
    const pastExp = Math.floor(Date.now() / 1000) - 3600 // -1 hour
    setToken(makeJwt({ sub: 'user1', exp: pastExp }))
    expect(isTokenExpired()).toBe(true)
  })

  it('returns true for a token expiring exactly now (boundary)', () => {
    const now = Math.floor(Date.now() / 1000)
    setToken(makeJwt({ sub: 'user1', exp: now }))
    expect(isTokenExpired()).toBe(true)
  })
})
