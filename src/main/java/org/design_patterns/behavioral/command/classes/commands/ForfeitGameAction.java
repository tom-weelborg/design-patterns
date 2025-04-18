package org.design_patterns.behavioral.command.classes.commands;

import org.design_patterns.behavioral.command.classes.Game;

public class ForfeitGameAction extends Action {
    public ForfeitGameAction(final Game game) {
        super(game);
    }

    @Override
    public void execute() {
        this.game.forfeit();
        System.out.println("Game is forfeited.");
    }
}
