import axios from 'axios'
import { ElMessage } from 'element-plus'

/**
 * C-01 Fix: JWT is stored in a module-level variable (in-memory only),
 * NEVER persisted to localStorage or sessionStorage. This prevents XSS
 * attacks from stealing the token via Web Storage APIs.
 *
 * Trade-off: page refresh clears the token → user must re-login.
 * This is acceptable for a security-critical admin console.
 *
 * Ideal long-term solution: backend sets the JWT in an httpOnly + Secure +
 * SameSite=Strict cookie, so the frontend never touches the token at all.
 * The backend would need to:
 *   1. Set-Cookie: cep_token=<jwt>; HttpOnly; Secure; SameSite=Strict
 *   2. Read the token from the cookie on each request (instead of Authorization header)
 * Until the backend implements that, in-memory storage is the safest client-side option.
 */
let _token = ''

/** Attach the stored JWT to the request. */
export function getToken(): string {
  return _token
}

export function setToken(token: string) {
  _token = token || ''
}

export function clearToken() {
  _token = ''
}

/**
 * Decode the JWT payload and check whether the token has expired.
 * Returns true if the token is expired, malformed, or absent.
 */
export function isTokenExpired(): boolean {
  const token = getToken()
  if (!token) return true
  const parts = token.split('.')
  if (parts.length !== 3) return true
  try {
    const payload = JSON.parse(atob(parts[1]))
    if (typeof payload.exp !== 'number') return false
    return Date.now() >= payload.exp * 1000
  } catch {
    return true
  }
}

const http = axios.create({
  baseURL: import.meta.env.VITE_API_BASE_URL || '/api/v1',
  timeout: 15000,
  withCredentials: true,
})

http.interceptors.request.use((config) => {
  const token = getToken()
  if (token) {
    config.headers.Authorization = `Bearer ${token}`
  }
  // E-08 Fix: CSRF defense-in-depth.
  // The X-Requested-With custom header prevents CSRF attacks because
  // cross-site form submissions cannot set custom headers. The backend
  // can optionally validate this header; even without backend validation,
  // it ensures that only XMLHttpRequest/fetch calls (same-origin or CORS-
  // allowed) can reach the API.
  config.headers['X-Requested-With'] = 'XMLHttpRequest'
  return config
})

/** Map HTTP error status codes to user-friendly Chinese messages. */
function getFriendlyMessage(status: number | undefined, fallback: string): string {
  const messages: Record<number, string> = {
    400: '请求参数错误',
    401: '认证已过期，请重新登录',
    403: '没有权限执行该操作',
    404: '请求的资源不存在',
    409: '操作冲突，请刷新后重试',
    429: '请求过于频繁，请稍后再试',
    500: '服务器内部错误，请稍后重试',
    502: '后端服务不可用',
    503: '服务暂时不可用',
    504: '请求超时，请稍后重试',
  }
  if (status && messages[status]) return messages[status]
  return fallback
}

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
      const rawMsg =
        error.response?.data?.error ||
        error.message ||
        '请求失败，请稍后重试'
      const friendlyMsg = getFriendlyMessage(status, rawMsg)
      ElMessage.error(friendlyMsg)
      // Log the original backend error for debugging without exposing to users.
      console.warn('[API Error]', status, rawMsg)
    }
    return Promise.reject(error)
  },
)

export default http
