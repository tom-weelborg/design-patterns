package org.design_patterns.architectural.specification.classes.specifications;

public interface Specification<T> {
    boolean isSatisfiedBy(final T t);

    default Specification<T> and(final Specification<T> other) {
        return t -> this.isSatisfiedBy(t) && other.isSatisfiedBy(t);
    }

    default Specification<T> or(final Specification<T> other) {
        return t -> this.isSatisfiedBy(t) || other.isSatisfiedBy(t);
    }

    default Specification<T> not() {
        return t -> !this.isSatisfiedBy(t);
    }
}
