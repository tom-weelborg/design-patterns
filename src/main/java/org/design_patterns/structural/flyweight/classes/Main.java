package org.design_patterns.structural.flyweight.classes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<Game> games = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            final String gameTypeName;
            if (i % 2 == 0) {
                gameTypeName = "Horror";
            } else {
                gameTypeName = "Strategy";
            }
            games.add(new Game("Game " + i, gameTypeName));
        }
        System.out.println(games.size());
    }
}
