/**
 * Problem/Resolution pairing hook.
 *
 * Matches incoming Resolution events with existing Problem events
 * in the domain's active event store. When a match is found, the
 * Java chain closes the Problem event.
 *
 * Matching logic:
 *   - A Resolution event (eventType=2) arrives
 *   - Look up active Problem events with matching alertKey or identifier
 *   - If found, return MATCH with the pairKey
 *
 * Returns: HookResult
 *   - pass() if not a resolution event or no match
 *   - MATCH with pairKey if a problem was found to resolve
 */

import com.raysdata.cep.model.HookResult
import com.raysdata.cep.model.HookContext
import com.raysdata.cep.model.EventType
import com.raysdata.cep.groovy.EventHook

class ProblemResolutionHook implements EventHook {

    String hookName() { "problem_resolution" }

    HookResult execute(HookContext ctx) {
        def event = ctx.getCurrentEvent()
        if (event == null) return HookResult.pass()

        // Only process Resolution events
        if (event.getEventType() == null || !event.getEventType().equals(EventType.RESOLUTION.code)) {
            return HookResult.pass()
        }

        // Build the pair key to look up the Problem event
        // Convention: Problem and Resolution share the same alertKey + node
        def pairKey = null

        // Strategy 1: Match by alertKey + node
        if (event.getAlertKey() != null && event.getNode() != null) {
            pairKey = event.getDomainId() + "|" + event.getNode() + "|" + event.getAlertKey() + "|" + EventType.PROBLEM.code
        }

        // Strategy 2: Match by identifier with eventType swapped
        if (pairKey == null && event.getIdentifier() != null) {
            pairKey = event.getIdentifier().replace(
                    EventType.RESOLUTION.code, EventType.PROBLEM.code)
        }

        if (pairKey == null) {
            return HookResult.pass()
        }

        // Check if the Problem event exists in active store
        def activeProblem = ctx.getActiveEvent(pairKey)
        if (activeProblem != null) {
            def result = new HookResult(com.raysdata.cep.model.ResultAction.MATCH)
            result.setPairKey(pairKey)

            // Store resolution context
            ctx.getScriptVariables()?.put("resolvedProblem", activeProblem.getIdentifier())
            ctx.getScriptVariables()?.put("resolutionTime", System.currentTimeMillis())

            return result
        }

        // No matching problem found - this is a stray resolution
        // Still pass it through (will be deduped or stored as-is)
        ctx.getScriptVariables()?.put("strayResolution", true)
        return HookResult.pass()
    }
}

return new ProblemResolutionHook()
