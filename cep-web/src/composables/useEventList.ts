import { computed, onUnmounted, ref, watch, type Ref } from 'vue'
import { ElMessage } from 'element-plus'
import type { AlarmEvent, ColumnDef } from '@/types'
import { fetchEvents } from '@/api/event'

export interface UseEventListOptions {
  /** Selected rows ref — used for preserve-selection-on-auto-refresh. */
  selectedRows: Ref<AlarmEvent[]>
  /** Table component ref — needed to call clearSelection(). */
  tableRef: Ref<{ clearSelection: () => void } | undefined>
}

export function useEventList(options: UseEventListOptions) {
  const { selectedRows, tableRef } = options

  const events = ref<AlarmEvent[]>([])
  const total = ref(0)
  const page = ref(1)
  const pageSize = ref(50)
  const loading = ref(false)
  const autoRefresh = ref(false)
  const currentFilter = ref<string | undefined>(undefined)
  const filterKeyword = ref('')

  let refreshTimer: number | undefined
  let abortController: AbortController | undefined
  let currentRequestId = 0
  let preserveSelectionOnLoad = false

  const visibleEvents = computed<AlarmEvent[]>(() => {
    const kw = filterKeyword.value
    if (!kw) return events.value
    const lower = kw.toLowerCase()
    return events.value.filter((e) => JSON.stringify(e).toLowerCase().includes(lower))
  })

  async function loadEvents() {
    const requestId = ++currentRequestId
    abortController?.abort()
    abortController = new AbortController()
    const wasPreserving = preserveSelectionOnLoad
    preserveSelectionOnLoad = false

    loading.value = true
    try {
      const res = await fetchEvents(
        {
          page: page.value,
          size: pageSize.value,
          filter: currentFilter.value,
          sortBy: 'lastOccurrence',
          sortDesc: true,
        },
        abortController.signal,
      )
      if (requestId !== currentRequestId) return
      events.value = res.items
      total.value = res.total
      if (wasPreserving) {
        const prevIds = new Set(selectedRows.value.map((r) => r.identifier))
        if (prevIds.size > 0) {
          selectedRows.value = res.items.filter((e) => prevIds.has(e.identifier))
        }
      } else {
        selectedRows.value = []
        tableRef.value?.clearSelection()
      }
      if (res.collectionExists === false) {
        ElMessage.warning(res.message || '事件集合尚不存在，可能还没有 trap/syslog 事件写入。')
      }
    } catch (err) {
      if (requestId !== currentRequestId) return
      if (err instanceof Error && err.name === 'CanceledError') return
      // message handled by interceptor
    } finally {
      if (requestId === currentRequestId) {
        loading.value = false
      }
    }
  }

  function onSearch(criteria: { filter?: string; keyword?: string }) {
    currentFilter.value = criteria.filter
    filterKeyword.value = criteria.keyword || ''
    page.value = 1
    loadEvents()
  }

  function onSizeChange() {
    page.value = 1
    loadEvents()
  }

  function startAutoRefresh() {
    stopAutoRefresh()
    refreshTimer = window.setInterval(() => {
      preserveSelectionOnLoad = true
      loadEvents()
    }, 15000)
  }

  function stopAutoRefresh() {
    if (refreshTimer) {
      window.clearInterval(refreshTimer)
      refreshTimer = undefined
    }
  }

  watch(autoRefresh, (v) => {
    if (v) startAutoRefresh()
    else stopAutoRefresh()
  })

  onUnmounted(stopAutoRefresh)

  return {
    events,
    total,
    page,
    pageSize,
    loading,
    autoRefresh,
    currentFilter,
    filterKeyword,
    visibleEvents,
    loadEvents,
    onSearch,
    onSizeChange,
  }
}

/** Default column set used when no custom view is selected. */
export function defaultColumns(): ColumnDef[] {
  return [
    { field: 'node', title: '节点', width: 160 },
    { field: 'severity', title: '级别', width: 120 },
    { field: 'summary', title: '摘要', width: 260 },
    { field: 'status', title: '状态', width: 100 },
    { field: 'lastOccurrence', title: '最近发生', width: 180, sortable: true },
  ]
}
