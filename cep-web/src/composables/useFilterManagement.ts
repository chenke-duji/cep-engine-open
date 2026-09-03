import { reactive } from 'vue'
import { ElMessage } from 'element-plus'
import type { FilterConfig } from '@/types'
import { createPref, updatePref } from '@/api/userprefs'

export function useFilterManagement() {
  const filterDialog = reactive<{
    visible: boolean
    editing: FilterConfig | null
    loading: boolean
  }>({ visible: false, editing: null, loading: false })

  function openFilterDialog() {
    filterDialog.editing = null
    filterDialog.visible = true
  }

  async function saveFilter(data: FilterConfig) {
    filterDialog.loading = true
    try {
      if (data.id) {
        await updatePref(data.id, {
          name: data.name,
          isDefault: data.isDefault,
          isPublic: data.isPublic,
          config: data.config,
        })
      } else {
        await createPref({
          type: 'filter',
          name: data.name,
          isDefault: data.isDefault,
          isPublic: data.isPublic,
          config: data.config,
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

  return {
    filterDialog,
    openFilterDialog,
    saveFilter,
  }
}
