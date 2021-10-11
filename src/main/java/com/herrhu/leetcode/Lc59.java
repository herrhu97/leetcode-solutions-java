package com.herrhu.leetcode;

public class Lc59 {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        boolean[][] flag = new boolean[n][n];

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        for(int i = 1, x = 0, y = 0, d = 0; i <= n * n; i ++) { //i即为当前要附进去的值
            arr[x][y] = i;
            flag[x][y] = true;

            int a = x + dx[d], b = y + dy[d]; // (a, b) 为下一个坐标
            if(a < 0 || a >= n || b < 0 || b >= n || flag[a][b]) { //发现下一个坐标有问题，修正方向
                d = (d + 1) % 4;
                a = x + dx[d];
                b = y + dy[d];
            }

            x = a;
            y = b;
        }

        return arr;
    }
}
