package org.design_patterns.architectural.specification.classes.specifications;

import org.design_patterns.architectural.specification.classes.User;

public class DoesHaveSpecialAllowanveSpecification implements Specification<User> {
    @Override
    public boolean isSatisfiedBy(final User user) {
        return user.doesHaveSpecialAllowance();
    }
}
