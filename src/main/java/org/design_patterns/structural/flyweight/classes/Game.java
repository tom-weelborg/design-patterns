package org.design_patterns.structural.flyweight.classes;

public class Game {
    private final String name;
    private final GameType gameType;

    public Game(final String name, final String gameTypeName) {
        this.name = name;
        this.gameType = new GameTypeFactory().findGameTypeByName(gameTypeName);
    }
}
