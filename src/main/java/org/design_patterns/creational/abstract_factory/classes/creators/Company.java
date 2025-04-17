package org.design_patterns.creational.abstract_factory.classes.creators;

import org.design_patterns.creational.abstract_factory.classes.products.BuyContract;
import org.design_patterns.creational.abstract_factory.classes.products.SellContract;

public abstract class Company {
    public abstract BuyContract createBuyContract();
    public abstract SellContract createSellContract();
}
