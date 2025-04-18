package org.design_patterns.behavioral.command.classes;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final List<Turn> turns = new ArrayList<>();
    private boolean isLost = false;

    public Game() {
        this.startNewTurn();
    }

    public Turn getCurrentTurn() {
        return this.turns.get(this.turns.size() - 1);
    }

    public void startNewTurn() {
        this.turns.add(new Turn());
    }

    public void forfeit() {
        this.isLost = true;
    }
}
