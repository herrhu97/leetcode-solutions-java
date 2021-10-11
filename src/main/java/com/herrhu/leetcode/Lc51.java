package com.herrhu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Lc51 {
    /*
    用数组记录横行、竖行及对角线
    对角线如何映射到数组中： k = y - x + n; k = y + x
    横行n个 竖行n个 两个对角线2n-1
    */
    List<List<String>> res = new ArrayList<>();
    char[][] g;
    boolean[] col;
    boolean[] dg;
    boolean[] udg;

    void dfs(int x, int n) {
        //搜到了
        if(x == n) {
            List<String> path = new ArrayList<>();
            for(int i = 0; i < n; i ++) {
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j < n; j ++) {
                    sb.append(g[i][j]);
                }
                path.add(sb.toString());
            }

            res.add(path);
            return;
        }

        for(int y = 0; y < n; y ++) {
            if(!col[y] && !dg[y - x + n] && !udg[y + x]){
                g[x][y] = 'Q';
                col[y] = true;
                dg[y - x + n] = true;
                udg[y + x] = true;
                dfs(x + 1, n);
                //回溯
                g[x][y] = '.';
                col[y] = false;
                dg[y - x + n] = false;
                udg[y + x] = false;
            }
        }

    }

    public List<List<String>> solveNQueens(int n) {
        g = new char[n][n];
        col = new boolean[n];
        dg = new boolean[2 * n];
        udg = new boolean[2 * n];
        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < n; j ++) {
                g[i][j] = '.';
            }
        }

        dfs(0, n);
        return res;
    }
}
