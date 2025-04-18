package org.design_patterns.behavioral.state.classes.states;

import org.design_patterns.behavioral.state.classes.Phone;

public class OffState extends State {
    public OffState(final Phone phone) {
        super(phone);
    }

    @Override
    public void onHomeButtonPressed() {
        buttonPressed();
    }

    @Override
    public void onPowerButtonPressed() {
        buttonPressed();
    }

    private void buttonPressed() {
        this.phone.setState(new LockedState(this.phone));
        this.phone.turnOn();
    }
}
