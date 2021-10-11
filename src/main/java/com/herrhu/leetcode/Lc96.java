package com.herrhu.leetcode;

public class Lc96 {
    //就是卡特兰数 （2n)! / (n + 1)! / n!
    public int numTrees(int n) {
        int[] f = new int[n + 1];
        f[0] = 1;

        for(int i = 1; i <= n; i ++) {
            for(int j = 1; j <= i; j ++) {
                f[i] += f[j - 1] * f[i - j];
            }
        }
        return f[n];
    }
}
