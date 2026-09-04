package com.dujitech.cep.groovy;

import com.dujitech.cep.model.HookContext;
import com.dujitech.cep.model.HookResult;

/**
 * Interface that Groovy hook scripts implement.
 * <p>
 * Each hook script is compiled into a class that implements this interface.
 * The Java processing chain calls {@link #execute(HookContext)} at the
 * appropriate point in the chain.
 * <p>
 * Hook scripts are stored in the <code>conf/groovy/hooks/</code> directory
 * and hot-loaded via {@link ScriptRegistry}.
 */
public interface EventHook {

    /**
     * Hook name identifying its position in the processing chain.
     * Standard names: severity_grade, maintain_check, flash_detect,
     * problem_resolution, before_dedup.
     */
    String hookName();

    /**
     * Execute the hook logic.
     *
     * @param context current event, domain state, and script variables
     * @return decision result that tells the Java chain what to do next
     */
    HookResult execute(HookContext context);
}
