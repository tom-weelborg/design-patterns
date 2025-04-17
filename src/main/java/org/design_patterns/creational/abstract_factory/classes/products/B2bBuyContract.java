package org.design_patterns.creational.abstract_factory.classes.products;

public class B2bBuyContract extends BuyContract {
    @Override
    public void apply() {
        System.out.println("Business buys from business.");
    }
}
