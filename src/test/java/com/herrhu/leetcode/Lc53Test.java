package com.herrhu.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lc53Test {
    @Test
    public void testWithExample1() {
        Lc53 lc53 = new Lc53();
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(6, lc53.maxSubArray(arr));
    }

    @Test
    public void testWithExample2() {
        Lc53 lc53 = new Lc53();
        int arr[] = {1};
        assertEquals(1, lc53.maxSubArray(arr));
    }
}
