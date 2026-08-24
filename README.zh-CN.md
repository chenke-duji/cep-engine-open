# CEP Event Engine（CEP 事件引擎）

一个基于规则、事件驱动的**网络告警关联与故障管理引擎**。它接收原始事件
（SNMP Trap、syslog、HTTP、文件、Kafka），通过 Groovy 脚本进行解析，并输出
规范化的告警与故障（含去重、分级、生命周期处置）。

> 本引擎与任何厂商的 MIB 完全解耦。`conf/groovy/formal/` 中附带由标准
> （IETF）MIB 定义（IF-MIB、SNMPv2-MIB、BGP4-MIB、OSPF-TRAP-MIB 等）生成的
> 示例解析脚本，其告警语义（alertGroup / severity / summary）均依据公开的
> MIB 语义重写。**厂商私有的 MIB 源文件不随项目分发**，仅包含合规、无第三方
> 规则库文本的生成解析脚本。

## 功能特性

- **Groovy 驱动解析**——每个 trap/事件都分发到对应的 Groovy 解析脚本；
  脚本目录被监听并支持热加载（无需重启）。
- **动态告警语义**——生成脚本根据 MIB 字段值与条件链（如 IF-MIB 的
  `ifOperStatus × ifAdminStatus`）设置 `alertGroup`、`alertKey`、`severity`、
  `eventType`、`summary`，以及任意动态字段。
- **故障关联**——按域（domain）隔离的故障生命周期，支持超时（stale）清理。
- **传输层去重**——支持 Active-Active 采集器部署，基于指纹去重。
- **灵活的事件源**——REST 摄取、可选 Kafka 消费者、文件监听。
- **MongoDB 持久化**——唯一持久层（自动建索引）。

## 架构

```
原始事件（SNMP trap / syslog / HTTP / file / Kafka）
        │  rawEvent {source, sourceIp, rawText, metadata{varbinds,…}}
        ▼
ScriptRegistry ──加载 conf/groovy/formal/*.parser.groovy（热加载）──▶ GroovyShell
        │  matchScript(trapOid) + executeParseScript(rawEvent)
        ▼
AlarmEvent（alertGroup, alertKey, severity, eventType, summary,
            dynamicFields, rawEvent=原始负载的 JSON 聚合）
        │
        ▼
故障关联 / 去重 / 分级 hooks（conf/groovy/hooks）
        ▼
MongoDB 批量写入
```

### 核心组件

| 类 | 职责 |
|----|------|
| `ScriptRegistry` | 发现并编译 `conf/groovy/formal` 下的脚本，文件变化时热加载 |
| `EventProcessingChain` | 摄取流水线：解析原始事件 → 关联 → 写入 |
| `ProblemManager` | 按域隔离的故障生命周期、超时清理 |
| `MongoBatchWriter` | 批量写入 MongoDB |
| `RawEvent` / `AlarmEvent` | 输入 / 输出事件模型 |

### 原始事件保留（rawEvent）

每个解析脚本将**完整原始事件**聚合为 JSON 写入 `event.rawEvent`：

```json
{
  "_source":   "snmp_trap",
  "_sourceIp": "192.0.2.10",
  "_trapOid":  "1.3.6.1.6.3.1.1.5.3",
  "_trapName": "linkDown",
  "_rawText":  "<原始负载>",
  "_metadata": { "trapName": "linkDown", "varbinds": { "ifIndex": "3", "ifDescr": "eth0" } },
  "_fields":   { "ifIndex": ["3", "1.3.6.1.2.1.2.2.1.1", "name"] },
  "_varbinds": { "ifIndex": "3", "ifDescr": "eth0" }
}
```

同一份结构化数据也写入 `event.getDynamicFields()["raw_fields"]`，无需解析
JSON 即可程序化访问。

## 环境要求

- Java 21+
- Maven 3.8+
- MongoDB（本地或远程）

## 构建

```bash
mvn clean package
```

生成 Spring Boot fat jar 于 `target/`。

## 运行

```bash
# 先启动 MongoDB（示例：docker run -p 27017:27017 -d mongo）
java -jar target/cep-engine-1.0.0-SNAPSHOT.jar
```

- 默认 HTTP 端口：`8080`
- 健康检查：`GET /actuator/health`
- `conf/groovy/formal/` 下的脚本在目录变化时**自动热加载**

## 配置

`src/main/resources/application.yml` 配置 MongoDB、Kafka（可选）、脚本目录、
去重 TTL、故障生命周期。默认连接使用 `localhost`，部署时通过环境变量覆盖。

| 配置项 | 默认值 | 说明 |
|--------|--------|------|
| `spring.data.mongodb.uri` | `mongodb://localhost:27017/cep` | MongoDB 连接 |
| `cep.script.dir` | `classpath:conf/groovy` | Groovy 脚本根目录 |
| `cep.dedup.ttl` | 见 yml | 传输层去重窗口 |
| `cep.problem.stale.*` | 见 yml | 故障超时/清理生命周期 |
| `cep.kafka.*` | 默认关闭 | 可选 Kafka 消费者 |

完整默认配置见 `src/main/resources/application.yml`，部署手册见 `DEPLOY.md`。

## 附带的解析脚本

`conf/groovy/formal/` 附带合规、license-clean 的解析脚本，其告警语义依据公开
IETF MIB 定义重写（不含厂商私有 MIB 文本或第三方规则库文本）：

- 接口/通用：`IF-MIB`、`SNMPv2-MIB`、`ENTITY-MIB`
- 路由：`BGP4-MIB`、`OSPF-TRAP-MIB`、`ISIS-MIB`、`IPV6-MIB`
- 桥接/高可用：`BRIDGE-MIB`、`VRRP-MIB`、`LLDP-MIB`、`RMON-MIB`
- MPLS：`MPLS-LSR/LDP/TE/L3VPN/VPN-STD-MIB`
- 运维与隧道：`DISMAN-PING/TRACEROUTE-MIB`、`L2TP-MIB`、`FRAME-RELAY-DTE-MIB`
- 厂商示例集：`HUAWEI-*.parser.groovy`（依据华为 NE8000 的 MIB trap 定义生成，
  语义依据公共网络运维知识重写；厂商 MIB 源文件不随项目分发）

> 新增 MIB 时，可用配套的 `mib-parser` 生成器项目转换为解析脚本；将脚本加入
> `conf/groovy/formal/` 后会自动热加载。

## 许可

本项目采用 Apache License 2.0 开源。详见 `LICENSE`。
