package org.design_patterns.behavioral.visitor.classes.elements;

import org.design_patterns.behavioral.visitor.classes.visitors.Visitor;

public class Plane extends Vehicle {
    @Override
    public void accept(final Visitor visitor) {
        visitor.shootPlane(this);
    }

    public void crash() {
        System.out.println("This plane crashed.");
    }
}
