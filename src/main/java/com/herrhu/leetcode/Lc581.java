package com.herrhu.leetcode;

import java.util.Arrays;

/**
 * @description:
 * @author: HerrHu
 * @time: 2021/3/13 23:56
 */
public class Lc581 {
    public int findUnsortedSubarray(int[] nums) {
        if(nums.length == 1) {
            return 0;
        }
        int l = 0;
        while (l + 1 < nums.length && nums[l] <= nums[l + 1]) {
            if(l + 1 == nums.length - 1) {
                return 0;
            }
            l ++;
        }
        int r = nums.length - 1;
        while (r - 1 >= 0 && nums[r] >= nums[r - 1]) {
            r --;
        }

        while(l >= 0) {
            Arrays.sort(nums, l, r + 1);
            if(l == 0 || (l - 1 >= 0 && nums[l] >= nums[l - 1])) {
                break;
            }
            l --;
        }

        while(r < nums.length) {
            Arrays.sort(nums, l, r + 1);
            if(r == nums.length - 1 || (r + 1 < nums.length && nums[r] <= nums[r + 1])) {
                break;
            }
            r ++;
        }
        int ans = r - l + 1;
        return ans;
    }

    public boolean check(int[] nums) {
        for (int i = 0; i + 1 < nums.length; i ++) {
            if(nums[i] <= nums[i + 1]) {
                continue;
            }
            return false;
        }
        return true;
    }
}
