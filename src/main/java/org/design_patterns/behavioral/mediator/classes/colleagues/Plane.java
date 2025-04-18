package org.design_patterns.behavioral.mediator.classes.colleagues;

import org.design_patterns.behavioral.mediator.classes.Runway;
import org.design_patterns.behavioral.mediator.classes.mediators.Mediator;

public class Plane implements Component {
    private final Mediator mediator;
    private Runway runway;

    public Plane(final Mediator mediator) {
        this.mediator = mediator;
    }

    public Runway getRunway() {
        return runway;
    }

    public void setRunway(Runway runway) {
        this.runway = runway;
    }

    public void startLanding() {
        this.mediator.mediate(this);
    }

    public void land(final Runway runway) {
        this.runway = runway;
        System.out.println("Landing on runway: " + this.runway);
    }
}
