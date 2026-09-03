import { describe, it, expect, beforeEach } from 'vitest'
import { setActivePinia, createPinia } from 'pinia'
import { useTimeStore } from '@/stores/time'
import { formatTimestamp, formatServerTime } from '@/utils/time'

// 2024-01-15T00:00:00.000Z = 1705276800000 ms (clean midnight UTC)
const EPOCH = 1705276800000

describe('formatTimestamp', () => {
  beforeEach(() => {
    setActivePinia(createPinia())
  })

  it('returns empty string for null/undefined/0/NaN', () => {
    expect(formatTimestamp(0)).toBe('')
    expect(formatTimestamp(NaN)).toBe('')
    expect(formatTimestamp(-1)).toBe('')
    // @ts-expect-error testing null input
    expect(formatTimestamp(null)).toBe('')
  })

  it('formats a valid epoch-millis timestamp with default settings', () => {
    const store = useTimeStore()
    store.setTimeFormat('YYYY-MM-DD HH:mm:ss', 'UTC', false)
    const result = formatTimestamp(EPOCH)
    expect(result).toBe('2024-01-15 00:00:00')
  })

  it('appends timezone when showTimezone is true', () => {
    const store = useTimeStore()
    store.setTimeFormat('YYYY-MM-DD', 'Asia/Tokyo', true)
    const result = formatTimestamp(EPOCH)
    // UTC midnight → JST 09:00, but date-only format shows 2024-01-15
    expect(result).toBe('2024-01-15 Asia/Tokyo')
  })

  it('respects custom date format', () => {
    const store = useTimeStore()
    store.setTimeFormat('HH:mm', 'UTC', false)
    const result = formatTimestamp(EPOCH)
    expect(result).toBe('00:00')
  })

  it('reflects store changes reactively', () => {
    const store = useTimeStore()
    store.setTimeFormat('YYYY', 'UTC', false)
    expect(formatTimestamp(EPOCH)).toBe('2024')
    store.setTimeFormat('MM-DD', 'UTC', false)
    expect(formatTimestamp(EPOCH)).toBe('01-15')
  })
})

describe('formatServerTime', () => {
  beforeEach(() => {
    setActivePinia(createPinia())
    const store = useTimeStore()
    store.setTimeFormat('YYYY-MM-DD HH:mm:ss', 'UTC', false)
  })

  it('returns empty string for null/undefined/empty', () => {
    expect(formatServerTime(null)).toBe('')
    expect(formatServerTime(undefined)).toBe('')
    expect(formatServerTime('')).toBe('')
  })

  it('formats a numeric epoch-millis value', () => {
    const result = formatServerTime(EPOCH)
    expect(result).toBe('2024-01-15 00:00:00')
  })

  it('formats a parseable date string', () => {
    const result = formatServerTime('2024-01-15T00:00:00Z')
    expect(result).toBe('2024-01-15 00:00:00')
  })

  it('returns the original string for unparseable values', () => {
    expect(formatServerTime('not-a-date')).toBe('not-a-date')
  })
})
