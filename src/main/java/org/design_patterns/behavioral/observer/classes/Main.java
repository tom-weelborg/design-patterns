package org.design_patterns.behavioral.observer.classes;

import org.design_patterns.behavioral.observer.classes.observables.OutdoorPool;
import org.design_patterns.behavioral.observer.classes.observers.IceCreamSeller;
import org.design_patterns.behavioral.observer.classes.observers.Swimmer;

public class Main {
    public static void main(String[] args) {
        final OutdoorPool outdoorPool = new OutdoorPool();
        final Swimmer swimmer1 = new Swimmer();
        outdoorPool.add(swimmer1);
        final Swimmer swimmer2 = new Swimmer();
        outdoorPool.add(swimmer2);
        final IceCreamSeller iceCreamSeller = new IceCreamSeller();
        outdoorPool.add(iceCreamSeller);

        outdoorPool.setTemperature(10);
        outdoorPool.setTemperature(25);
    }
}
