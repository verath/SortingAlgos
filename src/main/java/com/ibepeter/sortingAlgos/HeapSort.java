package com.ibepeter.sortingAlgos;

/**
 * Created by Peter on 2014-03-04.
 */
public class HeapSort implements SortingAlgorithm {

    private static void swap(Comparable[] arr, int index1, int index2) {
        Comparable temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private static void heapify(Comparable[] arr) {
        int start = (arr.length - 2) / 2;
        while (start >= 0) {
            pushDown(arr, start, arr.length - 1);
            start--;
        }
    }

    private static void pushDown(Comparable[] arr, int start, int end) {
        int root = start;

        while (root * 2 + 1 <= end) {
            int lChild = root * 2 + 1;
            int rChild = lChild + 1;
            int swap = root;

            if (arr[lChild].compareTo(arr[swap]) > 0) {
                swap = lChild;
            }

            if (rChild <= end && arr[rChild].compareTo(arr[swap]) > 0) {
                swap = rChild;
            }

            if (swap != root) {
                swap(arr, root, swap);
                root = swap;
            } else {
                break;
            }
        }
    }

    @Override
    public void sort(Comparable[] arr) {
        heapify(arr);

        int end = (arr.length - 1);
        while (end > 0) {
            swap(arr, 0, end);
            end--;
            pushDown(arr, 0, end);
        }
    }

}
