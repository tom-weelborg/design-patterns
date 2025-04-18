package org.design_patterns.architectural.event_sourcing.classes.events;

import org.design_patterns.architectural.event_sourcing.classes.BankAccount;

public class WithdrawalEvent extends BankEvent {
    public WithdrawalEvent(final double amountInDollars) {
        super(amountInDollars);
    }

    @Override
    public void apply(final BankAccount account) {
        account.decreaseBalance(this.amountInDollars);
    }
}
