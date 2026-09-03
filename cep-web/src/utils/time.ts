import dayjs from 'dayjs'
import timezone from 'dayjs/plugin/timezone'
import utc from 'dayjs/plugin/utc'
import customParseFormat from 'dayjs/plugin/customParseFormat'
import { useTimeStore } from '@/stores/time'

dayjs.extend(utc)
dayjs.extend(timezone)
dayjs.extend(customParseFormat)

/**
 * Format an epoch-milliseconds value to the user's configured format and timezone.
 * Reads from the Pinia time store so the result is reactive — components that
 * call this during render will automatically re-render when the format changes.
 *
 * For plain number fields that are actually seconds, we do not guess; AlarmEvent
 * timestamps (firstOccurrence, lastOccurrence) are milliseconds.
 */
export function formatTimestamp(epochMillis: number): string {
  if (epochMillis == null || Number.isNaN(epochMillis) || epochMillis <= 0) return ''
  const store = useTimeStore()
  let d = dayjs(epochMillis)
  if (store.timezone) {
    d = dayjs(epochMillis).tz(store.timezone)
  }
  let out = d.format(store.format)
  if (store.showTimezone) {
    out += ` ${store.timezone}`
  }
  return out
}

/**
 * Format a server-provided time string (e.g. receiveTime). If it parses as
 * epoch millis or a date string, reformat to the user's settings.
 */
export function formatServerTime(value: string | number | null | undefined): string {
  if (value == null || value === '') return ''
  if (typeof value === 'number') return formatTimestamp(value)
  const parsed = Date.parse(String(value))
  if (!Number.isNaN(parsed)) {
    return formatTimestamp(parsed)
  }
  return String(value)
}
