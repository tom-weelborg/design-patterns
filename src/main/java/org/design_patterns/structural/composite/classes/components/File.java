package org.design_patterns.structural.composite.classes.components;

public class File extends FileSystemObject {
    private String text;

    @Override
    public String display() {
        return this.text;
    }

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }
}
