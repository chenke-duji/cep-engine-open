<template>
  <el-dialog
    :model-value="visible"
    title="视图配置（列模型）"
    width="640px"
    @update:model-value="emit('close')"
  >
    <el-form label-width="70px">
      <el-form-item label="视图名称">
        <el-input v-model="form.name" placeholder="如：默认视图" style="width: 300px" />
      </el-form-item>

      <el-form-item label="列定义">
        <el-table :data="form.config.columns" size="small" border style="width: 100%">
          <el-table-column label="字段" width="220">
            <template #default="{ row }">
              <el-select v-model="row.field" size="small" style="width: 100%" @change="onFieldChange(row)">
                <el-option v-for="f in availableFields" :key="f" :label="f" :value="f" />
              </el-select>
            </template>
          </el-table-column>
          <el-table-column label="显示标题">
            <template #default="{ row }">
              <el-input v-model="row.title" size="small" />
            </template>
          </el-table-column>
          <el-table-column label="宽度" width="100">
            <template #default="{ row }">
              <el-input-number v-model="row.width" :min="60" :max="400" size="small" controls-position="right" />
            </template>
          </el-table-column>
          <el-table-column label="排序" width="70">
            <template #default="{ $index }">
              <el-button
                size="small"
                text
                :disabled="$index === 0"
                @click="moveUp($index)"
              >上移</el-button>
            </template>
          </el-table-column>
          <el-table-column label="" width="70">
            <template #default="{ $index }">
              <el-button size="small" type="danger" text @click="removeCol($index)">删除</el-button>
            </template>
          </el-table-column>
        </el-table>
        <el-button size="small" class="add-col-btn" @click="addCol">+ 添加列</el-button>
      </el-form-item>

      <el-form-item label="选项">
        <el-checkbox v-model="form.isDefault">设为默认视图</el-checkbox>
        <el-checkbox v-model="form.isPublic" :disabled="!isAdmin">设为公共视图</el-checkbox>
        <span v-if="!isAdmin" class="hint">（仅管理员可设公共）</span>
      </el-form-item>
    </el-form>

    <template #footer>
      <el-button @click="emit('close')">取消</el-button>
      <el-button type="primary" :loading="loading" @click="save">保存</el-button>
    </template>
  </el-dialog>
</template>

<script setup lang="ts">
import { reactive } from 'vue'
import { ElMessage } from 'element-plus'
import type { ViewConfig, ColumnDef } from '@/types'
import { useAuthStore } from '@/stores/auth'

const props = defineProps<{
  visible: boolean
  /** The view being edited (null => create new). */
  view: ViewConfig | null
  loading: boolean
}>()

const emit = defineEmits<{
  (e: 'close'): void
  (e: 'save', data: ViewConfig): void
}>()

const auth = useAuthStore()
const isAdmin = auth.isAdmin

const availableFields = [
  'identifier', 'node', 'nodeAlias', 'severity', 'summary', 'status',
  'alertGroup', 'alertGroupName', 'vendor', 'eventType',
  'specificTrap', 'firstOccurrence', 'lastOccurrence', 'tally',
  'receiveTime', 'clearTime', 'recoveryTime', 'eventClass', 'alertKey',
  'originalSeverity', 'originalSummary', 'siteNum', 'ticketId', 'agentType',
]

// The form is initialized once from the view prop. The parent forces a fresh
// mount (via :key) every time the dialog opens, so this state always reflects
// the view being edited and edits are never lost.
const form = reactive<{
  name: string
  isDefault: boolean
  isPublic: boolean
  config: { columns: ColumnDef[] }
}>(props.view
  ? {
      name: props.view.name,
      isDefault: props.view.isDefault,
      isPublic: props.view.isPublic,
      config: { columns: (props.view.config.columns || []).map((c) => ({ ...c })) },
    }
  : {
      name: '',
      isDefault: false,
      isPublic: false,
      config: { columns: defaultColumns() },
    })

function defaultColumns(): ColumnDef[] {
  return [
    { field: 'node', title: '节点', width: 160 },
    { field: 'severity', title: '级别', width: 120 },
    { field: 'summary', title: '摘要', width: 260 },
    { field: 'status', title: '状态', width: 100 },
    { field: 'lastOccurrence', title: '最近发生', width: 180, sortable: true },
  ]
}

/** Human-readable title for each available field (used when the user picks a field). */
const FIELD_TITLES: Record<string, string> = {
  identifier: '标识', node: '节点', nodeAlias: '节点别名', severity: '级别',
  summary: '摘要', status: '状态', alertGroup: '告警组', alertGroupName: '告警组名',
  vendor: '厂商', eventType: '事件类型', specificTrap: '特定陷阱',
  firstOccurrence: '首次发生', lastOccurrence: '最近发生', tally: '次数',
  receiveTime: '接收时间', clearTime: '清除时间', recoveryTime: '恢复时间',
  eventClass: '事件类', alertKey: '告警键', originalSeverity: '原始级别',
  originalSummary: '原始摘要', siteNum: '站点号', ticketId: '工单号', agentType: '采集类型',
}

/**
 * When the user picks a field for a column, auto-fill the title unless it was
 * already customized (i.e. not the default "摘要" placeholder).
 */
function onFieldChange(row: ColumnDef) {
  const suggested = FIELD_TITLES[row.field]
  if (!row.title || row.title === '摘要') {
    row.title = suggested || row.field
  }
}

function addCol() {
  form.config.columns.push({ field: 'summary', title: '摘要', width: 200 })
}

function removeCol(index: number) {
  form.config.columns.splice(index, 1)
}

function moveUp(index: number) {
  if (index <= 0) return
  const arr = form.config.columns
  ;[arr[index - 1], arr[index]] = [arr[index], arr[index - 1]]
}

function save() {
  if (!form.name.trim()) {
    ElMessage.warning('请输入视图名称')
    return
  }
  if (form.config.columns.length === 0) {
    ElMessage.warning('至少需要一列')
    return
  }
  emit('save', {
    id: props.view?.id,
    name: form.name.trim(),
    isDefault: form.isDefault,
    isPublic: form.isPublic,
    // Deep-copy the columns so the submitted payload reflects the current form
    // state and never shares a reference with the original view object.
    config: { columns: JSON.parse(JSON.stringify(form.config.columns)) },
  })
}
</script>

<style scoped>
.add-col-btn {
  margin-top: 8px;
}
.hint {
  font-size: 12px;
  color: var(--cep-text-muted);
}
</style>
