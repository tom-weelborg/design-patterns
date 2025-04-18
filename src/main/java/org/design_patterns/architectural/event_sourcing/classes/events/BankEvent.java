package org.design_patterns.architectural.event_sourcing.classes.events;

import org.design_patterns.architectural.event_sourcing.classes.BankAccount;

public abstract class BankEvent {
    protected final double amountInDollars;

    protected BankEvent(final double amountInDollars) {
        this.amountInDollars = amountInDollars;
    }

    public abstract void apply(final BankAccount account);
}
