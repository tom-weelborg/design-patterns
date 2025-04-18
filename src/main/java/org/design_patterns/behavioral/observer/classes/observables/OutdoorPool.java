package org.design_patterns.behavioral.observer.classes.observables;

public class OutdoorPool extends Observable {
    public void setTemperature(final int temperature) {
        if (temperature > 20) {
            updateAll();
        }
    }
}
