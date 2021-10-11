package com.herrhu.leetcode;

/**
 * @description:
 * @author: HerrHu
 * @time: 2021/3/20 20:41
 */
public class Lc169 {
    public int majorityElement(int[] nums) {
        //y总 竞赛贼难题
        int c = 0;
        int r = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (c == 0) {
                r = nums[i];
                c ++;
            } else if (nums[i] == r){
                c ++;
            } else {
                c --;
            }
        }
        return r;
    }
}
