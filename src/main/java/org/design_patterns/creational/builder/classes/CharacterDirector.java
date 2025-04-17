package org.design_patterns.creational.builder.classes;

public class CharacterDirector {
    private static final double HIGH_VALUE = 10;
    private static final double MEDIUM_VALUE = 5;

    public void buildHighStrengthCharacter(final Character.CharacterBuilder characterBuilder) {
        characterBuilder
                .strength(HIGH_VALUE)
                .speed(MEDIUM_VALUE)
                .intelligence(MEDIUM_VALUE);
    }

    public void buildHighSpeedCharacter(final Character.CharacterBuilder characterBuilder) {
        characterBuilder
                .speed(HIGH_VALUE)
                .strength(MEDIUM_VALUE)
                .intelligence(MEDIUM_VALUE);
    }

    public void buildHighIntelligenceCharacter(final Character.CharacterBuilder characterBuilder) {
        characterBuilder
                .intelligence(HIGH_VALUE)
                .strength(MEDIUM_VALUE)
                .speed(MEDIUM_VALUE);
    }
}
