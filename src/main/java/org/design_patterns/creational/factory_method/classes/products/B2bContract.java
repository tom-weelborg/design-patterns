package org.design_patterns.creational.factory_method.classes.products;

public class B2bContract extends Contract {
    @Override
    public void apply() {
        System.out.println("Contract is applied between two businesses.");
    }
}
