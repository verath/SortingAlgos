package com.ibepeter.sortingAlgos;

/**
 * Created by Peter on 2014-03-04.
 */

public class SelectionSort implements SortingAlgorithm {

    private static void swap(Comparable[] arr, int index1, int index2) {
        Comparable temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    @Override
    public void sort(Comparable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int low = i;
            for (int j = (i + 1); j < arr.length; j++) {
                if (arr[low].compareTo(arr[j]) > 0) {
                    low = j;
                }
            }
            swap(arr, low, i);
        }
    }
}
