package org.design_patterns.behavioral.strategy.classes;

import org.design_patterns.behavioral.strategy.classes.strategies.*;

import java.time.LocalTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final int[] arr = new int[] {2, 10, 5, 8, -1, 41};
        sortAndMeasureTime(arr, new InsertionSort());
        sortAndMeasureTime(arr, new SelectionSort());
        sortAndMeasureTime(arr, new BubbleSort());
        sortAndMeasureTime(arr, new MergeSort());
        sortAndMeasureTime(arr, new QuickSort());
    }

    private static void sortAndMeasureTime(final int[] arr, final SortingStrategy strategy) {
        final LocalTime start = LocalTime.now();
        final int[] copy = Arrays.copyOf(arr, arr.length);
        strategy.sort(copy);
        final LocalTime end = LocalTime.now();

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Sorted array: " + Arrays.toString(copy));
        System.out.println(end.getNano() - start.getNano());
        System.out.println();
    }
}
