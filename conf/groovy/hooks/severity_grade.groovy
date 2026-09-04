/**
 * Severity grading hook.
 *
 * Called after parsing, before dedup. Adjusts severity based on
 * business rules that are too domain-specific for Java code.
 *
 * Context variables:
 *   ctx.currentEvent   - the AlarmEvent being processed
 *   ctx.domainId       - current domain
 *   ctx.scriptVariables - shared map across hooks for this event
 *
 * Returns: HookResult
 *   - pass() to continue without changes
 *   - modify(event) to use a modified event
 *   - suppress(level) to suppress
 */

import com.dujitech.cep.model.HookResult
import com.dujitech.cep.model.HookContext
import com.dujitech.cep.model.Severity
import com.dujitech.cep.groovy.EventHook

class SeverityGradeHook implements EventHook {

    String hookName() { "severity_grade" }

    HookResult execute(HookContext ctx) {
        def event = ctx.getCurrentEvent()
        if (event == null) return HookResult.pass()

        // Example: upgrade severity based on node patterns
        def node = event.getNode()
        if (node != null) {
            // Core routers get +1 severity
            if (node.contains("core-router") || node.contains("core-sw")) {
                if (event.getSeverity() < Severity.CRITICAL.level) {
                    event.setSeverity(event.getSeverity() + 1)
                }
            }
            // Access switches max at MAJOR
            if (node.contains("access-sw") && event.getSeverity() > Severity.MAJOR.level) {
                event.setSeverity(Severity.MAJOR.level)
            }
        }

        // Example: downgrade informational syslog to CLEAR
        if (event.getSummary() != null && event.getSummary().toLowerCase().contains("informational")) {
            event.setSeverity(Severity.CLEAR.level)
        }

        // Store grading decision in script variables for later hooks
        ctx.getScriptVariables()?.put("severityGraded", true)
        ctx.getScriptVariables()?.put("originalSeverity", event.getOriginalSeverity())

        return HookResult.modify(event)
    }
}

// Return an instance so ScriptRegistry can register it
return new SeverityGradeHook()
