package com.herrhu.leetcode;

/**
 * @description:
 * @author: HerrHu
 * @time: 2021/3/20 19:42
 */
public class Lc152 {
    public int maxProduct(int[] nums) {
        //dp[i] 以数组第i个数字结尾的子数组中最大的乘积
        //一定要用纸笔画图，特点是两个dp数组


        int ans = Integer.MIN_VALUE;
        int[] f = new int[nums.length + 1];
        int[] g = new int[nums.length + 1];
        g[0] = 1;
        f[0] = 1;

        for (int i = 1; i <= nums.length; i ++) {
            if(nums[i - 1] >= 0) {
                f[i] = Math.max(f[i - 1] * nums[i - 1], nums[i - 1]);
                g[i] = Math.min(g[i - 1] * nums[i - 1], nums[i - 1]);
            } else {
                f[i] = Math.max(g[i - 1] * nums[i - 1], nums[i - 1]);
                g[i] = Math.min(f[i - 1] * nums[i - 1], nums[i - 1]);
            }

            ans = Math.max(ans, f[i]);
        }

        return ans;





    }
}
