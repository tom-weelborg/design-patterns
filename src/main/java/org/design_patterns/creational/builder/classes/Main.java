package org.design_patterns.creational.builder.classes;

public class Main {
    public static void main(String[] args) {
        final CharacterDirector director = new CharacterDirector();
        final Character.CharacterBuilder builder = Character.builder();
        builder
                .name("Steve")
                .age(22);

        director.buildHighStrengthCharacter(builder);
        System.out.println(builder.build());

        director.buildHighSpeedCharacter(builder);
        System.out.println(builder.build());

        director.buildHighIntelligenceCharacter(builder);
        System.out.println(builder.build());
    }
}
