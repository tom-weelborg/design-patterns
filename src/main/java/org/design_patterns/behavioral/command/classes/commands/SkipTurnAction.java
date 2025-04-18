package org.design_patterns.behavioral.command.classes.commands;

import org.design_patterns.behavioral.command.classes.Game;

public class SkipTurnAction extends Action {
    public SkipTurnAction(final Game game) {
        super(game);
    }

    @Override
    public void execute() {
        this.game.startNewTurn();
        System.out.println("A new turn was begun.");
    }
}
