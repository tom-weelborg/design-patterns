package org.design_patterns.behavioral.state.classes;

public class Main {
    public static void main(String[] args) {
        final Phone phone = new Phone();
        phone.onHomeButtonPressed();
        phone.onPowerButtonPressed();
        phone.onPowerButtonPressed();
        phone.onHomeButtonPressed();
        phone.onHomeButtonPressed();
        phone.onPowerButtonPressed();
    }
}
