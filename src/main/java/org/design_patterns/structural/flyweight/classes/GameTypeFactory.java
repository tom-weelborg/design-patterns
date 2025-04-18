package org.design_patterns.structural.flyweight.classes;

import java.util.List;
import java.util.Map;

public class GameTypeFactory {
    private final List<GameType> gameTypes = List.of(
            new GameType("Horror", "Horror games are usually scary."),
            new GameType("Strategy", "Strategy games require planning skills.")
    );

    public GameType findGameTypeByName(final String gameTypeName) {
        return this.gameTypes.stream()
                .filter(gameType -> gameType.name().equals(gameTypeName))
                .findFirst().orElse(null);
    }
}
