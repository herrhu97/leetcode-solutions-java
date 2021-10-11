package com.herrhu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Lc54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] g = new boolean[m][n];

        int dx[] = {0, 1, 0, -1}, dy[] = {1, 0, -1, 0};

        for(int i = 0, x = 0, y = 0, d = 0; i < n * m; i ++) {
            res.add(matrix[x][y]);
            g[x][y] = true;

            int a = x + dx[d], b = y + dy[d];
            if( a < 0 || a >= m || b < 0 || b >= n || g[a][b]) {
                d = (d + 1) % 4;
                a = x + dx[d];
                b = y + dy[d];
            }

            x = a;
            y = b;
        }

        return res;
    }
}
