package org.design_patterns.behavioral.observer.classes.observers;

public class Swimmer implements Observer {
    @Override
    public void update() {
        System.out.println("Let's go swimming.");
    }
}
