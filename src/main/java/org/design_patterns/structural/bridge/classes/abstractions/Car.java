package org.design_patterns.structural.bridge.classes.abstractions;

import org.design_patterns.structural.bridge.classes.implementors.Engine;

public class Car extends Vehicle {
    public Car(final Engine engine) {
        super(engine);
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine is started.");
        this.engine.start();
    }
}
