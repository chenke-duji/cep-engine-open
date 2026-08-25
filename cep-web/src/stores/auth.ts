import { defineStore } from 'pinia'
import type { CurrentUser } from '@/types'
import { login as apiLogin } from '@/api/auth'
import { setToken, clearToken } from '@/api/http'

const USER_KEY = 'cep_user'

export const useAuthStore = defineStore('auth', {
  state: () => ({
    user: loadUser(),
  }),
  getters: {
    isAuthenticated: (state) => !!state.user?.token,
    isAdmin: (state) => state.user?.role === 'admin',
    username: (state) => state.user?.username || '',
    displayName: (state) => state.user?.displayName || state.user?.username || '',
  },
  actions: {
    async login(username: string, password: string) {
      const user = await apiLogin(username, password)
      setToken(user.token)
      this.user = user
      saveUser(user)
      return user
    },
    logout() {
      clearToken()
      this.user = null
      localStorage.removeItem(USER_KEY)
    },
  },
})

function saveUser(user: CurrentUser) {
  localStorage.setItem(USER_KEY, JSON.stringify(user))
}

function loadUser(): CurrentUser | null {
  try {
    const raw = localStorage.getItem(USER_KEY)
    return raw ? (JSON.parse(raw) as CurrentUser) : null
  } catch {
    return null
  }
}
