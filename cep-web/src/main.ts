import { createApp } from 'vue'
import { createPinia } from 'pinia'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import zhCn from 'element-plus/es/locale/lang/zh-cn'

import App from './App.vue'
import router from './router'
import i18n from './i18n'
import './styles/main.css'

const app = createApp(App)

// Global error handler — catches unhandled errors in component lifecycle,
// watchers, and event handlers.
app.config.errorHandler = (err, _instance, info) => {
  console.error('[Vue Error]', info, err)
}

// E-02 Fix: Catch unhandled Promise rejections that slip past try/catch
// and Vue's errorHandler (e.g. async event listeners without await).
window.addEventListener('unhandledrejection', (event) => {
  console.error('[Unhandled Promise Rejection]', event.reason)
})

app.use(createPinia())
app.use(router)
app.use(i18n)
app.use(ElementPlus, { locale: zhCn })

app.mount('#app')
