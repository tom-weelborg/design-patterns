package org.design_patterns.behavioral.visitor.classes.elements;

import org.design_patterns.behavioral.visitor.classes.visitors.Visitor;

public abstract class Vehicle {
    public abstract void accept(final Visitor visitor);
}
