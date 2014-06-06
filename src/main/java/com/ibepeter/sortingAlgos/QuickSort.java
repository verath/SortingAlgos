package com.ibepeter.sortingAlgos;

import java.util.Random;

/**
 * Created by Peter on 2014-03-04.
 */
public class QuickSort implements SortingAlgorithm {

    private static void swap(Comparable[] arr, int index1, int index2) {
        if (index1 == index2) return;

        Comparable temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private static int partition(Comparable[] arr, int start, int end) {
        // Array was shuffled, any index should do. Since we want
        // the pivot at the end, lets just pick the end.
        Comparable pivotVal = arr[end];

        int t = start;
        for (int i = start; i < end; i++) {
            if (arr[i].compareTo(pivotVal) <= 0) {
                swap(arr, i, t);
                t++;
            }
        }

        swap(arr, end, t);
        return t;

    }

    private static void sort(Comparable[] arr, int start, int end) {
        if (start >= end) {
            // 1 or 0 entries are sorted
            return;
        }

        int partitionIndex = partition(arr, start, end);
        sort(arr, start, partitionIndex - 1);
        sort(arr, partitionIndex + 1, end);

    }

    @Override
    public void sort(Comparable[] arr) {
        // Shuffle field
        Random r = new Random();
        for (int i = (arr.length - 1); i > 1; i--) {
            swap(arr, i, r.nextInt(i));
        }
        sort(arr, 0, arr.length - 1);
    }
}
