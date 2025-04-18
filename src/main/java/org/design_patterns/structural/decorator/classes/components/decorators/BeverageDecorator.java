package org.design_patterns.structural.decorator.classes.components.decorators;

import org.design_patterns.structural.decorator.classes.components.Beverage;

public abstract class BeverageDecorator extends Beverage {
    private final Beverage beverage;

    protected BeverageDecorator(final Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public void drink() {
        this.beverage.drink();
    }
}
