package org.design_patterns.behavioral.iterator.classes.aggregates;

import org.design_patterns.behavioral.iterator.classes.iterators.ArrayListIterator;
import org.design_patterns.behavioral.iterator.classes.iterators.Iterator;

import java.util.Arrays;

public class ArrayList<E> implements Aggregate<E> {
    private Object[] array = new Object[10];
    private int currentIndex = -1;

    @Override
    public Iterator<E> createIterator() {
        return new ArrayListIterator<>(this);
    }

    @SuppressWarnings("unchecked")
    public E get(final int index) {
        return (E) this.array[index];
    }

    public void add(final E element) {
        if (++this.currentIndex >= array.length) {
            this.array = Arrays.copyOf(this.array, this.array.length * 2);
        }
        this.array[this.currentIndex] = element;
    }

    public int size() {
        return this.currentIndex + 1;
    }
}
