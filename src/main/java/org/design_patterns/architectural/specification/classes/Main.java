package org.design_patterns.architectural.specification.classes;

import org.design_patterns.architectural.specification.classes.specifications.DoesHaveSpecialAllowanveSpecification;
import org.design_patterns.architectural.specification.classes.specifications.IsAdultSpecification;
import org.design_patterns.architectural.specification.classes.specifications.IsPremiumUserSpecification;
import org.design_patterns.architectural.specification.classes.specifications.Specification;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<User> users = List.of(
                new User("George", 20, false, false),
                new User("Steve", 18, false, true),
                new User("Alicia", 17, false, false),
                new User("Mia", 16, true, false),
                new User("Tim", 15, true, true)
        );
        final Specification<User> eligibleUserSpecification = new IsPremiumUserSpecification()
                .and(new IsAdultSpecification().or(new DoesHaveSpecialAllowanveSpecification()));
        for (final User user : users) {
            System.out.println(user.getUsername() + ": " + eligibleUserSpecification.isSatisfiedBy(user));
        }
    }
}
