package org.design_patterns.behavioral.state.classes;

import org.design_patterns.behavioral.state.classes.states.OffState;
import org.design_patterns.behavioral.state.classes.states.State;

public class Phone implements HomeButtonClickable, PowerButtonClickable {
    private State state;

    public Phone() {
        this.state = new OffState(this);
    }

    public void setState(final State state) {
        this.state = state;
    }

    @Override
    public void onHomeButtonPressed() {
        this.state.onHomeButtonPressed();
    }

    @Override
    public void onPowerButtonPressed() {
        this.state.onPowerButtonPressed();
    }

    public void turnOn() {
        System.out.println("Phone is turned on.");
    }

    public void turnOff() {
        System.out.println("Phone is turned off.");
    }

    public void unlock() {
        System.out.println("Phone is unlocked.");
    }

    public void home() {
        System.out.println("Back to home screen");
    }
}
