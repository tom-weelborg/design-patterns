package org.design_patterns.behavioral.chain_of_responsibility.classes.handlers;

import org.design_patterns.behavioral.chain_of_responsibility.classes.User;
import org.design_patterns.behavioral.chain_of_responsibility.classes.UserRepository;

import java.util.Optional;

public class UserExistsHandler extends Handler {
    private final UserRepository userRepository;

    public UserExistsHandler(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean handle(final User user) {
        final Optional<User> userOptional = this.userRepository.findUserByUsername(user.getUsername());
        if (userOptional.isPresent()) {
            return handleNext(user);
        } else {
            System.out.println("This user does not exist.");
            return false;
        }
    }
}
