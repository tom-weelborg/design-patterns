package org.design_patterns.creational.abstract_factory.classes.products;

public class B2cSellContract extends SellContract {
    @Override
    public void apply() {
        System.out.println("Business sells to consumer.");
    }
}
