package org.design_patterns.architectural.event_sourcing.classes;

import org.design_patterns.architectural.event_sourcing.classes.events.DepositEvent;
import org.design_patterns.architectural.event_sourcing.classes.events.WithdrawalEvent;

public class Main {
    public static void main(String[] args) {
        final BankAccount bankAccount = new BankAccount();
        printBankAccount(bankAccount);

        bankAccount.processEvent(new DepositEvent(50));
        bankAccount.processEvent(new DepositEvent(100));
        bankAccount.processEvent(new WithdrawalEvent(120));
        printBankAccount(bankAccount);

        bankAccount.recalculateBalance();
        printBankAccount(bankAccount);
    }

    private static void printBankAccount(final BankAccount bankAccount) {
        System.out.println("Your balance is: $" + bankAccount.getBalanceInDollars());
    }
}
