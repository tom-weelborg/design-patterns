package org.design_patterns.creational.prototype.classes.prototypes;

public class Car extends Vehicle {
    private int numberOfPeople;
    private GpsSystem gpsSystem;

    public Car(final int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
        this.gpsSystem = new GpsSystem();
    }

    private Car(final Car car) {
        super(car);
        this.numberOfPeople = car.numberOfPeople;
        this.gpsSystem = car.gpsSystem; // This is considered a shallow copy.
        this.gpsSystem = car.gpsSystem.clone(); // This is considered a deep copy.
    }

    @Override
    public Car clone() {
        return new Car(this);
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }
}
