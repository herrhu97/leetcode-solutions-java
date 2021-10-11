package com.herrhu.leetcode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lc121Test {
    @Test
    public void testStockWithExample1() {
        Lc121 s = new Lc121();
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertEquals(5, s.maxProfit(prices));
    }

    @Test
    public void testStockWithExample2() {
        Lc121 s = new Lc121();
        int[] prices = {7, 6, 4, 3, 1};
        assertEquals(0, s.maxProfit(prices));
    }

    @Test
    public void testStockWithExample3() {
        Lc121 s = new Lc121();
        int[] prices = {};
        assertEquals(0, s.maxProfit(prices));
    }
}
