package org.design_patterns.structural.decorator.classes.components.decorators;

import org.design_patterns.structural.decorator.classes.components.Beverage;

public class SugarDecorator extends BeverageDecorator {
    public SugarDecorator(final Beverage beverage) {
        super(beverage);
    }

    @Override
    public void drink() {
        super.drink();
        System.out.print(" with Sugar");
    }
}
