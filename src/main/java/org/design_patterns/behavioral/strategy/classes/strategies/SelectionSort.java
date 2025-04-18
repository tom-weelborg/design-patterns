package org.design_patterns.behavioral.strategy.classes.strategies;

public class SelectionSort implements SortingStrategy {
    @Override
    public void sort(final int[] arr) {
        final int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            final int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
