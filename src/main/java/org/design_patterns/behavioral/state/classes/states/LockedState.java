package org.design_patterns.behavioral.state.classes.states;

import org.design_patterns.behavioral.state.classes.Phone;

public class LockedState extends State {
    public LockedState(final Phone phone) {
        super(phone);
    }

    @Override
    public void onHomeButtonPressed() {
        this.phone.setState(new ReadyState(this.phone));
        this.phone.unlock();
    }

    @Override
    public void onPowerButtonPressed() {
        this.phone.setState(new OffState(this.phone));
        this.phone.turnOff();
    }
}
