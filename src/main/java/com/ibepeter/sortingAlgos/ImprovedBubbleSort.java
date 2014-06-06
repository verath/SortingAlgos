package com.ibepeter.sortingAlgos;

/**
 * Created by Peter on 2014-03-05.
 */
public class ImprovedBubbleSort implements SortingAlgorithm {

    private static void swap(Comparable[] arr, int index1, int index2) {
        Comparable temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


    @Override
    public void sort(Comparable[] arr) {
        int n = arr.length - 1;
        do {
            int newN = 0;
            for (int i = 1; i <= n; i++) {
                if (arr[i - 1].compareTo(arr[i]) > 0) {
                    swap(arr, i, i - 1);
                    newN = i;
                }
            }
            n = newN;
        } while (n > 0);
    }
}
