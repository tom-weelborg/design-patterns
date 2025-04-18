package org.design_patterns.behavioral.iterator.classes;

import org.design_patterns.behavioral.iterator.classes.aggregates.ArrayList;
import org.design_patterns.behavioral.iterator.classes.iterators.Iterator;

public class Main {
    public static void main(String[] args) {
        final ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }

        final Iterator<Integer> iterator = arrayList.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();
        iterator.reset();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
