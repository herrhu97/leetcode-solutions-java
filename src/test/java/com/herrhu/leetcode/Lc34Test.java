package com.herrhu.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lc34Test {
    @Test
    public void testWithExample1() {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        Lc34 lc34 = new Lc34();
        int[] res = lc34.searchRange(nums, target);
        int[] ans = {3, 4};
        for(int i = 0; i < ans.length; i ++) {
            assertEquals(res[i], ans[i]);
        }
    }

    @Test
    public void testWithExample2() {
        int[] nums = {5,7,7,8,8,10};
        int target = 6;
        Lc34 lc34 = new Lc34();
        int[] res = lc34.searchRange(nums, target);
        int[] ans = {-1,-1};
        for(int i = 0; i < ans.length; i ++) {
            assertEquals(res[i], ans[i]);
        }
    }

    @Test
    public void testWithExample3() {
        int[] nums = {};
        int target = 0;
        Lc34 lc34 = new Lc34();
        int[] res = lc34.searchRange(nums, target);
        int[] ans = {-1,-1};
        for(int i = 0; i < ans.length; i ++) {
            assertEquals(res[i], ans[i]);
        }
    }
}
