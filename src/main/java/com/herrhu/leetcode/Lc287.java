package com.herrhu.leetcode;

/**
 * @description:
 * @author: HerrHu
 * @time: 2021/3/14 20:14
 */
public class Lc287 {

    public int findDuplicate(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
            if (arr[nums[i]] == 2) {
                return nums[i];
            }
        }
        return 0; //写哪个都行
    }
}
