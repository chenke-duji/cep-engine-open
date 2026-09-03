<template>
  <div class="filter-bar panel">
    <el-form :inline="true" :model="form" class="filter-form">
      <el-form-item label="节点">
        <el-input v-model="form.node" placeholder="节点" clearable style="width: 140px" />
      </el-form-item>
      <el-form-item label="级别">
        <el-select v-model="form.severity" placeholder="全部" clearable style="width: 120px">
          <el-option v-for="s in severities" :key="s.value" :label="s.label" :value="s.value" />
        </el-select>
      </el-form-item>
      <el-form-item label="状态">
        <el-input v-model="form.status" placeholder="状态" clearable style="width: 120px" />
      </el-form-item>
      <el-form-item label="关键字">
        <el-input
          v-model="form.keyword"
          placeholder="对所有字段关键字匹配（本地过滤）"
          clearable
          style="width: 240px"
          @keyup.enter="onSearch"
        >
          <template #prefix><el-icon><Search /></el-icon></template>
        </el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" :icon="Search" @click="onSearch">查询</el-button>
        <el-button :icon="RefreshLeft" @click="onReset">重置</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script setup lang="ts">
import { reactive } from 'vue'
import { Search, RefreshLeft } from '@element-plus/icons-vue'

interface SearchCriteria {
  /** Merged MongoDB query JSON (node/severity/status), or undefined */
  filter?: string
  /** Free-text keyword matched locally across all event fields by the page. */
  keyword?: string
}

const emit = defineEmits<{
  (e: 'search', criteria: SearchCriteria): void
}>()

const form = reactive<{ node: string; severity?: number; status: string; keyword: string }>({
  node: '',
  severity: undefined,
  status: '',
  keyword: '',
})

const severities = [
  { value: 5, label: 'Critical' },
  { value: 4, label: 'Major' },
  { value: 3, label: 'Minor' },
  { value: 2, label: 'Warning' },
  { value: 1, label: 'Indeterminate' },
  { value: 0, label: 'Clear' },
]

function onSearch() {
  // node/severity/status -> backend MongoDB filter.
  const conds: Record<string, unknown>[] = []
  if (form.severity != null) conds.push({ severity: form.severity })
  const node = form.node.trim()
  if (node) conds.push({ node: { $regex: node, $options: 'i' } })
  const status = form.status.trim()
  if (status) conds.push({ status })

  let filter: string | undefined
  if (conds.length === 1) {
    filter = JSON.stringify(conds[0])
  } else if (conds.length > 1) {
    filter = JSON.stringify({ $and: conds })
  }
  // keyword is applied locally on the frontend (across all fields).
  emit('search', {
    filter,
    keyword: form.keyword.trim() || undefined,
  })
}

function onReset() {
  form.node = ''
  form.severity = undefined
  form.status = ''
  form.keyword = ''
  emit('search', {})
}
</script>

<style scoped>
.filter-bar {
  padding: 12px 16px 0;
  margin-bottom: 12px;
}
.filter-form :deep(.el-form-item) {
  margin-bottom: 12px;
}
</style>
