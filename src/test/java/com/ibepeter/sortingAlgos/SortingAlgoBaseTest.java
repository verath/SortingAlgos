package com.ibepeter.sortingAlgos;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Peter on 06/06/14.
 */
public abstract class SortingAlgoBaseTest extends TestCase {

    private static boolean isSorted(Comparable[] arr, int start, int end) {
        for (int i = start; i < (end - 1); i++) {
            if (arr[i + 1].compareTo(arr[i]) < 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isSorted(Comparable[] arr) {
        return isSorted(arr, 0, arr.length);
    }


    public static boolean testAlgorithm(SortingAlgorithm algo) {
        Integer[] toBeSorted = new Integer[100];
        for (int j = 0; j < toBeSorted.length; j++) {
            toBeSorted[j] = toBeSorted.length - j;
        }

        algo.sort(toBeSorted);
        return isSorted(toBeSorted);
    }

    @Test
    public void testSort() throws Exception {
        SortingAlgorithm algo = getSortingAlgoInstance();
        assertNotNull("Extending test class provided null for sorting algo.", algo);
        assertTrue("Result was not sorted", SortingAlgoBaseTest.testAlgorithm(algo));
    }

    protected abstract SortingAlgorithm getSortingAlgoInstance();
}
