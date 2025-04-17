package org.design_patterns.behavioral.chain_of_responsibility.classes.handlers;

import org.design_patterns.behavioral.chain_of_responsibility.classes.User;

public abstract class Handler {
    private Handler next;

    public Handler setNext(final Handler next) {
        this.next = next;
        return next;
    }

    public abstract boolean handle(final User user);

    protected boolean handleNext(final User user) {
        if (this.next == null) {
            return true;
        }
        return this.next.handle(user);
    }
}
