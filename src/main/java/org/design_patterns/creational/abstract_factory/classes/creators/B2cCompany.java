package org.design_patterns.creational.abstract_factory.classes.creators;

import org.design_patterns.creational.abstract_factory.classes.products.B2cBuyContract;
import org.design_patterns.creational.abstract_factory.classes.products.B2cSellContract;
import org.design_patterns.creational.abstract_factory.classes.products.BuyContract;
import org.design_patterns.creational.abstract_factory.classes.products.SellContract;

public class B2cCompany extends Company {
    @Override
    public BuyContract createBuyContract() {
        return new B2cBuyContract();
    }

    @Override
    public SellContract createSellContract() {
        return new B2cSellContract();
    }
}
