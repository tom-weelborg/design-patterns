package org.design_patterns.creational.prototype.classes.prototypes;

public class Truck extends Vehicle {
    private double maximumLoad;

    public Truck() {

    }

    private Truck(final Truck truck) {
        super(truck);
        this.maximumLoad = truck.maximumLoad;
    }

    @Override
    public Truck clone() {
        return new Truck(this);
    }
}
