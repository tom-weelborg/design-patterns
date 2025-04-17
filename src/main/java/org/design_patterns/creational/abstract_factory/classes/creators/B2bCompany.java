package org.design_patterns.creational.abstract_factory.classes.creators;

import org.design_patterns.creational.abstract_factory.classes.products.B2bBuyContract;
import org.design_patterns.creational.abstract_factory.classes.products.B2bSellContract;
import org.design_patterns.creational.abstract_factory.classes.products.BuyContract;
import org.design_patterns.creational.abstract_factory.classes.products.SellContract;

public class B2bCompany extends Company {
    @Override
    public BuyContract createBuyContract() {
        return new B2bBuyContract();
    }

    @Override
    public SellContract createSellContract() {
        return new B2bSellContract();
    }
}
