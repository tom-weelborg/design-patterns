package org.design_patterns.creational.factory_method.classes.creators;

import org.design_patterns.creational.factory_method.classes.products.B2cContract;
import org.design_patterns.creational.factory_method.classes.products.Contract;

public class B2cCompany extends Company {
    @Override
    public Contract createContract() {
        return new B2cContract();
    }
}
