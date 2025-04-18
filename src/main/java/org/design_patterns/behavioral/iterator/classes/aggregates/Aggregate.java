package org.design_patterns.behavioral.iterator.classes.aggregates;

import org.design_patterns.behavioral.iterator.classes.iterators.Iterator;

public interface Aggregate<E> {
    Iterator<E> createIterator();
}
