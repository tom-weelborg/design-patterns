package org.design_patterns.structural.bridge.classes.implementors;

public class DieselEngine extends Engine {
    @Override
    public void start() {
        System.out.println("Diesel is injected.");
    }
}
