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
              <el-select v-model="row.field" size="small" style="width: 100%">
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
import { reactive, watch } from 'vue'
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
  'domainId', 'alertGroup', 'alertGroupName', 'vendor', 'eventType',
  'specificTrap', 'firstOccurrence', 'lastOccurrence', 'tally',
  'receiveTime', 'clearTime', 'recoveryTime', 'eventClass', 'alertKey',
  'originalSeverity', 'originalSummary', 'siteNum', 'ticketId', 'agentType',
]

const form = reactive<{
  name: string
  isDefault: boolean
  isPublic: boolean
  config: { columns: ColumnDef[] }
}>({
  name: '',
  isDefault: false,
  isPublic: false,
  config: { columns: [] },
})

watch(
  () => props.visible,
  (v) => {
    if (!v) return
    if (props.view) {
      form.name = props.view.name
      form.isDefault = props.view.isDefault
      form.isPublic = props.view.isPublic
      form.config.columns = (props.view.config.columns || []).map((c) => ({ ...c }))
    } else {
      form.name = ''
      form.isDefault = false
      form.isPublic = false
      form.config.columns = defaultColumns()
    }
  },
)

function defaultColumns(): ColumnDef[] {
  return [
    { field: 'node', title: '节点', width: 160 },
    { field: 'severity', title: '级别', width: 120 },
    { field: 'summary', title: '摘要', width: 260 },
    { field: 'status', title: '状态', width: 100 },
    { field: 'lastOccurrence', title: '最近发生', width: 180, sortable: true },
  ]
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
    config: { columns: form.config.columns },
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
