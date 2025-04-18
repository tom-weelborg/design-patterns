package org.design_patterns.behavioral.iterator.classes.iterators;

import org.design_patterns.behavioral.iterator.classes.aggregates.ArrayList;

public class ArrayListIterator<E> implements Iterator<E> {
    private final ArrayList<E> arrayList;
    private int index;

    public ArrayListIterator(final ArrayList<E> arrayList) {
        this.arrayList = arrayList;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.arrayList.size();
    }

    @Override
    public E next() {
        if (hasNext()) {
            return this.arrayList.get(this.index++);
        }
        throw new IllegalStateException();
    }

    @Override
    public void reset() {
        this.index = 0;
    }
}
