package com.herrhu.leetcode;

/**
 * @description:
 * @author: HerrHu
 * @time: 2021/4/3 00:48
 */
public class Lc494 {
    public int findTargetSumWays(int[] nums, int target) {
        // sum为数组所有元素的和，target为我们要求的和
        // left集合（为所有带+的元素的和），right（为所有带-的元素的和）
        // 得到left + right = sum 和 left - right = target
        // left = (sum + target) / 2 => 问题转化为：数组中元素和为left的集合有多少种
        //dp[j] 表示填充大小为j的背包有多少种
        //dp[j] += d[j - nums[i]]

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        // sum + target 必须要是偶数，sum至少要>=target
        if ((sum + target) % 2 == 1 || sum < target) {
            return 0;
        }

        int left = (sum + target) / 2;

        int[] dp = new int[left + 1];
        dp[0] = 1; //填充容量为1的背包，共一种方法，将0放入背包

        //01背包问题一维dp的遍历，nums放在外循环，target在内循环，且内循环倒序。
        for (int i = 0; i < nums.length; i++) {
            for (int j = left; j >= nums[i]; j--) {
                dp[j] += dp[j - nums[i]];
            }
        }

        return dp[left];

    }
}
