/**
 * Before-dedup hook.
 *
 * Called just before the Java dedup logic. Can modify the event
 * or adjust the dedup identifier to control which events get merged.
 *
 * Common use cases:
 *   - Normalize node names (lowercase, strip suffixes)
 *   - Adjust alertKey for better dedup grouping
 *   - Add computed fields before dedup
 *
 * Returns: HookResult
 *   - pass() to continue
 *   - modify(event) to use modified event for dedup
 */

import com.raysdata.cep.model.HookResult
import com.raysdata.cep.model.HookContext
import com.raysdata.cep.groovy.EventHook

class BeforeDedupHook implements EventHook {

    String hookName() { "before_dedup" }

    HookResult execute(HookContext ctx) {
        def event = ctx.getCurrentEvent()
        if (event == null) return HookResult.pass()

        // Normalize node name: lowercase, strip domain suffix
        if (event.getNode() != null) {
            def node = event.getNode().toLowerCase()
            // Strip common domain suffixes
            node = node.replaceAll(/\.(local|internal|corp|domain)$/, "")
            event.setNode(node)
        }

        // Normalize alertKey: trim whitespace
        if (event.getAlertKey() != null) {
            event.setAlertKey(event.getAlertKey().trim())
        }

        // Rebuild identifier after normalization
        def identParts = [event.getDomainId(), event.getNode(),
                          event.getAlertKey(), event.getEventType()]
        event.setIdentifier(identParts.findAll { it != null && it != "" }.join("|"))

        // Set alertGroup if not already set
        if (event.getAlertGroup() == null || event.getAlertGroup().isEmpty()) {
            // Derive alertGroup from eventClass
            if (event.getEventClass() != null) {
                event.setAlertGroup(event.getEventClass())
            }
        }

        return HookResult.modify(event)
    }
}

return new BeforeDedupHook()
