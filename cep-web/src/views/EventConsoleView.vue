<template>
  <div class="page">
    <!-- Top navigation -->
    <header class="topbar">
      <div class="topbar-left">
        <span class="app-title">CEP 事件管理</span>
        <el-divider direction="vertical" />
        <el-radio-group v-model="activeView" size="small">
          <el-radio-button value="events">事件列表</el-radio-button>
          <el-radio-button value="unresolved">未解析事件</el-radio-button>
        </el-radio-group>
        <template v-if="activeView === 'events'">
          <el-divider direction="vertical" />
          <span class="view-label">视图：</span>
          <el-select
            v-model="currentViewId"
            size="small"
            style="width: 160px"
            @change="onViewChange"
          >
            <el-option v-for="v in views" :key="v.id" :label="viewLabel(v)" :value="v.id" />
          </el-select>
          <el-button size="small" type="primary" :icon="Plus" @click="openViewDialog()">新建视图</el-button>
          <el-button size="small" :icon="Edit" :disabled="!currentViewId" @click="openEditViewDialog()">编辑</el-button>
          <el-button size="small" :icon="Filter" @click="openFilterDialog()">管理过滤</el-button>
        </template>
      </div>
      <div class="topbar-right">
        <el-switch
          v-model="autoRefresh"
          active-text="自动刷新"
          size="small"
          style="margin-right: 12px"
        />
        <el-button size="small" :icon="Refresh" @click="loadEvents">刷新</el-button>
        <el-button size="small" :icon="Clock" @click="openTimeDialog">时间格式</el-button>
        <el-dropdown @command="onUserCommand">
          <span class="user-name">
            <el-icon><User /></el-icon>
            {{ auth.displayName }}
          </span>
          <template #dropdown>
            <el-dropdown-menu>
              <el-dropdown-item command="logout">退出登录</el-dropdown-item>
            </el-dropdown-menu>
          </template>
        </el-dropdown>
      </div>
    </header>

    <!-- Filter bar (events view) -->
    <div v-if="activeView === 'events'" class="filter-area">
      <FilterBar ref="filterBarRef" @search="onSearch" />
    </div>

    <!-- Event table (events view) -->
    <div v-if="activeView === 'events'" class="page-body table-area">
      <EventTable
        ref="tableRef"
        :events="visibleEvents"
        :columns="activeColumns"
        :loading="loading"
        @selection-change="onSelectionChange"
        @context-menu="onContextMenu"
        @row-dblclick="onRowDblClick"
      />
      <div class="pagination-bar">
        <span class="total">共 {{ total }} 条</span>
        <el-pagination
          v-model:current-page="page"
          v-model:page-size="pageSize"
          :total="total"
          :page-sizes="[20, 50, 100, 200]"
          layout="total, sizes, prev, pager, next"
          @current-change="loadEvents"
          @size-change="onSizeChange"
        />
      </div>
    </div>

    <!-- Unresolved events view -->
    <div v-if="activeView === 'unresolved'" class="page-body">
      <UnresolvedEventsPanel />
    </div>

    <!-- Right-click context menu -->
    <OperationContextMenu
      :visible="menu.visible"
      :x="menu.x"
      :y="menu.y"
      :operations="operations"
      :selected-count="selectedRows.length"
      :selected-rows="selectedRows"
      @select="onMenuSelect"
      @detail="onMenuDetail"
      @close="closeMenu"
    />

    <!-- Operation confirm dialog -->
    <OperateConfirmDialog
      :visible="confirm.visible"
      :operation="confirm.operation"
      :selected-count="selectedRows.length"
      :loading="operating"
      @close="confirm.visible = false"
      @confirm="executeOperation"
    />

    <!-- View config dialog -->
    <ViewConfigDialog
      :key="viewDialog.dialogKey"
      :visible="viewDialog.visible"
      :view="viewDialog.editing"
      :loading="viewDialog.loading"
      @close="viewDialog.visible = false"
      @save="saveView"
    />

    <!-- Filter config dialog -->
    <FilterConfigDialog
      :visible="filterDialog.visible"
      :filter="filterDialog.editing"
      :loading="filterDialog.loading"
      @close="filterDialog.visible = false"
      @save="saveFilter"
    />

    <!-- Time format dialog -->
    <TimeFormatDialog
      :visible="timeDialog.visible"
      :current="timeState"
      :loading="timeDialog.loading"
      @close="timeDialog.visible = false"
      @apply="applyTimeFormat"
    />

    <!-- Event detail dialog -->
    <EventDetailDialog
      :visible="detailDialog.visible"
      :event="detailDialog.event"
      @close="detailDialog.visible = false"
    />

    <!-- Page footer: build identity -->
    <footer class="page-footer">
      <span v-if="buildInfo" class="footer-build">
        CEP Engine v{{ buildInfo.version }} &middot; 构建 {{ buildInfo.buildTime }}
      </span>
      <span v-else class="footer-build">CEP Engine</span>
    </footer>
  </div>
</template>

<script setup lang="ts">
import { computed, onMounted, onUnmounted, reactive, ref, watch } from 'vue'
import { useRouter } from 'vue-router'
import { ElMessage, ElMessageBox } from 'element-plus'
import {
  Edit, Filter, Refresh, Clock, User, Plus,
} from '@element-plus/icons-vue'
import type {
  AlarmEvent, ColumnDef, Operation, ViewConfig,
  FilterConfig, TimeFormatConfig, UserPref,
} from '@/types'
import { fetchEvents, fetchOperations, operate } from '@/api/event'
import {
  fetchPrefs, createPref, updatePref, deletePref, fetchDefaultTimeFormat,
} from '@/api/userprefs'
import { setTimeFormat, getTimeFormat } from '@/utils/time'
import { fetchBuildInfo, type BuildInfo } from '@/api/version'
import { useAuthStore } from '@/stores/auth'
import EventTable from '@/components/EventTable.vue'
import FilterBar from '@/components/FilterBar.vue'
import OperationContextMenu from '@/components/OperationContextMenu.vue'
import OperateConfirmDialog from '@/components/OperateConfirmDialog.vue'
import EventDetailDialog from '@/components/EventDetailDialog.vue'
import UnresolvedEventsPanel from '@/components/UnresolvedEventsPanel.vue'
import ViewConfigDialog from '@/components/ViewConfigDialog.vue'
import FilterConfigDialog from '@/components/FilterConfigDialog.vue'
import TimeFormatDialog from '@/components/TimeFormatDialog.vue'

const router = useRouter()
const auth = useAuthStore()

// ---- View switcher: 'events' | 'unresolved' ----
const activeView = ref<'events' | 'unresolved'>('events')

// ---- Event list state ----
const events = ref<AlarmEvent[]>([])
const total = ref(0)
const page = ref(1)
const pageSize = ref(50)
const loading = ref(false)
const autoRefresh = ref(false)
const currentFilter = ref<string | undefined>(undefined)
// Free-text keyword matched locally across ALL fields of the currently loaded
// rows (no extra backend request).
const filterKeyword = ref('')
let refreshTimer: number | undefined

/** Rows actually shown in the table: server rows filtered by the local keyword. */
const visibleEvents = computed<AlarmEvent[]>(() => {
  const kw = filterKeyword.value
  if (!kw) return events.value
  const lower = kw.toLowerCase()
  return events.value.filter((e) => keywordMatches(e, lower))
})

/** Does any scalar field of the event contain the (lower-cased) keyword? */
function keywordMatches(e: AlarmEvent, lower: string): boolean {
  const val: unknown[] = [e]
  while (val.length) {
    const item = val.pop()
    if (item == null) continue
    if (typeof item === 'string') {
      if (item.toLowerCase().includes(lower)) return true
      continue
    }
    if (typeof item === 'number' || typeof item === 'boolean') {
      if (String(item).toLowerCase().includes(lower)) return true
      continue
    }
    if (typeof item === 'object') {
      // Walk dynamicFields / nested objects without infinite recursion.
      for (const v of Object.values(item as Record<string, unknown>)) {
        val.push(v)
      }
    }
  }
  return false
}

// ---- Views ----
const views = ref<UserPref[]>([])
const currentViewId = ref<string>('')
const activeColumns = computed<ColumnDef[]>(() => {
  if (!currentViewId.value) return defaultColumns()
  const v = views.value.find((x) => x.id === currentViewId.value)
  const cols = v?.config?.columns as ColumnDef[] | undefined
  return cols && cols.length ? cols : defaultColumns()
})

// ---- Build info (footer) ----
const buildInfo = ref<BuildInfo | null>(null)

// ---- Operations & selection ----
const operations = ref<Operation[]>([])
const selectedRows = ref<AlarmEvent[]>([])
const menu = reactive<{ visible: boolean; x: number; y: number }>({
  visible: false, x: 0, y: 0,
})
const confirm = reactive<{ visible: boolean; operation: Operation | null }>({
  visible: false, operation: null,
})
const operating = ref(false)
const detailDialog = reactive<{ visible: boolean; event: AlarmEvent | null }>({
  visible: false, event: null,
})

// ---- Dialogs ----
const viewDialog = reactive<{ visible: boolean; editing: ViewConfig | null; loading: boolean; dialogKey: number }>({
  visible: false, editing: null, loading: false, dialogKey: 0,
})
const filterDialog = reactive<{ visible: boolean; editing: FilterConfig | null; loading: boolean }>({
  visible: false, editing: null, loading: false,
})
const timeDialog = reactive<{ visible: boolean; loading: boolean }>({ visible: false, loading: false })
const timeState = ref(getTimeFormat())

const tableRef = ref<InstanceType<typeof EventTable>>()
const filterBarRef = ref<InstanceType<typeof FilterBar>>()

function defaultColumns(): ColumnDef[] {
  return [
    { field: 'node', title: '节点', width: 160 },
    { field: 'severity', title: '级别', width: 120 },
    { field: 'summary', title: '摘要', width: 260 },
    { field: 'status', title: '状态', width: 100 },
    { field: 'lastOccurrence', title: '最近发生', width: 180, sortable: true },
  ]
}

function viewLabel(v: UserPref) {
  return `${v.name}${v.isPublic ? '（公共）' : ''}`
}

// ---- Data loading ----
async function loadOperations() {
  try {
    operations.value = await fetchOperations()
  } catch {
    operations.value = []
  }
}

async function loadViews() {
  try {
    views.value = await fetchPrefs('view')
    if (!currentViewId.value && views.value.length) {
      currentViewId.value = views.value[0].id
    }
  } catch {
    views.value = []
  }
}

async function loadTimeFormat() {
  try {
    const t = await fetchDefaultTimeFormat()
    setTimeFormat(t.format, t.timezone, t.showTimezone)
    timeState.value = { format: t.format, timezone: t.timezone, showTimezone: t.showTimezone }
  } catch {
    timeState.value = getTimeFormat()
  }
}

async function loadEvents() {
  loading.value = true
  try {
    const res = await fetchEvents({
      page: page.value,
      size: pageSize.value,
      filter: currentFilter.value,
      sortBy: 'lastOccurrence',
      sortDesc: true,
    })
    events.value = res.items
    total.value = res.total
    selectedRows.value = []
    tableRef.value?.clearSelection()
    if (res.collectionExists === false) {
      ElMessage.warning(res.message || '事件集合尚不存在，可能还没有 trap/syslog 事件写入。')
    }
  } catch {
    // message handled by interceptor
  } finally {
    loading.value = false
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

function onViewChange() {
  loadEvents()
}

// ---- Selection & context menu ----
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

/** Show the detail dialog for the selected event(s). */
function onMenuDetail() {
  closeMenu()
  if (selectedRows.value.length === 0) return
  detailDialog.event = selectedRows.value[0]
  detailDialog.visible = true
}

/** Double-clicking a row opens the detail dialog for that row. */
function onRowDblClick(row: AlarmEvent) {
  detailDialog.event = row
  detailDialog.visible = true
}

async function executeOperation() {
  if (!confirm.operation || selectedRows.value.length === 0) return
  operating.value = true
  try {
    const ids = selectedRows.value.map((r) => r.identifier)
    const res = await operate(confirm.operation.name, ids)
    ElMessage.success(
      `操作成功：匹配 ${res.matched} 条，更新 ${res.modified} 条`,
    )
    confirm.visible = false
    loadEvents()
  } catch {
    // handled by interceptor
  } finally {
    operating.value = false
  }
}

// ---- View management ----
function openViewDialog() {
  viewDialog.editing = null
  viewDialog.dialogKey++
  viewDialog.visible = true
}

/** Open the dialog in "edit" mode for the currently selected view. */
function openEditViewDialog() {
  if (!currentViewId.value) return
  const v = views.value.find((x) => x.id === currentViewId.value)
  if (!v) return
  viewDialog.editing = {
    id: v.id,
    name: v.name,
    isDefault: v.isDefault,
    isPublic: v.isPublic,
    config: JSON.parse(JSON.stringify(v.config || { columns: [] })) as ViewConfig['config'],
  }
  viewDialog.dialogKey++
  viewDialog.visible = true
}

async function saveView(data: ViewConfig) {
  viewDialog.loading = true
  try {
    if (data.id) {
      await updatePref(data.id, {
        name: data.name, isDefault: data.isDefault, isPublic: data.isPublic,
        config: data.config,
      })
    } else {
      const created = await createPref({
        type: 'view', name: data.name, isDefault: data.isDefault,
        isPublic: data.isPublic, config: data.config,
      })
      currentViewId.value = created.id
    }
    ElMessage.success('视图已保存')
    viewDialog.visible = false
    await loadViews()
    loadEvents()
  } catch {
    // handled
  } finally {
    viewDialog.loading = false
  }
}

// ---- Filter management ----
function openFilterDialog() {
  filterDialog.editing = null
  filterDialog.visible = true
}

async function saveFilter(data: FilterConfig) {
  filterDialog.loading = true
  try {
    if (data.id) {
      await updatePref(data.id, {
        name: data.name, isDefault: data.isDefault, isPublic: data.isPublic,
        config: data.config,
      })
    } else {
      await createPref({
        type: 'filter', name: data.name, isDefault: data.isDefault,
        isPublic: data.isPublic, config: data.config,
      })
    }
    ElMessage.success('过滤条件已保存')
    filterDialog.visible = false
  } catch {
    // handled
  } finally {
    filterDialog.loading = false
  }
}

// ---- Time format ----
function openTimeDialog() {
  timeState.value = getTimeFormat()
  timeDialog.visible = true
}

async function applyTimeFormat(data: TimeFormatConfig, persist: boolean) {
  if (!persist) {
    // Already applied in-memory by the dialog.
    ElMessage.success('时间格式已应用（本会话）')
    return
  }
  timeDialog.loading = true
  try {
    const existing = (await fetchPrefs('timeformat')).find((p) => p.name === 'default-time-format')
    if (existing) {
      await updatePref(existing.id, {
        name: 'default-time-format', isDefault: true, isPublic: false, config: data.config,
      })
    } else {
      await createPref({
        type: 'timeformat', name: 'default-time-format', isDefault: true,
        isPublic: false, config: data.config,
      })
    }
    ElMessage.success('时间格式已保存为默认设置')
  } catch {
    // handled
  } finally {
    timeDialog.loading = false
  }
}

// ---- User commands ----
async function onUserCommand(cmd: string) {
  if (cmd === 'logout') {
    try {
      await ElMessageBox.confirm('确定退出登录吗？', '提示', { type: 'warning' })
      auth.logout()
      router.replace('/login')
    } catch {
      // user cancelled
    }
  }
}

// ---- Auto refresh ----
function startAutoRefresh() {
  stopAutoRefresh()
  refreshTimer = window.setInterval(() => loadEvents(), 15000)
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

onMounted(async () => {
  await Promise.all([loadViews(), loadOperations(), loadTimeFormat()])
  loadEvents()
  buildInfo.value = await fetchBuildInfo()
})

onUnmounted(stopAutoRefresh)
</script>

<style scoped>
.page-footer {
  flex-shrink: 0;
  display: flex;
  align-items: center;
  justify-content: flex-end;
  height: 26px;
  padding: 0 16px;
  font-size: 12px;
  color: var(--cep-text-muted, #6b7689);
  border-top: 1px solid var(--cep-border, #222b3c);
  background: var(--cep-bg-panel, #161d2b);
}
.footer-build {
  white-space: nowrap;
}
.topbar {
  display: flex;
  align-items: center;
  justify-content: space-between;
  height: 52px;
  padding: 0 16px;
  background: var(--cep-bg-panel);
  border-bottom: 1px solid var(--cep-border);
  flex-shrink: 0;
}

.topbar-left,
.topbar-right {
  display: flex;
  align-items: center;
  gap: 8px;
}

.app-title {
  font-size: 16px;
  font-weight: 600;
  color: var(--cep-text);
}

.view-label {
  color: var(--cep-text-secondary);
}

.user-name {
  display: inline-flex;
  align-items: center;
  gap: 4px;
  cursor: pointer;
  color: var(--cep-text);
  outline: none;
}

.filter-area {
  flex-shrink: 0;
  padding: 12px 16px 0;
}

.table-area {
  min-height: 0;
}

.pagination-bar {
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 10px 4px 0;
}

.total {
  color: var(--cep-text-secondary);
}
</style>
