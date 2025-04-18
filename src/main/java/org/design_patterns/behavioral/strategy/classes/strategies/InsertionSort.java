package org.design_patterns.behavioral.strategy.classes.strategies;

public class InsertionSort implements SortingStrategy {
    @Override
    public void sort(final int[] arr) {
        final int n = arr.length;
        for (int i = 1; i < n; i++) {
            final int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
