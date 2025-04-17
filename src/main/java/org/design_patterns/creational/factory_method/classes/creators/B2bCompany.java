package org.design_patterns.creational.factory_method.classes.creators;

import org.design_patterns.creational.factory_method.classes.products.B2bContract;
import org.design_patterns.creational.factory_method.classes.products.Contract;

public class B2bCompany extends Company {
    @Override
    public Contract createContract() {
        return new B2bContract();
    }
}
