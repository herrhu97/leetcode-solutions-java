package com.herrhu.leetcode;

public class Lc64 {
    public int minPathSum(int[][] g) {
        int[][] f = new int[g.length][g[0].length];
        for(int i = 0; i < g.length; i ++) {
            for(int j = 0; j < g[0].length; j ++) {
                if(i == 0 && j == 0) f[i][j] = g[i][j];
                if(i == 0 && j != 0) f[i][j] = f[i][j - 1] + g[i][j];
                if(i != 0 && j == 0) f[i][j] = f[i - 1][j] + g[i][j];
                if(i != 0 && j != 0) f[i][j] = Math.min(f[i - 1][j], f[i][j - 1]) + g[i][j];
            }
        }

        return f[g.length - 1][g[0].length - 1];
    }
}
