package org.design_patterns.behavioral.mediator.classes;

import java.util.Objects;

public class Runway {
    private final int number;

    public Runway(final int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return Integer.toString(this.number);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Runway runway = (Runway) o;
        return number == runway.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
