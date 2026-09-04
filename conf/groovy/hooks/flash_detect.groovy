/**
 * Flash detection hook.
 *
 * Detects rapid repeated events (flapping) and suppresses them
 * after a threshold is reached within a sliding time window.
 *
 * Context:
 *   ctx.flashCount - current flash count for this identifier in the window
 *
 * Returns: HookResult
 *   - pass() if below threshold
 *   - suppress("FLASH") if threshold exceeded
 */

import com.dujitech.cep.model.HookResult
import com.dujitech.cep.model.HookContext
import com.dujitech.cep.groovy.EventHook

class FlashDetectHook implements EventHook {

    String hookName() { "flash_detect" }

    // Configuration: flash threshold and window
    static final int FLASH_THRESHOLD = 10    // events
    static final long SUPPRESS_DURATION = 300000  // 5 minutes in ms

    HookResult execute(HookContext ctx) {
        def event = ctx.getCurrentEvent()
        if (event == null) return HookResult.pass()

        long count = ctx.getFlashCount()

        // Below threshold: allow through
        if (count < FLASH_THRESHOLD) {
            return HookResult.pass()
        }

        // At or above threshold: suppress and start suppression window
        // The Java chain will call startFlashSuppression based on this result
        event.setSuppressLevel("FLASH")

        // Store flash info in script variables
        ctx.getScriptVariables()?.put("flashDetected", true)
        ctx.getScriptVariables()?.put("flashCount", count)

        return HookResult.suppress("FLASH")
    }
}

return new FlashDetectHook()
