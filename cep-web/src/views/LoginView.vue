<template>
  <div class="login-wrap">
    <div class="login-panel panel">
      <div class="login-brand">
        <div class="logo">CEP</div>
        <h1>{{ t('login.title') }}</h1>
        <p>{{ t('app.subtitle') }}</p>
      </div>
      <el-form
        :model="form"
        @submit.prevent="onSubmit"
        size="large"
        class="login-form"
      >
        <el-form-item>
          <el-input
            v-model="form.username"
            :placeholder="t('login.username')"
            :prefix-icon="User"
            autocomplete="username"
          />
        </el-form-item>
        <el-form-item>
          <el-input
            v-model="form.password"
            type="password"
            :placeholder="t('login.password')"
            :prefix-icon="Lock"
            show-password
            autocomplete="current-password"
            @keyup.enter="onSubmit"
          />
        </el-form-item>
        <el-form-item>
          <el-button
            type="primary"
            native-type="submit"
            :loading="loading"
            :disabled="cooldown > 0"
            class="login-btn"
          >
            {{ cooldown > 0 ? t('login.cooldown', { seconds: cooldown }) : t('login.submit') }}
          </el-button>
        </el-form-item>
      </el-form>
      <div class="login-hint">
        {{ t('login.hint') }}
      </div>
    </div>
  </div>
</template>

<script setup lang="ts">
import { reactive, ref, onUnmounted } from 'vue'
import { useRouter, useRoute } from 'vue-router'
import { useI18n } from 'vue-i18n'
import { ElMessage } from 'element-plus'
import { User, Lock } from '@element-plus/icons-vue'
import { useAuthStore } from '@/stores/auth'

const { t } = useI18n()
const router = useRouter()
const route = useRoute()
const auth = useAuthStore()

const form = reactive({ username: '', password: '' })
const loading = ref(false)

// ---- Brute-force protection (client-side) ----
const MAX_ATTEMPTS = 5
const COOLDOWN_SECONDS = 30
const failCount = ref(0)
const cooldown = ref(0)
let cooldownTimer: ReturnType<typeof setInterval> | undefined

function startCooldown() {
  cooldown.value = COOLDOWN_SECONDS
  cooldownTimer = setInterval(() => {
    cooldown.value--
    if (cooldown.value <= 0) {
      if (cooldownTimer) clearInterval(cooldownTimer)
      cooldownTimer = undefined
    }
  }, 1000)
}

onUnmounted(() => {
  if (cooldownTimer) clearInterval(cooldownTimer)
})

/** Validate that the redirect target is a safe same-origin path. */
function safeRedirect(redirect: string): string {
  if (redirect && redirect.startsWith('/') && !redirect.startsWith('//')) {
    return redirect
  }
  return '/'
}

async function onSubmit() {
  if (cooldown.value > 0) return
  if (!form.username || !form.password) {
    ElMessage.warning('请输入用户名和密码')
    return
  }
  loading.value = true
  try {
    await auth.login(form.username, form.password)
    failCount.value = 0
    ElMessage.success('登录成功')
    const redirect = safeRedirect((route.query.redirect as string) || '/')
    router.replace(redirect)
  } catch {
    failCount.value++
    if (failCount.value >= MAX_ATTEMPTS) {
      ElMessage.warning(`登录失败次数过多，请等待 ${COOLDOWN_SECONDS} 秒后重试`)
      startCooldown()
      failCount.value = 0
    }
  } finally {
    loading.value = false
  }
}
</script>

<style scoped>
.login-wrap {
  height: 100%;
  display: flex;
  align-items: center;
  justify-content: center;
  background: radial-gradient(ellipse at 30% 20%, #16223a 0%, #0f1420 60%);
}

.login-panel {
  width: 400px;
  padding: 40px 36px;
}

.login-brand {
  text-align: center;
  margin-bottom: 28px;
}

.logo {
  width: 64px;
  height: 64px;
  margin: 0 auto 16px;
  border-radius: 14px;
  background: linear-gradient(135deg, #1b6fe8, #0e4fa8);
  display: flex;
  align-items: center;
  justify-content: center;
  font-size: 22px;
  font-weight: 700;
  color: #fff;
  letter-spacing: 1px;
}

.login-brand h1 {
  font-size: 20px;
  margin: 0 0 6px;
}

.login-brand p {
  margin: 0;
  color: var(--cep-text-secondary);
  font-size: 12px;
}

.login-btn {
  width: 100%;
}

.login-hint {
  margin-top: 16px;
  text-align: center;
  font-size: 12px;
  color: var(--cep-text-muted);
}
</style>
