package org.design_patterns.creational.builder.classes;

public class Character {
    public static class CharacterBuilder {
        private String name;
        private int age;
        private double strength;
        private double speed;
        private double intelligence;

        private CharacterBuilder() {

        }

        public CharacterBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public CharacterBuilder age(final int age) {
            this.age = age;
            return this;
        }

        public CharacterBuilder strength(final double strength) {
            this.strength = strength;
            return this;
        }

        public CharacterBuilder speed(final double speed) {
            this.speed = speed;
            return this;
        }

        public CharacterBuilder intelligence(final double intelligence) {
            this.intelligence = intelligence;
            return this;
        }

        public Character build() {
            return new Character(this.name, this.age, this.strength, this.speed, this.intelligence);
        }
    }

    private final String name;
    private final int age;
    private final double strength;
    private final double speed;
    private final double intelligence;

    private Character(final String name, final int age, final double strength, final double speed, final double intelligence) {
        this.name = name;
        this.age = age;
        this.strength = strength;
        this.speed = speed;
        this.intelligence = intelligence;
    }

    public static CharacterBuilder builder() {
        return new CharacterBuilder();
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", strength=" + strength +
                ", speed=" + speed +
                ", intelligence=" + intelligence +
                '}';
    }
}
