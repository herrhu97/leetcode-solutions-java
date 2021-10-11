package com.herrhu.leetcode;

public class Lc62 {
    /*
    dfs暴搜失效，得用dp
    */

    public int uniquePaths(int m, int n) {
        int[][] f = new int[m][n];

        for(int i = 0; i < m; i ++) {
            for(int j = 0; j < n; j ++) {
                if(i == 0 || j == 0) f[i][j] = 1;
                else {
                    f[i][j] = f[i - 1][j] + f[i][j - 1];
                }
            }
        }

        return f[m - 1][n - 1];
    }
}
