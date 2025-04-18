package org.design_patterns.architectural.event_sourcing.classes.events;

import org.design_patterns.architectural.event_sourcing.classes.BankAccount;

public class DepositEvent extends BankEvent {
    public DepositEvent(final double amountInDollars) {
        super(amountInDollars);
    }

    @Override
    public void apply(final BankAccount account) {
        account.increaseBalance(this.amountInDollars);
    }
}
