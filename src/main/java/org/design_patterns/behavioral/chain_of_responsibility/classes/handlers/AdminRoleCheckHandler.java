package org.design_patterns.behavioral.chain_of_responsibility.classes.handlers;

import org.design_patterns.behavioral.chain_of_responsibility.classes.User;

public class AdminRoleCheckHandler extends Handler {
    @Override
    public boolean handle(final User user) {
        if (user.getRoles().contains("admin")) {
            return handleNext(user);
        } else {
            System.out.println("The given user is not an admin.");
            return false;
        }
    }
}
