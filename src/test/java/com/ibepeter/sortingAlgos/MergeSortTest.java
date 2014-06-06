package com.ibepeter.sortingAlgos;

import static org.junit.Assert.*;

public class MergeSortTest extends SortingAlgoBaseTest  {

    @Override
    protected SortingAlgorithm getSortingAlgoInstance() {
        return new MergeSort();
    }
}