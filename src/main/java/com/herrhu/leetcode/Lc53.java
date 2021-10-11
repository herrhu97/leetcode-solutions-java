package com.herrhu.leetcode;

public class Lc53 {
    public int maxSubArray(int[] nums) {
        //经典dp
        //状态定义： f(i) 为以nums[i]结尾的区间
        //状态计算： f[i] = Math.max(nums[i], f(i - 1) + nums[i])
        //有可能nums[i] 即为最大的区间和，在f(i - 1) 为负数的情况下

        int res = Integer.MIN_VALUE;
        for(int i = 0, last = 0; i < nums.length; i ++) {
            last = nums[i] + Math.max(last, 0);
            res = Math.max(res, last);
        }

        return res;
    }
}
