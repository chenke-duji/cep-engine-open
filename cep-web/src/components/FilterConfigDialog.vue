<template>
  <el-dialog
    :model-value="visible"
    title="过滤条件配置"
    width="560px"
    @update:model-value="emit('close')"
  >
    <el-form label-width="80px">
      <el-form-item label="条件名称">
        <el-input v-model="form.name" placeholder="如：所有严重告警" />
      </el-form-item>
      <el-form-item label="查询语句">
        <el-input
          v-model="form.query"
          type="textarea"
          :rows="6"
          placeholder='MongoDB 查询 JSON，如：{"severity":{"$gte":4},"status":"Active"}'
        />
      </el-form-item>
      <el-form-item label="预览">
        <el-input :model-value="preview" disabled :rows="2" type="textarea" />
      </el-form-item>
      <el-form-item label="选项">
        <el-checkbox v-model="form.isDefault">设为默认过滤</el-checkbox>
        <el-checkbox v-model="form.isPublic" :disabled="!isAdmin">设为公共过滤</el-checkbox>
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
import { computed, reactive, watch } from 'vue'
import { ElMessage } from 'element-plus'
import type { FilterConfig } from '@/types'
import { useAuthStore } from '@/stores/auth'

const props = defineProps<{
  visible: boolean
  filter: FilterConfig | null
  loading: boolean
}>()

const emit = defineEmits<{
  (e: 'close'): void
  (e: 'save', data: FilterConfig): void
}>()

const auth = useAuthStore()
const isAdmin = computed(() => auth.isAdmin)

// Allowed MongoDB query operators — deny dangerous ones like $where, $function.
const ALLOWED_OPERATORS = new Set([
  '$eq', '$ne', '$gt', '$gte', '$lt', '$lte', '$in', '$nin',
  '$regex', '$options', '$exists', '$type', '$and', '$or', '$not',
  '$nor', '$size', '$all', '$mod',
])

/** Recursively validate that the parsed query only uses allowed operators. */
function validateQuery(obj: unknown): string | null {
  if (obj === null || typeof obj !== 'object') return null
  if (Array.isArray(obj)) {
    for (const item of obj) {
      const err = validateQuery(item)
      if (err) return err
    }
    return null
  }
  for (const key of Object.keys(obj as Record<string, unknown>)) {
    if (key.startsWith('$') && !ALLOWED_OPERATORS.has(key)) {
      return `不允许使用操作符: ${key}`
    }
    const err = validateQuery((obj as Record<string, unknown>)[key])
    if (err) return err
  }
  return null
}

const form = reactive<{
  name: string
  query: string
  isDefault: boolean
  isPublic: boolean
}>({
  name: '',
  query: '',
  isDefault: false,
  isPublic: false,
})

const preview = computed(() =>
  form.query ? `GET /api/v1/events/list?filter=${encodeURIComponent(form.query)}` : '（未填写）',
)

watch(
  () => props.visible,
  (v) => {
    if (!v) return
    if (props.filter) {
      form.name = props.filter.name
      form.query = props.filter.config.query || ''
      form.isDefault = props.filter.isDefault
      form.isPublic = props.filter.isPublic
    } else {
      form.name = ''
      form.query = ''
      form.isDefault = false
      form.isPublic = false
    }
  },
)

function save() {
  if (!form.name.trim()) {
    ElMessage.warning('请输入条件名称')
    return
  }
  if (!form.query.trim()) {
    ElMessage.warning('请输入 MongoDB 查询语句')
    return
  }
  // Validate it parses as JSON and only uses allowed operators.
  let parsed: unknown
  try {
    parsed = JSON.parse(form.query)
  } catch {
    ElMessage.error('查询语句不是合法的 JSON')
    return
  }
  const queryErr = validateQuery(parsed)
  if (queryErr) {
    ElMessage.error(queryErr)
    return
  }
  emit('save', {
    id: props.filter?.id,
    name: form.name.trim(),
    isDefault: form.isDefault,
    isPublic: form.isPublic,
    config: { query: form.query.trim() },
  })
}
</script>

<style scoped>
.hint {
  font-size: 12px;
  color: var(--cep-text-muted);
}
</style>
