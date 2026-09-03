import { reactive, ref } from 'vue'
import { ElMessage } from 'element-plus'
import type { AlarmEvent, Operation } from '@/types'
import { fetchOperations, operate } from '@/api/event'

export function useEventOperations() {
  const operations = ref<Operation[]>([])
  const selectedRows = ref<AlarmEvent[]>([])
  const menu = reactive<{ visible: boolean; x: number; y: number }>({
    visible: false,
    x: 0,
    y: 0,
  })
  const confirm = reactive<{ visible: boolean; operation: Operation | null }>({
    visible: false,
    operation: null,
  })
  const operating = ref(false)
  const detailDialog = reactive<{ visible: boolean; event: AlarmEvent | null }>({
    visible: false,
    event: null,
  })

  async function loadOperations() {
    try {
      operations.value = await fetchOperations()
    } catch {
      operations.value = []
    }
  }

  function onSelectionChange(rows: AlarmEvent[]) {
    selectedRows.value = rows
  }

  function onContextMenu(evt: MouseEvent, rows: AlarmEvent[]) {
    selectedRows.value = rows
    menu.x = evt.clientX
    menu.y = evt.clientY
    menu.visible = true
  }

  function closeMenu() {
    menu.visible = false
  }

  function onMenuSelect(op: Operation) {
    closeMenu()
    confirm.operation = op
    confirm.visible = true
  }

  function onMenuDetail() {
    closeMenu()
    if (selectedRows.value.length === 0) return
    detailDialog.event = selectedRows.value[0]
    detailDialog.visible = true
  }

  function onRowDblClick(row: AlarmEvent) {
    detailDialog.event = row
    detailDialog.visible = true
  }

  async function executeOperation(reload: () => void) {
    if (!confirm.operation || selectedRows.value.length === 0) return
    operating.value = true
    try {
      const ids = selectedRows.value.map((r) => r.identifier)
      const res = await operate(confirm.operation.name, ids)
      ElMessage.success(`操作成功：匹配 ${res.matched} 条，更新 ${res.modified} 条`)
      confirm.visible = false
      reload()
    } catch {
      // handled by interceptor
    } finally {
      operating.value = false
    }
  }

  return {
    operations,
    selectedRows,
    menu,
    confirm,
    operating,
    detailDialog,
    loadOperations,
    onSelectionChange,
    onContextMenu,
    closeMenu,
    onMenuSelect,
    onMenuDetail,
    onRowDblClick,
    executeOperation,
  }
}
