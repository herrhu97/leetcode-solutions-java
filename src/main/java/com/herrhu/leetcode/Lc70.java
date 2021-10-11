package com.herrhu.leetcode;

public class Lc70 {
    /*
    经典dp
    状态表示：f(i) 爬到第i阶的方法数
    状态计算：f(i) = f(i - 1) + f(i - 2)
    */
    public int climbStairs(int n) {
        int[] f = new int[n + 1];
        for(int i = 1; i <= n; i ++) {
            if(i == 1) f[i] = 1;
            else if(i == 2) f[i] = 2;
            else {
                f[i] = f[i - 1] + f[i - 2];
            }
        }

        return f[n];
    }
}
