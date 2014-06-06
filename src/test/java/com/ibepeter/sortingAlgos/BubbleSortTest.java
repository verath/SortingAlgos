package com.ibepeter.sortingAlgos;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest extends SortingAlgoBaseTest {

    @Override
    protected SortingAlgorithm getSortingAlgoInstance() {
        return new BubbleSort();
    }
}