package org.design_patterns.behavioral.template_method.classes;

public class ConsoleDisplay extends Display {
    @Override
    protected void clearDisplay() {
        System.out.println();
    }

    @Override
    protected void addToDisplay(final String text) {
        System.out.println(text);
    }
}
