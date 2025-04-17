package org.design_patterns.creational.prototype.classes;

import org.design_patterns.creational.prototype.classes.prototypes.Car;
import org.design_patterns.creational.prototype.classes.prototypes.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {
    private Map<String, Vehicle> vehicles;

    public VehicleRegistry() {
        final Car familyCar = new Car(4);
        final Car sportsCar = new Car(2);

        this.vehicles = new HashMap<>();
        this.vehicles.put("family", familyCar);
        this.vehicles.put("sports", sportsCar);
    }

    public Vehicle get(final String key) {
        return this.vehicles.get(key).clone();
    }
}
