package org.design_patterns.creational.prototype.classes.prototypes;

public abstract class Vehicle implements Prototype {
    private String brand;
    private String model;
    private int numberOfWheels;
    private int topSpeed;

    protected Vehicle() {

    }

    protected Vehicle(final Vehicle vehicle) {
        this.brand = vehicle.brand;
        this.model = vehicle.model;
        this.numberOfWheels = vehicle.numberOfWheels;
        this.topSpeed = vehicle.topSpeed;
    }

    public abstract Vehicle clone();
}
