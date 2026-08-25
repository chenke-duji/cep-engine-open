<template>
  <el-dialog
    :model-value="visible"
    :title="operation ? operation.menuLabel : ''"
    width="420px"
    @update:model-value="emit('close')"
  >
    <div class="confirm-body">
      <p>{{ operation?.confirmMessage || '确认执行该操作？' }}</p>
      <p class="confirm-count">将对已选中的 <b>{{ selectedCount }}</b> 条事件执行该操作。</p>
    </div>
    <template #footer>
      <el-button @click="emit('close')">取消</el-button>
      <el-button type="primary" :loading="loading" @click="confirm">
        确认执行
      </el-button>
    </template>
  </el-dialog>
</template>

<script setup lang="ts">
import type { Operation } from '@/types'

defineProps<{
  visible: boolean
  operation: Operation | null
  selectedCount: number
  loading: boolean
}>()

const emit = defineEmits<{
  (e: 'close'): void
  (e: 'confirm'): void
}>()

function confirm() {
  emit('confirm')
}
</script>

<style scoped>
.confirm-body p {
  margin: 0 0 8px;
}
.confirm-count {
  color: var(--cep-text-secondary);
}
</style>
