package org.design_patterns.behavioral.memento.classes;

public class Main {
    public static void main(String[] args) {
        final Editor editor = new Editor();
        editor.write("Hello");
        editor.write("Hello wor");
        editor.write("Hello world!");

        editor.undo();
    }
}
