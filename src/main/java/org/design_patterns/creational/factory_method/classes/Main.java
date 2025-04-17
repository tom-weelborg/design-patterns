package org.design_patterns.creational.factory_method.classes;

import org.design_patterns.creational.factory_method.classes.creators.B2bCompany;
import org.design_patterns.creational.factory_method.classes.creators.B2cCompany;
import org.design_patterns.creational.factory_method.classes.creators.Company;

public class Main {
    public static void main(String[] args) {
        Company company = new B2bCompany();
        company.applyContract();

        company = new B2cCompany();
        company.applyContract();
    }
}
