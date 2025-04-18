package org.design_patterns.structural.facade.classes;

public class Main {
    public static void main(String[] args) {
        final ConsoleFacade consoleFacade = new ConsoleFacade();
        consoleFacade.println("Hello World!");
        final String input = consoleFacade.readString();
        System.out.println(input);
    }
}
