package org.design_patterns.creational.factory_method.classes.creators;

import org.design_patterns.creational.factory_method.classes.products.Contract;

public abstract class Company {
    public abstract Contract createContract();

    public void applyContract() {
        final Contract contract = createContract();
        contract.apply();
    }
}
