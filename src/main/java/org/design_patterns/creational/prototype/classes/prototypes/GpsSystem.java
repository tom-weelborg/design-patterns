package org.design_patterns.creational.prototype.classes.prototypes;

public class GpsSystem implements Prototype {
    private int xCoordinate;
    private int yCoordinate;

    public GpsSystem() {

    }

    public GpsSystem(final GpsSystem gpsSystem) {
        this.xCoordinate = gpsSystem.xCoordinate;
        this.yCoordinate = gpsSystem.yCoordinate;
    }

    @Override
    public GpsSystem clone() {
        return new GpsSystem(this);
    }
}
