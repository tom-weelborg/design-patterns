package org.design_patterns.behavioral.state.classes.states;

import org.design_patterns.behavioral.state.classes.HomeButtonClickable;
import org.design_patterns.behavioral.state.classes.Phone;
import org.design_patterns.behavioral.state.classes.PowerButtonClickable;

public abstract class State implements HomeButtonClickable, PowerButtonClickable {
    protected final Phone phone;

    protected State(final Phone phone) {
        this.phone = phone;
    }
}
