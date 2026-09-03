import { defineStore } from 'pinia'
import dayjs from 'dayjs'
import timezone from 'dayjs/plugin/timezone'
import utc from 'dayjs/plugin/utc'
import customParseFormat from 'dayjs/plugin/customParseFormat'

dayjs.extend(utc)
dayjs.extend(timezone)
dayjs.extend(customParseFormat)

/**
 * Pinia store for the user's preferred timestamp format and timezone.
 * Replaces the former module-level singleton in utils/time.ts (O-02 fix).
 */
export const useTimeStore = defineStore('time', {
  state: () => ({
    format: 'YYYY-MM-DD HH:mm:ss',
    timezone:
      dayjs.tz.guess() ||
      Intl.DateTimeFormat().resolvedOptions().timeZone ||
      'UTC',
    showTimezone: true,
  }),
  actions: {
    setTimeFormat(format: string, timezone: string, showTimezone: boolean) {
      if (format && format.trim()) this.format = format.trim()
      if (timezone && timezone.trim()) this.timezone = timezone.trim()
      this.showTimezone = showTimezone
    },
    /** Bulk-assign from a backend response or stored config. */
    applyConfig(config: { format: string; timezone: string; showTimezone: boolean }) {
      this.setTimeFormat(config.format, config.timezone, config.showTimezone)
    },
  },
  getters: {
    /** Returns a plain snapshot of the current format settings. */
    timeFormat(state) {
      return {
        format: state.format,
        timezone: state.timezone,
        showTimezone: state.showTimezone,
      }
    },
  },
})
