package com.ibepeter.sortingAlgos;

/**
 * Created by Peter on 2014-03-04.
 */
public class BubbleSort implements SortingAlgorithm {

    private static void swap(Comparable[] arr, int index1, int index2) {
        Comparable temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    @Override
    public void sort(Comparable[] arr) {
        boolean didSwap = false;

        do {
            didSwap = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1].compareTo(arr[i]) > 0) {
                    swap(arr, i, i - 1);
                    didSwap = true;
                }
            }
        } while (didSwap);
    }
}
