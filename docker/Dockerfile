# ============================================================
# CEP Event Engine - Dockerfile (multi-stage)
# Builds the Spring Boot fat jar and runs it on JRE 21.
# ============================================================
# Build:
#   docker build -f docker/Dockerfile -t cep-engine:latest .
# Or via docker-compose:
#   docker compose -f docker/docker-compose.yml build
# ============================================================

# ---- Stage 1: Maven build ----
FROM maven:3.9-eclipse-temurin-21 AS builder

WORKDIR /build

# Cache dependencies (only re-downloads when pom.xml changes)
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Build the application
COPY src ./src
RUN mvn clean package -DskipTests -B

# ---- Stage 2: JRE runtime ----
FROM eclipse-temurin:21-jre

LABEL org.opencontainers.image.title="CEP Event Engine" \
      org.opencontainers.image.description="Centralized Event Management Platform" \
      org.opencontainers.image.source="https://github.com/chenke-duji/cep-engine-open"

WORKDIR /app

# Install curl for health check
RUN apt-get update && apt-get install -y --no-install-recommends curl \
    && rm -rf /var/lib/apt/lists/*

# Copy the fat jar
COPY --from=builder /build/target/cep-engine-*.jar app.jar

# Copy Groovy parser scripts (hot-reloadable at runtime)
COPY conf/ conf/

# Copy external config (can be overridden by volume mount or env vars)
COPY config/ config/

# Default JVM options (override with JAVA_OPTS env)
ENV JAVA_OPTS="-Xms256m -Xmx1024m -XX:+UseZGC -Dfile.encoding=UTF-8"

EXPOSE 8080

# Health check: Spring Boot Actuator endpoint
HEALTHCHECK --interval=15s --timeout=5s --start-period=30s --retries=3 \
    CMD curl -sf http://localhost:8080/actuator/health || exit 1

ENTRYPOINT ["sh", "-c", "exec java $JAVA_OPTS -jar app.jar --spring.config.additional-location=file:./config/"]
