package org.design_patterns.structural.composite.classes;

import org.design_patterns.structural.composite.classes.components.File;
import org.design_patterns.structural.composite.classes.components.Folder;

public class Main {
    public static void main(String[] args) {
        final Folder folder1 = new Folder();
        final Folder folder2 = new Folder();

        final File file1 = new File();
        file1.setText("File A");
        final File file2 = new File();
        file2.setText("File B");
        final File file3 = new File();
        file3.setText("File C");

        folder1.addChild(folder2);
        folder1.addChild(file1);

        folder2.addChild(file2);
        folder2.addChild(file3);

        System.out.println(folder1.display());
    }
}
