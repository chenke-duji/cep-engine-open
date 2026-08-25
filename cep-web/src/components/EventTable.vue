<template>
  <div
    class="event-table-wrap"
    @contextmenu.prevent="onContextMenu"
  >
    <el-table
      ref="tableRef"
      :data="events"
      v-loading="loading"
      row-key="identifier"
      height="100%"
      highlight-current-row
      :row-class-name="rowClassName"
      @selection-change="onSelectionChange"
      @row-click="onRowClick"
    >
      <el-table-column type="selection" width="42" :selectable="() => true" />
      <el-table-column
        v-for="col in columns"
        :key="col.field"
        :prop="col.field"
        :label="col.title"
        :width="col.width"
        :sortable="col.sortable || false"
        :show-overflow-tooltip="true"
      >
        <template v-if="isSeverityColumn(col.field)" #default="{ row }">
          <span class="sev-badge">
            <span class="sev-dot" :class="`sev-dot-${sev(row)}`" />
            <span :class="`sev-${sev(row)}`">{{ sevLabel(row) }}</span>
          </span>
        </template>
        <template v-else-if="isTimestampColumn(col.field)" #default="{ row }">
          <span>{{ formatTime(row[col.field]) }}</span>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script setup lang="ts">
import { ref, type ComponentPublicInstance } from 'vue'
import type { AlarmEvent, ColumnDef } from '@/types'
import { formatTimestamp, formatServerTime } from '@/utils/time'

const props = defineProps<{
  events: AlarmEvent[]
  columns: ColumnDef[]
  loading: boolean
}>()

const emit = defineEmits<{
  (e: 'selection-change', rows: AlarmEvent[]): void
  (e: 'row-click', row: AlarmEvent): void
  (e: 'context-menu', evt: MouseEvent, rows: AlarmEvent[]): void
}>()

const tableRef = ref<ComponentPublicInstance & { clearSelection: () => void }>()

// Severity column heuristic: field name contains 'severity'
const SEVERITY_FIELDS = new Set(['severity', 'originalSeverity'])
// Timestamp fields shown with the user-selected format
const TIMESTAMP_FIELDS = new Set([
  'firstOccurrence',
  'lastOccurrence',
  'recoveryTime',
])

function isSeverityColumn(field: string) {
  return SEVERITY_FIELDS.has(field)
}

function isTimestampColumn(field: string) {
  return TIMESTAMP_FIELDS.has(field)
}

function sev(row: AlarmEvent): number {
  const v = Number(row.severity ?? 0)
  return v >= 0 && v <= 5 ? v : 0
}

function sevLabel(row: AlarmEvent): string {
  const map = ['Clear', 'Indeterminate', 'Warning', 'Minor', 'Major', 'Critical']
  const v = sev(row)
  return map[v] ?? String(row.severity)
}

function formatTime(value: unknown): string {
  if (value == null) return ''
  const num = Number(value)
  if (Number.isNaN(num)) return String(value)
  return formatTimestamp(num)
}

function rowClassName({ row }: { row: AlarmEvent }) {
  return isSelected(row) ? 'selected-row' : ''
}

function isSelected(row: AlarmEvent): boolean {
  return selected.value.has(row.identifier)
}

const selected = ref<Set<string>>(new Set())

function onSelectionChange(rows: AlarmEvent[]) {
  selected.value = new Set(rows.map((r) => r.identifier))
  emit('selection-change', rows)
}

function onRowClick(row: AlarmEvent) {
  emit('row-click', row)
}

function onContextMenu(evt: MouseEvent) {
  // Only open the context menu when there is a selection. If none, ignore.
  const selectedRows = Array.from(selected.value)
  if (selectedRows.length === 0) return
  emit('context-menu', evt, Array.from(selected.value).map((id) =>
    props.events.find((e) => e.identifier === id)!,
  ).filter(Boolean))
}

/** Clear the current selection (used after an operation or menu close). */
function clearSelection() {
  selected.value = new Set()
}

defineExpose({ clearSelection })
</script>

<style scoped>
.event-table-wrap {
  height: 100%;
  overflow: hidden;
  border-radius: 6px;
  border: 1px solid var(--cep-border);
  background: var(--cep-bg-panel);
}
</style>
