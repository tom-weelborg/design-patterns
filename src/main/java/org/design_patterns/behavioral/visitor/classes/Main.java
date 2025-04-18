package org.design_patterns.behavioral.visitor.classes;

import org.design_patterns.behavioral.visitor.classes.elements.Plane;
import org.design_patterns.behavioral.visitor.classes.elements.Tank;
import org.design_patterns.behavioral.visitor.classes.visitors.AntiAirCannon;
import org.design_patterns.behavioral.visitor.classes.visitors.AntiTankCannon;

public class Main {
    public static void main(String[] args) {
        final AntiAirCannon antiAirCannon = new AntiAirCannon();
        final AntiTankCannon antiTankCannon = new AntiTankCannon();

        final Plane plane = new Plane();
        plane.accept(antiAirCannon);
        plane.accept(antiTankCannon);

        final Tank tank = new Tank();
        tank.accept(antiAirCannon);
        tank.accept(antiTankCannon);
    }
}
