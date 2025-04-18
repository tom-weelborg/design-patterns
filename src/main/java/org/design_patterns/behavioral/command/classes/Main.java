package org.design_patterns.behavioral.command.classes;

import org.design_patterns.behavioral.command.classes.commands.Action;
import org.design_patterns.behavioral.command.classes.commands.ForfeitGameAction;
import org.design_patterns.behavioral.command.classes.commands.SkipTurnAction;

public class Main {
    public static void main(String[] args) {
        final Game game = new Game();
        executeAction(game, new SkipTurnAction(game));
        executeAction(game, new ForfeitGameAction(game));
    }

    private static void executeAction(final Game game, final Action action) {
        game.getCurrentTurn().executeAction(action);
    }
}
