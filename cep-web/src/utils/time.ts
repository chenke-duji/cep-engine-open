import dayjs from 'dayjs'
import timezone from 'dayjs/plugin/timezone'
import utc from 'dayjs/plugin/utc'
import customParseFormat from 'dayjs/plugin/customParseFormat'

dayjs.extend(utc)
dayjs.extend(timezone)
dayjs.extend(customParseFormat)

// In-memory holder for the user's preferred timestamp format/timezone.
// Populated on app start from the backend /user-prefs/default-timeformat.
const state = {
  format: 'YYYY-MM-DD HH:mm:ss',
  timezone: dayjs.tz.guess() || Intl.DateTimeFormat().resolvedOptions().timeZone || 'UTC',
  showTimezone: true,
}

export function setTimeFormat(format: string, timezone: string, showTimezone: boolean) {
  if (format && format.trim()) state.format = format.trim()
  if (timezone && timezone.trim()) state.timezone = timezone.trim()
  state.showTimezone = showTimezone
}

export function getTimeFormat() {
  return { ...state }
}

/**
 * Format an epoch-milliseconds value to the user's configured format and timezone.
 * For plain-number fields that are actually seconds, we do not guess; AlarmEvent
 * timestamps (firstOccurrence, lastOccurrence) are milliseconds.
 */
export function formatTimestamp(epochMillis: number): string {
  if (epochMillis == null || Number.isNaN(epochMillis) || epochMillis <= 0) return ''
  let d = dayjs(epochMillis)
  if (state.timezone) {
    d = dayjs(epochMillis).tz(state.timezone)
  }
  let out = d.format(state.format)
  if (state.showTimezone) {
    out += ` ${state.timezone}`
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
