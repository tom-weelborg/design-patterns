package org.design_patterns.behavioral.visitor.classes.visitors;

import org.design_patterns.behavioral.visitor.classes.elements.Plane;
import org.design_patterns.behavioral.visitor.classes.elements.Tank;

public interface Visitor {
    void shootTank(final Tank tank);
    void shootPlane(final Plane plane);
}
