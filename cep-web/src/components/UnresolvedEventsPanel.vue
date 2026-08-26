<template>
  <div class="unresolved-panel">
    <div class="panel-header">
      <span class="panel-title">未解析事件</span>
      <span class="panel-desc">
        这些事件未被任何解析脚本识别（如未支持的 MIB trap），原始内容已保存以便排查与后续补充支持。
      </span>
      <el-button size="small" :icon="Refresh" @click="load">刷新</el-button>
    </div>

    <el-table
      :data="events"
      v-loading="loading"
      border
      size="small"
      class="unresolved-table"
    >
      <el-table-column label="接收时间" width="170">
        <template #default="{ row }">
          <span>{{ formatTime(row.receivedAt) }}</span>
        </template>
      </el-table-column>
      <el-table-column label="来源" width="120">
        <template #default="{ row }">{{ row.source || '-' }}</template>
      </el-table-column>
      <el-table-column label="Source IP" width="130">
        <template #default="{ row }">{{ row.sourceIp || '-' }}</template>
      </el-table-column>
      <el-table-column label="原因" width="200" show-overflow-tooltip>
        <template #default="{ row }">{{ row.reason || '-' }}</template>
      </el-table-column>
      <el-table-column label="原始内容" min-width="320">
        <template #default="{ row }">
          <el-button
            size="small"
            text
            type="primary"
            @click="showRaw(row)"
          >查看原始事件</el-button>
        </template>
      </el-table-column>
    </el-table>

    <div class="pagination-bar">
      <span class="total">共 {{ total }} 条</span>
      <el-pagination
        v-model:current-page="page"
        v-model:page-size="pageSize"
        :total="total"
        :page-sizes="[20, 50, 100]"
        layout="total, sizes, prev, pager, next"
        @current-change="load"
        @size-change="onSizeChange"
      />
    </div>

    <!-- Raw event dialog -->
    <el-dialog
      v-model="dialog.visible"
      title="未解析事件 - 原始内容"
      width="760px"
    >
      <el-descriptions :column="1" border size="small">
        <el-descriptions-item label="来源">
          {{ dialog.event?.source || '-' }}
        </el-descriptions-item>
        <el-descriptions-item label="Source IP">
          {{ dialog.event?.sourceIp || '-' }}
        </el-descriptions-item>
        <el-descriptions-item label="接收时间">
          {{ formatTime(dialog.event?.receivedAt) }}
        </el-descriptions-item>
        <el-descriptions-item label="原因">
          {{ dialog.event?.reason || '-' }}
        </el-descriptions-item>
      </el-descriptions>
      <pre class="raw-json">{{ prettyRaw }}</pre>
    </el-dialog>
  </div>
</template>

<script setup lang="ts">
import { onMounted, reactive, ref } from 'vue'
import { Refresh } from '@element-plus/icons-vue'
import { fetchUnresolved, type UnresolvedEvent } from '@/api/event'
import { formatTimestamp } from '@/utils/time'

const events = ref<UnresolvedEvent[]>([])
const total = ref(0)
const page = ref(1)
const pageSize = ref(50)
const loading = ref(false)

const dialog = reactive<{ visible: boolean; event: UnresolvedEvent | null }>({
  visible: false,
  event: null,
})

const prettyRaw = ref('')

function formatTime(v: number | undefined): string {
  if (!v) return ''
  return formatTimestamp(v)
}

async function load() {
  loading.value = true
  try {
    const res = await fetchUnresolved({ page: page.value, size: pageSize.value })
    events.value = res.items
    total.value = res.total
  } catch {
    // handled by interceptor
  } finally {
    loading.value = false
  }
}

function onSizeChange() {
  page.value = 1
  load()
}

function showRaw(row: UnresolvedEvent) {
  dialog.event = row
  dialog.visible = true
  if (row.rawJson) {
    try {
      prettyRaw.value = JSON.stringify(JSON.parse(row.rawJson), null, 2)
    } catch {
      prettyRaw.value = row.rawJson
    }
  } else {
    prettyRaw.value = '(无原始内容)'
  }
}

onMounted(load)

defineExpose({ load })
</script>

<style scoped>
.unresolved-panel {
  padding: 12px 16px;
}

.panel-header {
  display: flex;
  align-items: center;
  gap: 12px;
  margin-bottom: 12px;
}

.panel-title {
  font-size: 15px;
  font-weight: 600;
}

.panel-desc {
  flex: 1;
  color: var(--cep-text-secondary);
  font-size: 12px;
}

.unresolved-table {
  border-radius: 6px;
  overflow: hidden;
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

.raw-json {
  margin-top: 12px;
  padding: 12px;
  background: #0f1420;
  border: 1px solid var(--cep-border);
  border-radius: 6px;
  max-height: 360px;
  overflow: auto;
  font-size: 12px;
  line-height: 1.5;
  white-space: pre-wrap;
  word-break: break-all;
}
</style>
