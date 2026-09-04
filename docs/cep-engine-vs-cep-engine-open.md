# cep-engine 与 cep-engine-open 区别梳理

> 本文档用于记录和跟踪 `cep-engine` 与 `cep-engine-open` 两个项目的定位、关系与差异，
> 避免后续遗忘。最后更新：2026-09-04。

---

## 1. 一句话结论

两个项目是**同一套 CEP 事件引擎代码**的两种发布形态：

- **`cep-engine`** —— 内部 / 商用**闭源**版，保留厂商私有 MIB 源文件、生产环境配置与内部部署文档。
- **`cep-engine-open`** —— 脱敏后的 **Apache-2.0 开源**版，移除厂商私有 MIB 源文件，仅保留
  license-clean 的解析脚本，并补齐开源所需的 README / LICENSE / 前端。

核心 Java 代码（43 个 `.java`）、Groovy 解析脚本（193 个 `.parser.groovy` + 5 个 hooks）、
`pom.xml` 三者**完全一致**，差异主要集中在**发布周边内容**而非引擎功能本身。

---

## 2. 两者关系

```
cep-engine  (内部/商用闭源版)
   │  脱敏：移除厂商 MIB 源文件、内部部署文档、生产配置
   │  补齐：LICENSE、README(中/英)、前端 cep-web、开源部署手册
   ▼
cep-engine-open  (Apache-2.0 开源版)
```

- 功能、架构、事件处理流水线、API、数据模型**完全等价**。
- `cep-engine-open` 是 `cep-engine` 的"开源发布快照"，可独立编译、运行、部署。

---

## 3. 核心差异对照表

| 维度 | `cep-engine`（内部版） | `cep-engine-open`（开源版） |
|------|------------------------|------------------------------|
| **定位** | 内部生产 / 商用闭源 | Apache-2.0 开源 |
| **License** | ❌ 无 `LICENSE` 文件 | ✅ `LICENSE`（Apache-2.0） |
| **Git 仓库** | ❌ 无 `.git`（未纳入版本控制） | ✅ 有 `.git`，远程 `github.com/chenke-duji/cep-engine-open` |
| **厂商 MIB 源文件** | ✅ `mibs/` 含华为 NetEngine8000 系列 285 个 `.mib` 源文件 | ❌ 无（合规脱敏，只保留生成的 `.groovy`） |
| **前端 cep-web** | ❌ 内置无（前端在外部同级目录 `cep-web/`） | ✅ 内置 `cep-web/`（Vue 3 + Vite） |
| **README** | ❌ 无 | ✅ `README.md`（英文）+ `README.zh-CN.md`（中文） |
| **部署手册 DEPLOY.md** | ✅ 中文手册（含 `/cpcnet/cep` 生产路径、Nginx、多租户说明） | ✅ 英文开源手册（含 license-clean 合规说明） |
| **多租户手册** | ✅ `多租户部署手册.md` | ❌ 无 |
| **生产配置** | ✅ `application-prod.yml`、`docker-compose.yml`、`Dockerfile` | ❌ 无（仅 `config/application.yml`） |
| **IDE 工程文件** | ✅ `.settings/`、`.classpath`、`.project`（Eclipse） | ❌ 无 |
| **构建/运行产物** | ✅ `target/`、`logs/` | 仅 `target/`（本地构建） |
| **CHANGELOG.md** | ✅ 有 | ✅ 有（内容一致） |

---

## 4. 完全一致的部分（无需差异关注）

以下内容在两个项目中**逐字节一致**，是同一套引擎的实现主体：

1. **Java 源码**：`src/main/java/com/dujitech/cep/**` 下 43 个类全部一致，包括：
   - 引擎核心：`engine/`（`EventProcessingChain`、`DomainProcessor`、`TransportDeduplicator` 等）
   - Groovy 引擎：`groovy/`（`ScriptRegistry`、`EventHook`）
   - 数据模型：`model/`（`AlarmEvent`、`RawEvent`、`EventType`、`Severity` 等）
   - 存储：`store/`（`MongoBatchWriter`、`EventHistoryCleaner` 等）
   - 安全：`security/`（JWT + Spring Security）
   - 控制器：`controller/`（事件摄取、操作、用户偏好、认证等）
   - Kafka 消费者：`kafka/KafkaEventConsumer`
2. **Groovy 解析脚本**：`conf/groovy/formal/` 193 个 `.parser.groovy`（IETF 标准 + 华为示例集）+ `hooks/` 5 个钩子脚本。
3. **`pom.xml`**：坐标、依赖、Spring Boot 3.2.5 / Java 21 / Groovy 4.0.21 完全一致。
4. **`config/application.yml`**：外部运行时默认配置一致。
5. **`bin/cep-engine.sh`**、`docker/mongo-init.js`：一致。

---

## 5. 差异背后的设计意图（为何要拆两个项目）

1. **合规脱敏**：
   - `cep-engine` 的 `mibs/` 目录含华为 NetEngine8000 系列**厂商私有 MIB 源文件**（含厂商版权信息），
     不能随开源项目分发。
   - `cep-engine-open` 只分发**由 `mib-parser` 生成、license-clean** 的解析脚本
     （告警语义基于公开 IETF MIB 定义重写，不含厂商原文 / 第三方规则库文本）。
   - 这是两个项目**最本质、最重要的差异**。

2. **文档语言与受众**：
   - 内部版面向国内运维交付团队，文档为中文，含 `cpcnet` 生产路径、多租户部署细节。
   - 开源版面向国际开发者，文档为英文（并附中文版），强调 build / run / contribute。

3. **工程化完整度**：
   - 内部版补了生产所需的一键编排（`docker-compose.yml`、`Dockerfile`）与 `prod` 配置 profile。
   - 开源版补了开源生态所需的前端、LICENSE、README。

---

## 6. 与其它配套项目的关系

| 项目 | 关系 |
|------|------|
| `cep-engine` | 内部/商用闭源版引擎（本仓库根目录下） |
| `cep-engine-open` | 上述引擎的开源版（本仓库根目录下） |
| `cep-web` | 前端控制台（Vue 3），`cep-engine-open` 内置一份，内部版放在仓库根目录 `cep-web/` |
| `mib-parser` | MIB → Groovy 解析脚本生成器，产出部署到引擎的 `conf/groovy/formal/` |
| `syslog-daemon` | 独立的 syslog 采集守护进程（配套事件源之一） |
| `prometheus-webhook` | 独立的 Prometheus webhook（配套事件源之一） |

---

## 7. 维护注意事项（跟踪记录）

- [ ] 引擎 Java / Groovy 逻辑改动时，两个项目需**同步**（核心代码一致是前提）。
- [ ] 新增 MIB 解析脚本：用 `mib-parser` 生成后，同时部署到两个项目的 `conf/groovy/formal/`。
- [ ] `cep-engine-open` **绝不能**引入厂商私有 MIB 源文件（`.mib`）或含厂商原文 / NcKL 文本的脚本，
      必须保持 license-clean（见合规要求）。
- [ ] `cep-engine` 的生产配置（`application-prod.yml`、`docker-compose.yml`）属于内部部署细节，
      不宜同步到开源版。
- [ ] 版本/文档差异（中文 DEPLOY、多租户手册）保持各自独立，不要混用。
