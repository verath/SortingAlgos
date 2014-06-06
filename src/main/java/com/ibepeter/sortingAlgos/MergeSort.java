package com.ibepeter.sortingAlgos;

/**
 * Created by Peter on 2014-03-04.
 */
public class MergeSort implements SortingAlgorithm {

    private static void merge(Comparable[] arr, Comparable[] temp, int start, int mid, int end) {
        System.arraycopy(arr, start, temp, start, (end - start) + 1);

        int k = start;
        int i = start;
        int j = mid + 1;
        for (; k < (end + 1); k++) {
            if (i > mid) {
                arr[k] = temp[j++];
            } else if (j > end) {
                arr[k] = temp[i++];
            } else if (temp[i].compareTo(temp[j]) > 0) {
                arr[k] = temp[j++];
            } else {
                arr[k] = temp[i++];
            }
        }

    }

    private static void sort(Comparable[] arr, Comparable[] temp, int start, int end) {
        if (start >= end) {
            // 1 element or less always sorted
            return;
        }

        int mid = ((end - start) / 2) + start;

        sort(arr, temp, start, mid);
        sort(arr, temp, mid + 1, end);
        merge(arr, temp, start, mid, end);
    }

    @Override
    public void sort(Comparable[] arr) {
        Comparable[] temp = new Comparable[arr.length];
        sort(arr, temp, 0, arr.length - 1);
    }
}
