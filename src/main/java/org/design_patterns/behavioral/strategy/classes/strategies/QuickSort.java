package org.design_patterns.behavioral.strategy.classes.strategies;

public class QuickSort implements SortingStrategy {
    @Override
    public void sort(final int[] arr) {
        quickSort(arr, 0, arr.length -1);
    }

    private void quickSort(final int[] arr, final int low, final int high) {
        if (low < high) {
            final int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private int partition(final int[] arr, final int low, final int high) {
        final int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                final int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        final int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
