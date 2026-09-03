import { computed, reactive, ref } from 'vue'
import { ElMessage } from 'element-plus'
import type { ColumnDef, UserPref, ViewConfig } from '@/types'
import { fetchPrefs, createPref, updatePref } from '@/api/userprefs'
import { defaultColumns } from './useEventList'

export function useViewManagement() {
  const views = ref<UserPref[]>([])
  const currentViewId = ref<string>('')
  const viewDialog = reactive<{
    visible: boolean
    editing: ViewConfig | null
    loading: boolean
    dialogKey: number
  }>({ visible: false, editing: null, loading: false, dialogKey: 0 })

  const activeColumns = computed<ColumnDef[]>(() => {
    if (!currentViewId.value) return defaultColumns()
    const v = views.value.find((x) => x.id === currentViewId.value)
    const cols = v?.config?.columns as ColumnDef[] | undefined
    return cols && cols.length ? cols : defaultColumns()
  })

  function viewLabel(v: UserPref) {
    return `${v.name}${v.isPublic ? '（公共）' : ''}`
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

  function openViewDialog() {
    viewDialog.editing = null
    viewDialog.dialogKey++
    viewDialog.visible = true
  }

  function openEditViewDialog() {
    if (!currentViewId.value) return
    const v = views.value.find((x) => x.id === currentViewId.value)
    if (!v) return
    viewDialog.editing = {
      id: v.id,
      name: v.name,
      isDefault: v.isDefault,
      isPublic: v.isPublic,
      config: structuredClone(v.config || { columns: [] }) as ViewConfig['config'],
    }
    viewDialog.dialogKey++
    viewDialog.visible = true
  }

  async function saveView(data: ViewConfig, reloadEvents: () => void) {
    viewDialog.loading = true
    try {
      if (data.id) {
        await updatePref(data.id, {
          name: data.name,
          isDefault: data.isDefault,
          isPublic: data.isPublic,
          config: data.config,
        })
      } else {
        const created = await createPref({
          type: 'view',
          name: data.name,
          isDefault: data.isDefault,
          isPublic: data.isPublic,
          config: data.config,
        })
        currentViewId.value = created.id
      }
      ElMessage.success('视图已保存')
      viewDialog.visible = false
      await loadViews()
      reloadEvents()
    } catch {
      // handled
    } finally {
      viewDialog.loading = false
    }
  }

  return {
    views,
    currentViewId,
    activeColumns,
    viewDialog,
    viewLabel,
    loadViews,
    openViewDialog,
    openEditViewDialog,
    saveView,
  }
}
