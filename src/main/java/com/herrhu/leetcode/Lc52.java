package com.herrhu.leetcode;

public class Lc52 {
    int n;
    boolean[] col, dg, udg;

    public int totalNQueens(int _n) {
        n = _n;
        col = new boolean[n];
        dg = new boolean[2 * n];
        udg = new boolean[2 * n];
        return dfs(0);
    }

    public int dfs(int u) { //u为行数
        if(u == n) {
            return 1;
        }

        int res = 0;
        for(int i = 0; i < n; i ++) { //i为列数
            if(!col[i] && !dg[u - i + n] && !udg[u + i]) {
                col[i] = dg[u - i + n] = udg[u + i] = true;
                res += dfs(u + 1);
                col[i] = dg[u - i + n] = udg[u + i] = false;
            }
        }

        return res;
    }
}
