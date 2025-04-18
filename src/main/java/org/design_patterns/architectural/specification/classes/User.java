package org.design_patterns.architectural.specification.classes;

public class User {
    private String username;
    private int age;
    private boolean doesHaveSpecialAllowance;
    private boolean isPremium;

    public User(final String username, final int age, final boolean doesHaveSpecialAllowance, final boolean isPremium) {
        this.username = username;
        this.age = age;
        this.doesHaveSpecialAllowance = doesHaveSpecialAllowance;
        this.isPremium = isPremium;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public boolean doesHaveSpecialAllowance() {
        return doesHaveSpecialAllowance;
    }

    public boolean isPremium() {
        return isPremium;
    }
}
