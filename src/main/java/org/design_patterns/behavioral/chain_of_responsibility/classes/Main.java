package org.design_patterns.behavioral.chain_of_responsibility.classes;

import org.design_patterns.behavioral.chain_of_responsibility.classes.handlers.AdminRoleCheckHandler;
import org.design_patterns.behavioral.chain_of_responsibility.classes.handlers.Handler;
import org.design_patterns.behavioral.chain_of_responsibility.classes.handlers.UserExistsHandler;
import org.design_patterns.behavioral.chain_of_responsibility.classes.handlers.ValidPasswordHandler;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final UserRepository userRepository = new UserRepository();
        createUsers(userRepository);

        final Handler handler = new UserExistsHandler(userRepository);
        handler
                .setNext(new ValidPasswordHandler(userRepository))
                .setNext(new AdminRoleCheckHandler());
        final AuthService authService = new AuthService(handler);

        checkAccess(authService, new User("admin_username", "admin_password"));
        checkAccess(authService, new User("admin", "admin_password"));
        checkAccess(authService, new User("admin_username", "admin"));
        checkAccess(authService, new User("user_username", "user_password"));
    }

    private static void createUsers(final UserRepository userRepository) {
        userRepository.addUser(new User("admin_username", "admin_password", List.of("admin")));
        userRepository.addUser(new User("user_username", "user_password", List.of("user")));
    }

    private static void checkAccess(final AuthService authService, final User user) {
        System.out.println("user is admin: " + authService.canAccessAdminPage(user));
        System.out.println();
    }
}
