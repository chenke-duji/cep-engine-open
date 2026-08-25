<template>
  <div class="login-wrap">
    <div class="login-panel panel">
      <div class="login-brand">
        <div class="logo">CEP</div>
        <h1>CEP 事件管理控制台</h1>
        <p>集中式事件管理平台 · 事件接入与处理引擎</p>
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
            placeholder="用户名"
            :prefix-icon="User"
            autocomplete="username"
          />
        </el-form-item>
        <el-form-item>
          <el-input
            v-model="form.password"
            type="password"
            placeholder="密码"
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
            class="login-btn"
          >
            登 录
          </el-button>
        </el-form-item>
      </el-form>
      <div class="login-hint">
        默认管理员：admin / admin（请在生产环境立即修改）
      </div>
    </div>
  </div>
</template>

<script setup lang="ts">
import { reactive, ref } from 'vue'
import { useRouter, useRoute } from 'vue-router'
import { ElMessage } from 'element-plus'
import { User, Lock } from '@element-plus/icons-vue'
import { useAuthStore } from '@/stores/auth'

const router = useRouter()
const route = useRoute()
const auth = useAuthStore()

const form = reactive({ username: '', password: '' })
const loading = ref(false)

async function onSubmit() {
  if (!form.username || !form.password) {
    ElMessage.warning('请输入用户名和密码')
    return
  }
  loading.value = true
  try {
    await auth.login(form.username, form.password)
    ElMessage.success('登录成功')
    const redirect = (route.query.redirect as string) || '/'
    router.replace(redirect)
  } catch {
    // error message already shown by interceptor
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
