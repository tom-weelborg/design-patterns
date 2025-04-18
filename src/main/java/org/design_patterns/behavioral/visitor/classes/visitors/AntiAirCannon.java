package org.design_patterns.behavioral.visitor.classes.visitors;

import org.design_patterns.behavioral.visitor.classes.elements.Plane;
import org.design_patterns.behavioral.visitor.classes.elements.Tank;

public class AntiAirCannon extends Cannon {
    @Override
    public void shootTank(final Tank tank) {
        System.out.println("This cannon did not penetrate the tank.");
    }

    @Override
    public void shootPlane(final Plane plane) {
        plane.crash();
    }
}
