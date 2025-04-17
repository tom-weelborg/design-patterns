package org.design_patterns.behavioral.chain_of_responsibility.classes;

import java.util.List;

public class User {
    private String username;
    private String password;
    private List<String> roles;

    public User(final String username, final String password) {
        this.username = username;
        this.password = password;
    }

    public User(final String username, final String password, final List<String> roles) {
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<String> getRoles() {
        return roles;
    }
}
