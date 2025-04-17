package org.design_patterns.behavioral.chain_of_responsibility.classes;

import org.design_patterns.behavioral.chain_of_responsibility.classes.handlers.Handler;

public class AuthService {
    private final Handler handler;

    public AuthService(final Handler handler) {
        this.handler = handler;
    }

    public boolean canAccessAdminPage(final User user) {
        return handler.handle(user);
    }
}
