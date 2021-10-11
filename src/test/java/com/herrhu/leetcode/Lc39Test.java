package com.herrhu.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Lc39Test {
    @Test
    public void testWihtExample() {
        int[] c = {2,3,6,7};
        int target = 7;

        List<Integer> ans1 = Arrays.asList(2, 2, 3);
        List<Integer> ans2 = Arrays.asList(7);

        Lc39 lc39 = new Lc39();
        List<List<Integer>> lists = lc39.combinationSum(c, target);
        assertEquals(true, lists.contains(ans1));
        assertEquals(true, lists.contains(ans2));
    }
}
