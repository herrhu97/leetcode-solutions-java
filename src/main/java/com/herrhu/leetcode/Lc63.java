package com.herrhu.leetcode;

public class Lc63 {
    public int uniquePathsWithObstacles(int[][] g) {
        int[][] f = new int[g.length][g[0].length];

        for(int i = 0; i < g.length; i ++) {
            for(int j = 0; j < g[0].length; j ++) {
                if(g[i][j] == 1) f[i][j] = 0;
                else if(i == 0 && j == 0) f[i][j] = 1;
                else {
                    if(i != 0) f[i][j] += f[i - 1][j]; //f[i][j] 一定要由左边或上边的数字得来
                    if(j != 0) f[i][j] += f[i][j - 1];
                }
            }
        }

        return f[g.length - 1][g[0].length - 1];
    }
}
