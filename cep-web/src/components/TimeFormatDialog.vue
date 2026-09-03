<template>
  <el-dialog
    :model-value="visible"
    title="时间格式与时区设置"
    width="480px"
    @update:model-value="emit('close')"
  >
    <el-form label-width="80px">
      <el-form-item label="日期格式">
        <el-select v-model="form.format" filterable allow-create style="width: 100%">
          <el-option v-for="f in presetFormats" :key="f.value" :label="f.label" :value="f.value" />
        </el-select>
      </el-form-item>
      <el-form-item label="时区">
        <el-select v-model="form.timezone" filterable style="width: 100%">
          <el-option v-for="tz in timezones" :key="tz" :label="tz" :value="tz" />
        </el-select>
      </el-form-item>
      <el-form-item label="显示时区">
        <el-switch v-model="form.showTimezone" />
      </el-form-item>
      <el-form-item label="预览">
        <div class="preview">{{ previewText }}</div>
      </el-form-item>
      <el-form-item label="应用方式">
        <el-radio-group v-model="applyMode">
          <el-radio value="current">仅本会话</el-radio>
          <el-radio value="persist">保存为我的默认设置</el-radio>
        </el-radio-group>
      </el-form-item>
    </el-form>

    <template #footer>
      <el-button @click="emit('close')">取消</el-button>
      <el-button type="primary" :loading="loading" @click="save">应用</el-button>
    </template>
  </el-dialog>
</template>

<script setup lang="ts">
import { computed, reactive, ref, watch } from 'vue'
import dayjs from 'dayjs'
import type { TimeFormatConfig } from '@/types'
import { useTimeStore } from '@/stores/time'

const props = defineProps<{
  visible: boolean
  current: { format: string; timezone: string; showTimezone: boolean }
  loading: boolean
}>()

const emit = defineEmits<{
  (e: 'close'): void
  (e: 'apply', data: TimeFormatConfig, persist: boolean): void
}>()

const presetFormats = [
  { label: 'YYYY-MM-DD HH:mm:ss', value: 'YYYY-MM-DD HH:mm:ss' },
  { label: 'YYYY-MM-DD HH:mm', value: 'YYYY-MM-DD HH:mm' },
  { label: 'MM-DD HH:mm:ss', value: 'MM-DD HH:mm:ss' },
  { label: 'YYYY/MM/DD HH:mm:ss', value: 'YYYY/MM/DD HH:mm:ss' },
  { label: 'ISO 8601', value: 'YYYY-MM-DDTHH:mm:ssZ' },
  { label: 'HH:mm:ss', value: 'HH:mm:ss' },
]

const COMMON_TIMEZONES = [
  'Asia/Shanghai', 'Asia/Hong_Kong', 'Asia/Taipei', 'Asia/Tokyo', 'Asia/Singapore',
  'Asia/Seoul', 'Asia/Kolkata', 'Asia/Dubai', 'Europe/London', 'Europe/Paris',
  'Europe/Berlin', 'Europe/Moscow', 'America/New_York', 'America/Chicago',
  'America/Los_Angeles', 'America/Sao_Paulo', 'Australia/Sydney', 'Pacific/Auckland',
  'UTC', 'GMT',
]

// Prefer dynamic values when available, fall back to a curated list.
const timezones: string[] = (() => {
  try {
    const intlAny = Intl as unknown as { supportedValuesOf?: (k: string) => string[] }
    const dynamic = intlAny.supportedValuesOf?.('timeZone') as string[] | undefined
    if (dynamic && dynamic.length) return dynamic
  } catch {
    // ignore
  }
  return COMMON_TIMEZONES
})()

const form = reactive<{ format: string; timezone: string; showTimezone: boolean }>({
  format: 'YYYY-MM-DD HH:mm:ss',
  timezone: dayjs.tz.guess() || 'Asia/Shanghai',
  showTimezone: true,
})

const applyMode = ref<'current' | 'persist'>('current')

watch(
  () => props.visible,
  (v) => {
    if (v) {
      form.format = props.current.format || 'YYYY-MM-DD HH:mm:ss'
      form.timezone = props.current.timezone || dayjs.tz.guess() || 'UTC'
      form.showTimezone = props.current.showTimezone
      applyMode.value = 'current'
    }
  },
)

const previewText = computed(() => {
  const d = dayjs().tz(form.timezone)
  let out = d.format(form.format)
  if (form.showTimezone) out += ` ${form.timezone}`
  return out
})

function save() {
  const timeStore = useTimeStore()
  timeStore.setTimeFormat(form.format, form.timezone, form.showTimezone)
  emit('apply', {
    name: 'default-time-format',
    isDefault: true,
    isPublic: false,
    config: {
      format: form.format,
      timezone: form.timezone,
      showTimezone: form.showTimezone,
    },
  }, applyMode.value === 'persist')
  emit('close')
}
</script>

<style scoped>
.preview {
  padding: 8px 12px;
  border: 1px dashed var(--cep-border);
  border-radius: 4px;
  color: var(--cep-text);
  width: 100%;
}
</style>
