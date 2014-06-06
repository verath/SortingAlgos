package com.ibepeter.sortingAlgos;

import static org.junit.Assert.*;

public class InsertionSortTest extends SortingAlgoBaseTest {

    @Override
    protected SortingAlgorithm getSortingAlgoInstance() {
        return new InsertionSort();
    }
}