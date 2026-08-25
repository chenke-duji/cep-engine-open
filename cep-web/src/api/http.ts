import axios from 'axios'
import { ElMessage } from 'element-plus'

const TOKEN_KEY = 'cep_token'

/** Attach the stored JWT to the request. */
export function getToken(): string {
  return localStorage.getItem(TOKEN_KEY) || ''
}

export function setToken(token: string) {
  if (token) {
    localStorage.setItem(TOKEN_KEY, token)
  } else {
    localStorage.removeItem(TOKEN_KEY)
  }
}

export function clearToken() {
  localStorage.removeItem(TOKEN_KEY)
}

const http = axios.create({
  baseURL: '/api/v1',
  timeout: 15000,
})

http.interceptors.request.use((config) => {
  const token = getToken()
  if (token) {
    config.headers.Authorization = `Bearer ${token}`
  }
  return config
})

http.interceptors.response.use(
  (response) => response,
  (error) => {
    const status = error.response?.status
    if (status === 401) {
      // Token invalid or expired -> back to login
      clearToken()
      if (window.location.pathname !== '/login') {
        window.location.href = '/login'
      }
    } else {
      const msg =
        error.response?.data?.error ||
        error.message ||
        '请求失败，请稍后重试'
      ElMessage.error(msg)
    }
    return Promise.reject(error)
  },
)

export default http
