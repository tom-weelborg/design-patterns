package org.design_patterns.behavioral.chain_of_responsibility.classes.handlers;

import org.design_patterns.behavioral.chain_of_responsibility.classes.User;
import org.design_patterns.behavioral.chain_of_responsibility.classes.UserRepository;

import java.util.Optional;

public class ValidPasswordHandler extends Handler {
    private final UserRepository userRepository;

    public ValidPasswordHandler(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean handle(final User user) {
        final Optional<User> userOptional = this.userRepository.findUserByUsername(user.getUsername());
        if (userOptional.isPresent() && userOptional.get().getPassword().equals(user.getPassword())) {
            return handleNext(userOptional.get());
        } else {
            System.out.println("The password is incorrect.");
            return false;
        }
    }
}
