import http from './http'

export interface BuildInfo {
  name: string
  version: string
  buildTime: string
}

/** Fetch backend build identity for the console footer. */
export async function fetchBuildInfo(): Promise<BuildInfo | null> {
  try {
    const res = await http.get<BuildInfo>('/version')
    return res.data
  } catch {
    // Footer build info is best-effort; ignore failures silently.
    return null
  }
}
