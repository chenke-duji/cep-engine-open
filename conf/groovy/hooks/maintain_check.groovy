/**
 * Maintenance window check hook.
 *
 * Checks if the current event falls within an active maintenance window.
 * If so, suppresses the event (optionally with a suppress level).
 *
 * Returns: HookResult
 *   - pass() if not in maintenance
 *   - suppress("MAINTAIN") if should be suppressed
 */

import com.raysdata.cep.model.HookResult
import com.raysdata.cep.model.HookContext
import com.raysdata.cep.groovy.EventHook

class MaintainCheckHook implements EventHook {

    String hookName() { "maintain_check" }

    HookResult execute(HookContext ctx) {
        def event = ctx.getCurrentEvent()
        if (event == null) return HookResult.pass()

        def rules = ctx.getMaintainRules()
        if (rules == null || rules.isEmpty()) return HookResult.pass()

        long now = System.currentTimeMillis()

        for (def rule : rules) {
            // Skip disabled or expired rules
            if (!rule.isEnabled()) continue
            if (now < rule.getStartTime() || now > rule.getEndTime()) continue

            // Check if event matches the rule
            boolean matches = true

            // Match by node
            if (rule.getNode() != null && !rule.getNode().isEmpty()) {
                if (event.getNode() == null || !event.getNode().equals(rule.getNode())) {
                    matches = false
                }
            }

            // Match by alertGroup
            if (matches && rule.getAlertGroup() != null && !rule.getAlertGroup().isEmpty()) {
                if (event.getAlertGroup() == null || !event.getAlertGroup().equals(rule.getAlertGroup())) {
                    matches = false
                }
            }

            if (matches) {
                // Record maintenance info on the event
                event.setMaintainId(rule.getId())
                event.setMaintainName(rule.getName())

                // suppressLevel 0 = fully suppress, 1 = downgrade to WARNING
                if (rule.getSuppressLevel() == 0) {
                    return HookResult.suppress("MAINTAIN")
                } else {
                    // Downgrade severity but don't fully suppress
                    if (event.getSeverity() > 2) {
                        event.setSeverity(2) // WARNING
                    }
                    return HookResult.pass()
                }
            }
        }

        return HookResult.pass()
    }
}

return new MaintainCheckHook()
