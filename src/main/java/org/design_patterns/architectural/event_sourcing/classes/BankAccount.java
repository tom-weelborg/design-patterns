package org.design_patterns.architectural.event_sourcing.classes;

import org.design_patterns.architectural.event_sourcing.classes.events.BankEvent;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private final List<BankEvent> bankEvents = new ArrayList<>();
    private double balanceInDollars = 0.0;

    public void processEvent(final BankEvent event) {
        event.apply(this);
        this.bankEvents.add(event);
    }

    public double getBalanceInDollars() {
        return balanceInDollars;
    }

    public void setBalanceInDollars(double balanceInDollars) {
        this.balanceInDollars = balanceInDollars;
    }

    public void increaseBalance(final double incrementInDollars) {
        this.balanceInDollars += incrementInDollars;
    }

    public void decreaseBalance(final double decrementInDollars) {
        this.balanceInDollars -= decrementInDollars;
    }

    public void recalculateBalance() {
        this.balanceInDollars = 0.0;
        for (final BankEvent event : this.bankEvents) {
            event.apply(this);
        }
    }
}
