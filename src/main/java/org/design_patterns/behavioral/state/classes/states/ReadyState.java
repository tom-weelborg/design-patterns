package org.design_patterns.behavioral.state.classes.states;

import org.design_patterns.behavioral.state.classes.Phone;

public class ReadyState extends State {
    public ReadyState(final Phone phone) {
        super(phone);
    }

    @Override
    public void onHomeButtonPressed() {
        this.phone.home();
    }

    @Override
    public void onPowerButtonPressed() {
        this.phone.setState(new OffState(this.phone));
        this.phone.turnOff();
    }
}
