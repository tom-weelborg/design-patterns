package org.design_patterns.behavioral.template_method.classes;

public abstract class Display {
    public void displayText(final String text) {
        clearDisplay();
        addToDisplay(text);
    }

    protected abstract void clearDisplay();

    protected abstract void addToDisplay(final String text);
}
