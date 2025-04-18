package org.design_patterns.structural.decorator.classes.components;

public class Coffee extends Beverage {
    @Override
    public void drink() {
        System.out.print("Drink Coffee");
    }
}
