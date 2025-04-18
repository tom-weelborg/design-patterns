package org.design_patterns.behavioral.mediator.classes.mediators;

import org.design_patterns.behavioral.mediator.classes.Runway;
import org.design_patterns.behavioral.mediator.classes.colleagues.Component;
import org.design_patterns.behavioral.mediator.classes.colleagues.Plane;

import java.util.ArrayList;
import java.util.List;

public class AirTrafficController implements Mediator {
    private final List<Runway> runways = List.of(
            new Runway(1),
            new Runway(2),
            new Runway(3)
    );
    private final List<Plane> planes = new ArrayList<>();

    @Override
    public void mediate(final Component component) {
        final List<Runway> remainingRunways = getRemainingRunways();
        if (!remainingRunways.isEmpty()) {
            component.land(remainingRunways.get(0));
        }
    }

    private List<Runway> getRemainingRunways() {
        final List<Runway> occupiedRunways = getOccupiedRunways();
        return this.runways.stream()
                .filter(runway -> !occupiedRunways.contains(runway))
                .toList();
    }

    private List<Runway> getOccupiedRunways() {
        final List<Runway> occupiedRunways = new ArrayList<>();
        for (final Plane plane : this.planes) {
            final Runway runway = plane.getRunway();
            if (runway != null) {
                occupiedRunways.add(runway);
            }
        }
        return occupiedRunways;
    }

    public void addPlane(final Plane plane) {
        this.planes.add(plane);
    }
}
