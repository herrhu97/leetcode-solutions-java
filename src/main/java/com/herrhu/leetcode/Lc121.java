package com.herrhu.leetcode;

public class Lc121 {
    int maxProfit(int prices[]){
        int n = prices.length;
        if (n == 0) return 0;
        int[] f = new int[n];
        int ans = 0;
        int minv = prices[0];
        for (int i = 1; i < n; i++) {
            ans = Math.max(ans, prices[i] - minv);
            minv = Math.min(minv, prices[i]);
        }
        return ans;
    }
}
