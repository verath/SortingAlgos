package com.ibepeter.sortingAlgos;

/**
 * Created by Peter on 2014-03-04.
 */
public class InsertionSort implements SortingAlgorithm {

    private static void swap(Comparable[] arr, int index1, int index2) {
        Comparable temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    @Override
    public void sort(Comparable[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = (i - 1); j >= 0; j--) {
                if (arr[j + 1].compareTo(arr[j]) < 0) {
                    swap(arr, j, j + 1);
                } else {
                    break;
                }
            }
        }
    }
}
