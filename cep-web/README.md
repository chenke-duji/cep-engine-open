# CEP 事件管理控制台（cep-web）

CEP 事件管理前端，独立 Vue 3 工程。展示 MongoDB 中的事件（AlarmEvent），支持事件操作（可配置 MongoDB update，如确认 Ack / 清除 Clear）、自定义视图（列模型）、自定义过滤条件（MongoDB 查询语句）、时间格式与时区设置。

## 技术栈

- Vue 3 + Vite + TypeScript
- Element Plus（深色运维控制台主题）
- Pinia + Vue Router + Axios
- dayjs（时间格式/时区格式化）

## 功能

- **登录认证**：基于 cep-engine 的 JWT 登录，默认管理员 `admin / admin`（请立即修改）
- **事件列表**：分页展示、多选、级别/状态可视化、自动刷新
- **右键操作菜单**：单选/多选后右键，按后端 YAML 预定义的操作项动态渲染，执行 MongoDB 批量更新（如 Ack / Clear）
- **自定义视图**：定义列模型（包含哪些字段 + 每列 title），私有为主，管理员可设公共。可用字段包括 `node`、`severity`、`summary`、`status`、`tally`（原 `frequency`）、`firstOccurrence`、`lastOccurrence` 等
- **自定义过滤条件**：输入任意 MongoDB 查询语句，保存后在筛选栏选择应用
- **时间格式/时区**：按用户自定义日期显示格式与时区，可保存为默认，默认用服务器时区默认格式

## 开发

```bash
npm install
npm run dev          # 开发服务器，默认 http://localhost:5173
# dev 环境通过 vite 代理将 /api 转发到后端（默认 http://localhost:8080，
# 可用环境变量 CEP_API_TARGET 覆盖）
```

## 构建

```bash
npm run build        # 产物输出到 dist/
```

## 生产部署（Nginx）

1. 构建前端：`npm run build`，得到 `dist/`
2. 将 `dist/` 内容拷贝到 Nginx 静态目录（如 `/usr/share/nginx/html`）
3. 将 `nginx.conf` 部署到 Nginx 配置目录，把 `proxy_pass` 指向实际 cep-engine 地址
4. 重载 Nginx：`nginx -s reload`

```bash
# 示例
cp -r dist/* /usr/share/nginx/html/
cp nginx.conf /etc/nginx/conf.d/cep-web.conf
sed -i 's|http://cep-engine:8080|http://你的后端IP:8080|' /etc/nginx/conf.d/cep-web.conf
nginx -s reload
```

通过 Nginx 反向代理 `/api` 到 cep-engine，生产环境无需 CORS。

## 与后端对接的 API

| 方法 | 路径 | 说明 |
|---|---|---|
| POST | `/api/v1/auth/login` | 登录获取 JWT |
| GET | `/api/v1/events/list` | 分页查询事件（支持自定义 MongoDB filter） |
| GET | `/api/v1/operations` | 获取预定义操作项（右键菜单） |
| POST | `/api/v1/events/operate` | 对选中事件批量执行操作 |
| GET/POST/PUT/DELETE | `/api/v1/user-prefs` | 用户视图/过滤/时间格式配置 |
| GET | `/api/v1/user-prefs/default-timeformat` | 获取用户默认时间格式 |

除登录与健康检查外，所有接口均需 `Authorization: Bearer <token>`。

## 目录结构

```
cep-web/
├── index.html
├── vite.config.ts          # dev 代理 /api -> 后端
├── nginx.conf              # 生产 Nginx 配置（托管 + 反代）
├── src/
│   ├── api/                # http / auth / event / userprefs
│   ├── components/         # EventTable / FilterBar / 右键菜单 / 确认弹窗 / 配置对话框
│   ├── stores/auth.ts      # 登录状态（Pinia）
│   ├── router/index.ts     # 路由 + 登录守卫
│   ├── types/index.ts      # 领域类型
│   ├── utils/time.ts       # 时间格式化（用户格式+时区）
│   ├── views/              # LoginView / EventConsoleView
│   └── styles/main.css     # 深色主题
```

## 安全说明

- 操作项完全由后端 `cep.operations` 配置定义，前端只传操作名 + identifier，无法注入任意 update 字段
- 过滤条件虽为任意 MongoDB 查询，但仅限查询（只读），不影响数据安全
- 生产环境务必修改默认管理员密码与 JWT 密钥（环境变量 `CEP_ADMIN_PASSWORD`、`CEP_JWT_SECRET`）
