package org.design_patterns.structural.decorator.classes.components.decorators;

import org.design_patterns.structural.decorator.classes.components.Beverage;

public class MilkDecorator extends BeverageDecorator {
    public MilkDecorator(final Beverage beverage) {
        super(beverage);
    }

    @Override
    public void drink() {
        super.drink();
        System.out.print(" with Milk");
    }
}
