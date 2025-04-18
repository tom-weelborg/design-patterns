package org.design_patterns.behavioral.observer.classes.observers;

public class IceCreamSeller implements Observer {
    @Override
    public void update() {
        System.out.println("Yeah, I can sell ice cream today.");
    }
}
