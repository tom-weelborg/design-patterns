package org.design_patterns.behavioral.mediator.classes;

import org.design_patterns.behavioral.mediator.classes.colleagues.Plane;
import org.design_patterns.behavioral.mediator.classes.mediators.AirTrafficController;

public class Main {
    public static void main(String[] args) {
        final AirTrafficController airTrafficController = new AirTrafficController();

        final Plane plane1 = new Plane(airTrafficController);
        airTrafficController.addPlane(plane1);
        final Plane plane2 = new Plane(airTrafficController);
        airTrafficController.addPlane(plane2);

        plane1.startLanding();
        plane2.startLanding();

        plane1.setRunway(null);
        plane1.startLanding();
    }
}
