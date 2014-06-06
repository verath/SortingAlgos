package com.ibepeter.sortingAlgos;

import static org.junit.Assert.*;

public class ImprovedBubbleSortTest extends SortingAlgoBaseTest {

    @Override
    protected SortingAlgorithm getSortingAlgoInstance() {
        return new ImprovedBubbleSort();
    }
}