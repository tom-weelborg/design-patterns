package org.design_patterns.behavioral.command.classes;

import org.design_patterns.behavioral.command.classes.commands.Action;

public class Turn {
    public void executeAction(final Action action) {
        action.execute();
    }
}
