package org.design_patterns.behavioral.strategy.classes.strategies;

public class MergeSort implements SortingStrategy {
    @Override
    public void sort(final int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private void mergeSort(final int[] arr, final int left, final int right) {
        if (left < right) {
            final int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private void merge(final int[] arr, final int left, final int mid, final int right) {
        final int n1 = mid - left + 1;
        final int n2 = right - mid;

        final int[] leftArray = new int[n1];
        final int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int i = 0; i < n2; i++) {
            rightArray[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }

        while (i < n1) {
            arr[k++] = leftArray[i++];
        }
        while (j < n2) {
            arr[k++] = rightArray[j++];
        }
    }
}
