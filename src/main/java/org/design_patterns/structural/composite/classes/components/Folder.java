package org.design_patterns.structural.composite.classes.components;

import java.util.ArrayList;
import java.util.List;

public class Folder extends FileSystemObject {
    private final List<FileSystemObject> children = new ArrayList<>();

    @Override
    public String display() {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < children.size(); i++) {
            sb.append(children.get(i).display());
            if (i < children.size() - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public void addChild(final FileSystemObject child) {
        this.children.add(child);
    }
}
