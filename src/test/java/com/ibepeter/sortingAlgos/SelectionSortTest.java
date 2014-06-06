package com.ibepeter.sortingAlgos;

import static org.junit.Assert.*;

public class SelectionSortTest extends SortingAlgoBaseTest {

    @Override
    protected SortingAlgorithm getSortingAlgoInstance() {
        return new SelectionSort();
    }
}