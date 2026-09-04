package com.dujitech.cep.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Predefined MongoDB update operations for the event console.
 * <p>
 * Bound from <code>cep.operations</code> in application.yml. Each operation is
 * a named, server-defined MongoDB update that the frontend can apply to a
 * selection of events via the right-click context menu. The frontend only sends
 * an operation name plus identifiers, never raw update content, so the set of
 * writable fields is strictly limited by this configuration.
 * <p>
 * NOTE: the prefix is {@code cep} (not {@code cep.operations}) so that the
 * {@code operations} field binds to the {@code cep.operations} list in YAML.
 * Using {@code cep.operations} as the prefix would expect
 * {@code cep.operations.operations} and silently leave the list empty.
 */
@Component
@ConfigurationProperties(prefix = "cep")
public class EventOperationProperties {

    private List<Operation> operations = new ArrayList<>();

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    /**
     * Find an operation by name, or null if not defined.
     */
    public Operation findByName(String name) {
        if (name == null) return null;
        for (Operation op : operations) {
            if (name.equals(op.getName())) {
                return op;
            }
        }
        return null;
    }

    public static class Operation {
        /** Unique identifier referenced by the frontend (e.g. "ack"). */
        private String name;
        /** Label shown in the right-click context menu. */
        private String menuLabel;
        /** Target MongoDB collection; defaults to events_current. */
        private String collection = "events_current";
        /** MongoDB update document applied to the selected events. */
        private Map<String, Object> update;
        /** Confirmation message shown before applying. */
        private String confirmMessage;
        /** Optional server-side condition a selected event must satisfy to enable the menu item. */
        private String enableWhen;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMenuLabel() {
            return menuLabel;
        }

        public void setMenuLabel(String menuLabel) {
            this.menuLabel = menuLabel;
        }

        public String getCollection() {
            return collection;
        }

        public void setCollection(String collection) {
            this.collection = collection;
        }

        public Map<String, Object> getUpdate() {
            return update;
        }

        public void setUpdate(Map<String, Object> update) {
            this.update = update;
        }

        public String getConfirmMessage() {
            return confirmMessage;
        }

        public void setConfirmMessage(String confirmMessage) {
            this.confirmMessage = confirmMessage;
        }

        public String getEnableWhen() {
            return enableWhen;
        }

        public void setEnableWhen(String enableWhen) {
            this.enableWhen = enableWhen;
        }
    }
}
