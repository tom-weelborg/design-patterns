package org.design_patterns.structural.bridge.classes.abstractions;

import org.design_patterns.structural.bridge.classes.implementors.Engine;

public abstract class Vehicle {
    protected final Engine engine;

    protected Vehicle(final Engine engine) {
        this.engine = engine;
    }

    public abstract void startEngine();
}
