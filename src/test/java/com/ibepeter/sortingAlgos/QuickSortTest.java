package com.ibepeter.sortingAlgos;

import static org.junit.Assert.*;

public class QuickSortTest extends SortingAlgoBaseTest {

    @Override
    protected SortingAlgorithm getSortingAlgoInstance() {
        return new QuickSort();
    }
}