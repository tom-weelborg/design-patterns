package org.design_patterns.behavioral.memento.classes;

import java.util.Deque;
import java.util.LinkedList;

public class Editor {
    private Deque<TextArea.Memento> stateHistory;
    private TextArea textArea;

    public Editor() {
        this.stateHistory = new LinkedList<>();
        this.textArea = new TextArea();
    }

    public void write(final String text) {
        this.textArea.setText(text);
        this.stateHistory.add(this.textArea.takeSnapshot());
    }

    public void undo() {
        this.textArea.restore(this.stateHistory.pop());
    }
}
