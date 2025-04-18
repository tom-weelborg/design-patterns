package org.design_patterns.behavioral.template_method.classes;

public class Main {
    public static void main(String[] args) {
        final String text = "Hello World!";

        Display display = new ConsoleDisplay();
        display.displayText(text);

        display = new SwingDisplay();
        display.displayText(text);
    }
}
