package org.design_patterns.behavioral.memento.classes;

public class TextArea {
    public static class Memento {
        private final String text;

        private Memento(String text) {
            this.text = text;
        }

        private String getText() {
            return text;
        }
    }

    private String text;

    public void setText(final String text) {
        this.text = text;
    }

    public Memento takeSnapshot() {
        return new Memento(this.text);
    }

    public void restore(final Memento memento) {
        this.text = memento.getText();
    }
}
