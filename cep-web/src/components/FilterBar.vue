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
      <el-form-item label="域">
        <el-input v-model="form.domainId" placeholder="域 ID" clearable style="width: 120px" />
      </el-form-item>
      <el-form-item label="自定义过滤">
        <el-select
          v-model="selectedFilterId"
          placeholder="选择自定义过滤条件"
          clearable
          filterable
          style="width: 220px"
        >
          <el-option
            v-for="f in filters"
            :key="f.id"
            :label="`${f.name}${f.isPublic ? '（公共）' : ''}`"
            :value="f.id"
          />
        </el-select>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" :icon="Search" @click="onSearch">查询</el-button>
        <el-button :icon="RefreshLeft" @click="onReset">重置</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script setup lang="ts">
import { onMounted, reactive, ref } from 'vue'
import { Search, RefreshLeft } from '@element-plus/icons-vue'
import type { UserPref } from '@/types'
import { fetchPrefs } from '@/api/userprefs'

interface SearchCriteria {
  node?: string
  severity?: number
  status?: string
  domainId?: string
  /** Raw MongoDB query JSON selected by the user, or undefined */
  filter?: string
}

const emit = defineEmits<{
  (e: 'search', criteria: SearchCriteria): void
}>()

const form = reactive<{ node: string; severity?: number; status: string; domainId: string }>({
  node: '',
  severity: undefined,
  status: '',
  domainId: '',
})

const severities = [
  { value: 5, label: 'Critical' },
  { value: 4, label: 'Major' },
  { value: 3, label: 'Minor' },
  { value: 2, label: 'Warning' },
  { value: 1, label: 'Indeterminate' },
  { value: 0, label: 'Clear' },
]

const filters = ref<UserPref[]>([])
const selectedFilterId = ref<string>()

async function loadFilters() {
  try {
    filters.value = await fetchPrefs('filter')
  } catch {
    filters.value = []
  }
}

function onSearch() {
  const selected = filters.value.find((f) => f.id === selectedFilterId.value)
  const criteria: SearchCriteria = {
    node: form.node || undefined,
    severity: form.severity,
    status: form.status || undefined,
    domainId: form.domainId || undefined,
    filter: selected ? (selected.config.query as string) : undefined,
  }
  emit('search', criteria)
}

function onReset() {
  form.node = ''
  form.severity = undefined
  form.status = ''
  form.domainId = ''
  selectedFilterId.value = undefined
  emit('search', {})
}

onMounted(loadFilters)

defineExpose({ reload: loadFilters })
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
