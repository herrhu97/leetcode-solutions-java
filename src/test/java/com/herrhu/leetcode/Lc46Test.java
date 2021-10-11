package com.herrhu.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Lc46Test {

    @Test
    public void testWithExample1() {
        int[] nums = {1,2,3};
        List<Integer> ans1 = Arrays.asList(1,2,3);
        List<Integer> ans2 = Arrays.asList(1,3,2);
        List<Integer> ans3 = Arrays.asList(2,1,3);
        List<Integer> ans4 = Arrays.asList(2,3,1);
        List<Integer> ans5 = Arrays.asList(3,1,2);
        List<Integer> ans6 = Arrays.asList(3,2,1);

        Lc46 lc46 = new Lc46();
        List<List<Integer>> lists = lc46.permute(nums);
        assertEquals(true, lists.contains(ans1));
        assertEquals(true, lists.contains(ans2));
        assertEquals(true, lists.contains(ans3));
        assertEquals(true, lists.contains(ans4));
        assertEquals(true, lists.contains(ans5));
        assertEquals(true, lists.contains(ans6));
    }
}
