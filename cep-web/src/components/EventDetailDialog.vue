<template>
  <el-dialog
    :model-value="visible"
    title="事件详细信息"
    width="680px"
    class="event-detail-dialog"
    @update:model-value="emit('close')"
  >
    <div v-if="event" class="detail-body">
      <div class="detail-header">
        <span class="detail-title">{{ summary }}</span>
      </div>
      <el-table :data="rows" size="small" border class="detail-table">
        <el-table-column prop="key" label="字段" width="220" />
        <el-table-column prop="value" label="值" show-overflow-tooltip />
      </el-table>
    </div>
    <template #footer>
      <el-button @click="emit('close')">关闭</el-button>
    </template>
  </el-dialog>
</template>

<script setup lang="ts">
import { computed } from 'vue'
import type { AlarmEvent } from '@/types'
import { formatTimestamp } from '@/utils/time'

const props = defineProps<{
  visible: boolean
  event: AlarmEvent | null
}>()

const emit = defineEmits<{
  (e: 'close'): void
}>()

/** Fields holding an epoch-millis value (number or numeric string). */
const TIMESTAMP_FIELDS = new Set([
  'firstOccurrence',
  'lastOccurrence',
  'recoveryTime',
  'receiveTime',
  'clearTime',
  'deleteTime',
])

/** Header line: prefer the compact numeric serial as the record title. */
const summary = computed(() => {
  const e = props.event
  if (!e) return ''
  const serial = e.serial && e.serial > 0 ? `#${e.serial} ` : ''
  const rest = `${e.node || ''} ${e.summary || ''}`.trim()
  if (serial) return rest ? `${serial}${rest}` : serial
  return rest || e.identifier || ''
})

/** Format an epoch-millis value (number or numeric string) as a readable time. */
function formatTimeValue(v: unknown): string {
  if (v === null || v === undefined || v === '') return ''
  const num = Number(v)
  if (Number.isNaN(num)) return String(v)
  return formatTimestamp(num)
}

/** Flatten the event into key/value rows for display. */
const rows = computed<{ key: string; value: string }[]>(() => {
  const e = props.event
  if (!e) return []
  const out: { key: string; value: string }[] = []
  const push = (key: string, value: unknown) => {
    if (value === null || value === undefined || value === '') return
    if (TIMESTAMP_FIELDS.has(key)) {
      out.push({ key, value: formatTimeValue(value) })
    } else if (typeof value === 'object') {
      out.push({ key, value: JSON.stringify(value) })
    } else {
      out.push({ key, value: String(value) })
    }
  }
  // identifier first, then all scalar fields
  push('identifier', e.identifier)
  Object.entries(e as unknown as Record<string, unknown>)
    .filter(([k]) => k !== 'identifier')
    .sort(([a], [b]) => a.localeCompare(b))
    .forEach(([k, v]) => push(k, v))
  return out
})
</script>

<style scoped>
.detail-header {
  margin-bottom: 12px;
}
.detail-title {
  font-size: 14px;
  font-weight: 600;
  color: var(--cep-text-primary, #e6ebf2);
  word-break: break-all;
}
.detail-table {
  width: 100%;
}
/* High-contrast text inside the detail table so values are clearly readable.
   The el-table content is rendered outside this scoped component, so we must
   reach its internals with :deep(). */
.detail-table :deep(.el-table__cell) {
  color: #f2f5fa;
  background-color: #1c2436;
}
.detail-table :deep(.el-table th.el-table__cell) {
  color: #aab6cc;
  background-color: #161d2b;
  font-weight: 600;
}
.detail-table :deep(.el-table__cell .cell) {
  color: #f2f5fa;
}
</style>
