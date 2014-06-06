package com.ibepeter.sortingAlgos;

import static org.junit.Assert.*;

public class HeapSortTest extends SortingAlgoBaseTest {

    @Override
    protected SortingAlgorithm getSortingAlgoInstance() {
        return new HeapSort();
    }
}