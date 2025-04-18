package org.design_patterns.behavioral.command.classes.commands;

import org.design_patterns.behavioral.command.classes.Game;

public abstract class Action {
    protected final Game game;

    protected Action(final Game game) {
        this.game = game;
    }

    public abstract void execute();
}
