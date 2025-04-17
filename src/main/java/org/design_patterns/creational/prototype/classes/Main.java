package org.design_patterns.creational.prototype.classes;

import org.design_patterns.creational.prototype.classes.prototypes.Car;
import org.design_patterns.creational.prototype.classes.prototypes.Truck;
import org.design_patterns.creational.prototype.classes.prototypes.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<Vehicle> vehicles = List.of(
                new Car(2),
                new Car(4),
                new Truck()
        );

        final List<Vehicle> clones = new ArrayList<>();
        for (final Vehicle vehicle : vehicles) {
            clones.add(vehicle.clone());
        }

        for (int i = 0; i < vehicles.size() && i < clones.size(); i++) {
            if (vehicles.get(i) instanceof Car original && clones.get(i) instanceof Car clone) {
                System.out.println("original: " + original.getNumberOfPeople());
                System.out.println("clone: " + clone.getNumberOfPeople());
                System.out.println();
            }
        }

        final VehicleRegistry registry = new VehicleRegistry();
        final Vehicle vehicle = registry.get("family");
        if (vehicle instanceof Car car) {
            System.out.println(car.getNumberOfPeople());
        }
    }
}
