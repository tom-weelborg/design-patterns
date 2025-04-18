package org.design_patterns.behavioral.visitor.classes.elements;

import org.design_patterns.behavioral.visitor.classes.visitors.Visitor;

public class Tank extends Vehicle {
    @Override
    public void accept(final Visitor visitor) {
        visitor.shootTank(this);
    }

    public void explode() {
        System.out.println("This tank exploded.");
    }
}
