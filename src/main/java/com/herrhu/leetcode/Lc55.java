package com.herrhu.leetcode;

public class Lc55 {
    public boolean canJump(int[] nums) {
        if(nums.length == 1) { //长度为一，第一个元素即最后一个元素
            return true;
        }

        for(int i = 0; i < nums.length - 1; i ++) { //省去最后一个元素，因为能跳过前面的元素肯定能到最后一个元素
            if(nums[i] == 0) {
                if(canSolve(i, nums)) {
                    continue;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
    //判断是否能够跳过，但对于最后一个元素到达即可
    public boolean canSolve(int i, int[] nums) {
        int d = 1;
        while(i >= 0 && i - d >= 0) {
            if(nums[i - d] > d) {
                return true;
            }
            d ++;
        }
        return false;
    }

    //y总解法 很奇妙
    public boolean canJump2(int[] nums) {
        for(int i = 0, j = 0; i < nums.length; i ++) {
            if(j < i) return false;
            j = Math.max(j, i + nums[i]);
        }
        return true;
    }
}
