import { createI18n } from 'vue-i18n'

/**
 * E-09: vue-i18n infrastructure.
 *
 * Currently only zh-CN is provided (the app's sole language). This setup
 * establishes the i18n plumbing so that new locales can be added by
 * extending the `messages` object and registering a new locale.
 *
 * Migration of hardcoded strings is incremental — key UI surfaces (login,
 * main navigation, common actions) are internationalized first; remaining
 * strings can be migrated without structural changes.
 */
const i18n = createI18n({
  legacy: false,
  locale: 'zh-CN',
  fallbackLocale: 'zh-CN',
  messages: {
    'zh-CN': {
      app: {
        title: 'CEP 事件管理',
        subtitle: '集中式事件管理平台 · 事件接入与处理引擎',
      },
      login: {
        title: 'CEP 事件管理控制台',
        username: '用户名',
        password: '密码',
        submit: '登 录',
        hint: '首次使用请修改默认密码，确保账户安全。',
        cooldown: '请等待 {seconds}s',
      },
      nav: {
        events: '事件列表',
        unresolved: '未解析事件',
      },
      action: {
        search: '查询',
        reset: '重置',
        refresh: '刷新',
        newView: '新建视图',
        edit: '编辑',
        manageFilter: '管理过滤',
        timeFormat: '时间格式',
        logout: '退出登录',
      },
      common: {
        total: '共 {count} 条',
        autoRefresh: '自动刷新',
        cancel: '取消',
        save: '保存',
        apply: '应用',
      },
    },
  },
})

export default i18n
