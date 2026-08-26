#!/usr/bin/env bash
# ============================================================
# CEP Event Engine - Linux start/stop script
#
# Usage:
#   ./cep-engine.sh {start|stop|restart|status}
#
# Place this script in the same directory as the jar, or set
# APP_HOME below. PID is recorded in cep-engine.pid; stdout/stderr
# go to logs/cep-engine.log.
# ============================================================

set -u

APP_NAME="cep-engine"
APP_JAR="cep-engine-1.0.0-SNAPSHOT.jar"
PID_FILE="cep-engine.pid"
LOG_DIR="logs"
LOG_FILE="${LOG_DIR}/cep-engine.log"

# Directory containing this script, and the app home = the directory above it
# (the jar sits next to bin/ in the deployment layout).
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
APP_HOME="${APP_HOME:-$(cd "${SCRIPT_DIR}/.." && pwd)}"

# Java options. Adjust heap and JVM flags as needed.
JAVA_BIN="${JAVA_HOME:+${JAVA_HOME}/bin/}java"
JAVA_OPTS="${JAVA_OPTS:--Xms256m -Xmx1024m -XX:+UseZGC -Dfile.encoding=UTF-8}"

# Extra args passed to the application (e.g. --server.port=8080).
APP_ARGS="${APP_ARGS:-}"

cd "${APP_HOME}" || { echo "ERROR: cannot cd to ${APP_HOME}"; exit 1; }

# Make sure the jar exists.
if [ ! -f "${APP_JAR}" ]; then
    echo "ERROR: jar not found: ${APP_HOME}/${APP_JAR}"
    echo "  Set APP_HOME or run from the deployment directory."
    exit 1
fi

find_pid() {
    if [ -f "${PID_FILE}" ]; then
        cat "${PID_FILE}" 2>/dev/null
    fi
}

is_running() {
    local pid
    pid="$(find_pid)"
    if [ -n "${pid}" ] && kill -0 "${pid}" 2>/dev/null; then
        return 0
    fi
    return 1
}

start() {
    if is_running; then
        echo "${APP_NAME} is already running (pid $(find_pid))."
        return 0
    fi
    mkdir -p "${LOG_DIR}"
    echo "Starting ${APP_NAME} ..."
    # shellcheck disable=SC2086
    nohup "${JAVA_BIN}" ${JAVA_OPTS} -jar "${APP_JAR}" ${APP_ARGS} \
        >> "${LOG_FILE}" 2>&1 &
    echo $! > "${PID_FILE}"
    echo "${APP_NAME} started (pid $(cat "${PID_FILE}")). Log: ${LOG_FILE}"
}

stop() {
    if ! is_running; then
        echo "${APP_NAME} is not running."
        rm -f "${PID_FILE}"
        return 0
    fi
    local pid
    pid="$(find_pid)"
    echo "Stopping ${APP_NAME} (pid ${pid}) ..."
    kill "${pid}" 2>/dev/null
    # Wait up to 30s for graceful shutdown.
    for _ in $(seq 1 30); do
        if ! kill -0 "${pid}" 2>/dev/null; then
            break
        fi
        sleep 1
    done
    if kill -0 "${pid}" 2>/dev/null; then
        echo "Force stopping ${APP_NAME} (pid ${pid}) ..."
        kill -9 "${pid}" 2>/dev/null
    fi
    rm -f "${PID_FILE}"
    echo "${APP_NAME} stopped."
}

status() {
    if is_running; then
        echo "${APP_NAME} is running (pid $(find_pid))."
    else
        echo "${APP_NAME} is not running."
    fi
}

restart() {
    stop
    start
}

case "${1:-}" in
    start)   start ;;
    stop)    stop ;;
    restart) restart ;;
    status)  status ;;
    *)
        echo "Usage: $0 {start|stop|restart|status}"
        exit 1
        ;;
esac
