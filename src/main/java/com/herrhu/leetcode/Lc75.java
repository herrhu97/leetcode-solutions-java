package com.herrhu.leetcode;

/**
 * @description:
 * @author: HerrHu
 * @time: 2021/3/20 10:20
 */
public class Lc75 {
    public void sortColors(int[] nums) {
        //偏题 背就好了
        //可以统计0的个数，1的个数，2的个数，直接弄出一个数组交上去
        for (int i = 0, j = 0, k = nums.length - 1; i <= k; ) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i ++;
                j ++;
            } else if(nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k --;
            } else {
                i ++;
            }
        }
    }
}
