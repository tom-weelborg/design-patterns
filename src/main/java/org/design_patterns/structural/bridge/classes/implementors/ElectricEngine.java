package org.design_patterns.structural.bridge.classes.implementors;

public class ElectricEngine extends Engine {
    @Override
    public void start() {
        System.out.println("Electricity is consumed.");
    }
}
