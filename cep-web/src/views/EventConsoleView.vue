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
      @confirm="onExecuteOperation"
    />

    <!-- View config dialog -->
    <ViewConfigDialog
      :key="viewDialog.dialogKey"
      :visible="viewDialog.visible"
      :view="viewDialog.editing"
      :loading="viewDialog.loading"
      @close="viewDialog.visible = false"
      @save="onSaveView"
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
import { onMounted, ref } from 'vue'
import { useRouter } from 'vue-router'
import { ElMessageBox } from 'element-plus'
import {
  Edit, Filter, Refresh, Clock, User, Plus,
} from '@element-plus/icons-vue'
import type { ViewConfig, FilterConfig, TimeFormatConfig } from '@/types'
import { fetchBuildInfo, type BuildInfo } from '@/api/version'
import { useAuthStore } from '@/stores/auth'
import { useEventList } from '@/composables/useEventList'
import { useEventOperations } from '@/composables/useEventOperations'
import { useViewManagement } from '@/composables/useViewManagement'
import { useFilterManagement } from '@/composables/useFilterManagement'
import { useTimeFormat } from '@/composables/useTimeFormat'
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

// ---- Table ref (shared by event list & operations) ----
const tableRef = ref<InstanceType<typeof EventTable>>()
const filterBarRef = ref<InstanceType<typeof FilterBar>>()

// ---- Composables ----
const ops = useEventOperations()
const {
  operations, selectedRows, menu, confirm, operating, detailDialog,
  loadOperations, onSelectionChange, onContextMenu, closeMenu,
  onMenuSelect, onMenuDetail, onRowDblClick, executeOperation,
} = ops

const eventList = useEventList({
  selectedRows,
  tableRef: tableRef as unknown as import('vue').Ref<{ clearSelection: () => void } | undefined>,
})
const {
  total, page, pageSize, loading, autoRefresh,
  visibleEvents, loadEvents, onSearch, onSizeChange,
} = eventList

const {
  views, currentViewId, activeColumns, viewDialog,
  viewLabel, loadViews, openViewDialog, openEditViewDialog, saveView,
} = useViewManagement()

const {
  filterDialog, openFilterDialog, saveFilter,
} = useFilterManagement()

const {
  timeDialog, timeState, loadTimeFormat, openTimeDialog, applyTimeFormat,
} = useTimeFormat()

// ---- Build info (footer) ----
const buildInfo = ref<BuildInfo | null>(null)

function onViewChange() {
  loadEvents()
}

// ---- Wrapper functions for composable callbacks ----
function onExecuteOperation() {
  executeOperation(loadEvents)
}

function onSaveView(data: ViewConfig) {
  saveView(data, loadEvents)
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

// ---- Lifecycle ----
onMounted(async () => {
  await Promise.all([loadViews(), loadOperations(), loadTimeFormat()])
  loadEvents()
  buildInfo.value = await fetchBuildInfo()
})

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
