package org.design_patterns.behavioral.visitor.classes.visitors;

import org.design_patterns.behavioral.visitor.classes.elements.Plane;
import org.design_patterns.behavioral.visitor.classes.elements.Tank;

public class AntiTankCannon extends Cannon {
    @Override
    public void shootTank(final Tank tank) {
        tank.explode();
    }

    @Override
    public void shootPlane(final Plane plane) {
        System.out.println("This cannon missed the plane.");
    }
}
