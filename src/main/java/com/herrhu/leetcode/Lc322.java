package com.herrhu.leetcode;

import java.util.Arrays;

/**
 * @description:
 * @author: HerrHu
 * @time: 2021/3/14 20:06
 */
public class Lc322 {

    public int coinChange(int[] coins, int m) {
        // 01背包 f[i][j] = Math.max(f[i - 1][j], f[i - 1][j - v[i]] + w[i])
        //完全背包 f[i][j] = Math.max(f[i - 1][j], f[i][j - v[i]] + w[i])

        int[] f = new int[m + 1];
        Arrays.fill(f, Integer.MAX_VALUE / 2);
        f[0] = 0;
        for (int v : coins) {
            for (int j = v; j <= m; j ++) {
                f[j] = Math.min(f[j], f[j - v] + 1);
                //f[i][j] = Math.min(f[i - 1][j], f[i][j - v[i]] + w[i])
            }
        }
        if (f[m] >= Integer.MAX_VALUE / 2) return -1;
        return f[m];

    }

}
