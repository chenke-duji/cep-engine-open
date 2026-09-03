import { defineStore } from 'pinia'
import type { CurrentUser } from '@/types'
import { login as apiLogin } from '@/api/auth'
import { setToken, clearToken, getToken } from '@/api/http'

const USER_KEY = 'cep_user'

export const useAuthStore = defineStore('auth', {
  state: () => ({
    user: loadUser(),
    /** Reactive flag mirroring token presence in sessionStorage. */
    _hasToken: !!getToken(),
  }),
  getters: {
    isAuthenticated: (state) => state._hasToken,
    isAdmin: (state) => state.user?.role === 'admin',
    username: (state) => state.user?.username || '',
    displayName: (state) => state.user?.displayName || state.user?.username || '',
  },
  actions: {
    async login(username: string, password: string) {
      const user = await apiLogin(username, password)
      setToken(user.token || '')
      this._hasToken = true
      // Persist user info WITHOUT the token — token is managed separately.
      const safeUser: CurrentUser = {
        username: user.username,
        displayName: user.displayName,
        role: user.role,
      }
      this.user = safeUser
      saveUser(safeUser)
      return user
    },
    logout() {
      clearToken()
      this._hasToken = false
      this.user = null
      sessionStorage.removeItem(USER_KEY)
    },
  },
})

function saveUser(user: CurrentUser) {
  sessionStorage.setItem(USER_KEY, JSON.stringify({
    username: user.username,
    displayName: user.displayName,
    role: user.role,
  }))
}

function loadUser(): CurrentUser | null {
  try {
    const raw = sessionStorage.getItem(USER_KEY)
    return raw ? (JSON.parse(raw) as CurrentUser) : null
  } catch {
    return null
  }
}
