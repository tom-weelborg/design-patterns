package org.design_patterns.structural.bridge.classes.abstractions;

import org.design_patterns.structural.bridge.classes.implementors.Engine;

public class Truck extends Vehicle {
    public Truck(final Engine engine) {
        super(engine);
    }

    @Override
    public void startEngine() {
        System.out.println("Truck engine is started.");
        this.engine.start();
    }
}
