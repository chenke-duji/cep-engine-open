<template>
  <Teleport to="body">
    <div
      v-if="visible"
      class="context-menu"
      :style="{ left: menuLeft + 'px', top: menuTop + 'px' }"
      @click.stop
    >
      <div v-if="selectedCount > 0" class="context-menu-selection-info">
        已选 {{ selectedCount }} 条
      </div>
      <div
        v-for="op in operations"
        :key="op.name"
        class="context-menu-item"
        :class="{ disabled: !isEnabled(op) }"
        :title="op.confirmMessage || ''"
        @click="onClick(op)"
      >
        {{ op.menuLabel }}
      </div>
      <div v-if="operations.length === 0" class="context-menu-item disabled">
        无可执行操作
      </div>
    </div>
  </Teleport>
</template>

<script setup lang="ts">
import { computed } from 'vue'
import type { Operation, AlarmEvent } from '@/types'

const props = defineProps<{
  visible: boolean
  x: number
  y: number
  operations: Operation[]
  selectedCount: number
  /** Selected rows, used to evaluate enableWhen conditions. */
  selectedRows: AlarmEvent[]
}>()

const emit = defineEmits<{
  (e: 'select', operation: Operation): void
  (e: 'close'): void
}>()

// Keep the menu inside the viewport.
const MENU_WIDTH = 200
const MENU_HEIGHT = 180
const menuLeft = computed(() =>
  Math.min(props.x, window.innerWidth - MENU_WIDTH),
)
const menuTop = computed(() =>
  Math.min(props.y, window.innerHeight - MENU_HEIGHT),
)

/**
 * Evaluate a simple enableWhen condition like "status!=Acked" or "status=Acked"
 * against the selected rows. Empty enableWhen => always enabled.
 * If the condition targets a field and none of the selected rows has it set,
 * we conservatively enable it.
 */
function isEnabled(op: Operation): boolean {
  if (!op.enableWhen) return true
  if (props.selectedRows.length === 0) return true
  const cond = op.enableWhen.trim()
  const match = cond.match(/^([A-Za-z0-9_.]+)\s*(!?=)\s*(.*)$/)
  if (!match) return true
  const [, field, operator, value] = match
  const target = value.replace(/^['"]|['"]$/g, '')

  // Every selected row must satisfy the condition.
  for (const row of props.selectedRows) {
    const actual = String((row as Record<string, unknown>)[field] ?? '')
    if (operator === '=') {
      if (actual !== target) return false
    } else if (operator === '!=') {
      if (actual === target) return false
    }
  }
  return true
}

function onClick(op: Operation) {
  if (!isEnabled(op)) return
  emit('select', op)
}
</script>

<style scoped>
.context-menu-selection-info {
  padding: 4px 12px 6px;
  font-size: 12px;
  color: var(--cep-text-muted);
  border-bottom: 1px solid #2a3446;
  margin-bottom: 4px;
}
</style>
