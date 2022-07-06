package com.chen.binarySearch;

import org.junit.Test;

import static com.chen.binarySearch.BinarySearchNoRecursion.binarySearch;

public class BinarySearchTest {
    @Test
    public void testBinarySearchNoRecursion() {
        int[] arr = {1, 3, 8, 10, 11, 67, 100};
        int index = binarySearch(arr, 100);
        System.out.println("要找的数的索引为index=" + index);
    }

}
