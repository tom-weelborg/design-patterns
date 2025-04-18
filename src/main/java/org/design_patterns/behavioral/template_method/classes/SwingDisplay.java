package org.design_patterns.behavioral.template_method.classes;

import javax.swing.*;

public class SwingDisplay extends Display {
    private final JFrame jFrame = new JFrame();
    private final JTextField jTextField = new JTextField();

    public SwingDisplay() {
        this.jFrame.add(this.jTextField);
        this.jFrame.setSize(100, 100);
    }

    @Override
    protected void clearDisplay() {
        this.jTextField.setText("");
    }

    @Override
    protected void addToDisplay(final String text) {
        this.jTextField.setText(text);
        this.jFrame.setVisible(true);
    }
}
