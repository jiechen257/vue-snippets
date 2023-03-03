package com.jiechen.vue.snippets;

import com.intellij.codeInsight.template.TemplateActionContext;
import com.intellij.codeInsight.template.TemplateContextType;
import org.jetbrains.annotations.NotNull;

/**
 * @author jiechen
 * @date 2023/3/3
 */
public class VueTemplateProvider extends TemplateContextType {
    protected VueTemplateProvider() {
        super("VUE", "Vue");
    }

    @Override
    public boolean isInContext(@NotNull TemplateActionContext templateActionContext) {
        String name = templateActionContext.getFile().getName();
        return name.endsWith(".vue") || name.endsWith(".html") || name.endsWith(".ts");
    }
}
