package org.design_patterns.structural.bridge.classes;

import org.design_patterns.structural.bridge.classes.abstractions.Car;
import org.design_patterns.structural.bridge.classes.abstractions.Truck;
import org.design_patterns.structural.bridge.classes.implementors.DieselEngine;
import org.design_patterns.structural.bridge.classes.implementors.ElectricEngine;

public class Main {
    public static void main(String[] args) {
        final Car car1 = new Car(new DieselEngine());
        car1.startEngine();
        System.out.println();

        final Car car2 = new Car(new ElectricEngine());
        car2.startEngine();
        System.out.println();

        final Truck truck1 = new Truck(new DieselEngine());
        truck1.startEngine();
        System.out.println();

        final Truck truck2 = new Truck(new ElectricEngine());
        truck2.startEngine();
        System.out.println();
    }
}
