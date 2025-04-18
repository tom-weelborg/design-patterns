package org.design_patterns.behavioral.observer.classes.observables;

import org.design_patterns.behavioral.observer.classes.observers.Observer;

import java.util.ArrayList;

public abstract class Observable extends ArrayList<Observer> {
    public void updateAll() {
        for (final Observer observer : this) {
            observer.update();
        }
    }
}
