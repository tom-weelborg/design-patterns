package org.design_patterns.creational.abstract_factory.classes;

import org.design_patterns.creational.abstract_factory.classes.creators.B2bCompany;
import org.design_patterns.creational.abstract_factory.classes.creators.B2cCompany;
import org.design_patterns.creational.abstract_factory.classes.creators.Company;

public class Main {
    public static void main(String[] args) {
        applyAllContracts(new B2bCompany());
        applyAllContracts(new B2cCompany());
    }

    private static void applyAllContracts(final Company company) {
        company.createBuyContract().apply();
        company.createSellContract().apply();
    }
}
