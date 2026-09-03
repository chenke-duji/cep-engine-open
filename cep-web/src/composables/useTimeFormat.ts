import { reactive, ref } from 'vue'
import { ElMessage } from 'element-plus'
import type { TimeFormatConfig } from '@/types'
import { fetchPrefs, createPref, updatePref, fetchDefaultTimeFormat } from '@/api/userprefs'
import { useTimeStore } from '@/stores/time'

export function useTimeFormat() {
  const timeStore = useTimeStore()
  const timeDialog = reactive<{ visible: boolean; loading: boolean }>({
    visible: false,
    loading: false,
  })
  const timeState = ref({ ...timeStore.timeFormat })

  async function loadTimeFormat() {
    try {
      const t = await fetchDefaultTimeFormat()
      timeStore.applyConfig({ format: t.format, timezone: t.timezone, showTimezone: t.showTimezone })
      timeState.value = { format: t.format, timezone: t.timezone, showTimezone: t.showTimezone }
    } catch {
      timeState.value = { ...timeStore.timeFormat }
    }
  }

  function openTimeDialog() {
    timeState.value = { ...timeStore.timeFormat }
    timeDialog.visible = true
  }

  async function applyTimeFormat(data: TimeFormatConfig, persist: boolean) {
    if (!persist) {
      ElMessage.success('时间格式已应用（本会话）')
      return
    }
    timeDialog.loading = true
    try {
      const existing = (await fetchPrefs('timeformat')).find(
        (p) => p.name === 'default-time-format',
      )
      if (existing) {
        await updatePref(existing.id, {
          name: 'default-time-format',
          isDefault: true,
          isPublic: false,
          config: data.config,
        })
      } else {
        await createPref({
          type: 'timeformat',
          name: 'default-time-format',
          isDefault: true,
          isPublic: false,
          config: data.config,
        })
      }
      ElMessage.success('时间格式已保存为默认设置')
    } catch {
      // handled
    } finally {
      timeDialog.loading = false
    }
  }

  return {
    timeDialog,
    timeState,
    loadTimeFormat,
    openTimeDialog,
    applyTimeFormat,
  }
}
