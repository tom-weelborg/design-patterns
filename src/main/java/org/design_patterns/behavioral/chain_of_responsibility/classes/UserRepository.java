package org.design_patterns.behavioral.chain_of_responsibility.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    private final List<User> users = new ArrayList<>();

    public void addUser(final User user) {
        this.users.add(user);
    }

    public Optional<User> findUserByUsername(final String username) {
        return this.users.stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst();
    }
}
