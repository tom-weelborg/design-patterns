package org.design_patterns.creational.abstract_factory.classes.products;

public class B2cBuyContract extends BuyContract {
    @Override
    public void apply() {
        System.out.println("Business buys from consumer.");
    }
}
