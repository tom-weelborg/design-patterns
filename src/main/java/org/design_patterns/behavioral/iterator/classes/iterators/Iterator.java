package org.design_patterns.behavioral.iterator.classes.iterators;

public interface Iterator<T> {
    boolean hasNext();
    T next();
    void reset();
}
