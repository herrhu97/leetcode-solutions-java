package com.herrhu.leetcode;

/**
 * @description:
 * @author: HerrHu
 * @time: 2021/3/20 11:07
 */
public class Lc79 {
    public boolean exist(char[][] board, String word) {
        //可以暴搜的题理论上复杂度比较高，但一般给定的数据范围小 n^2 * 3^k
        for (int i = 0; i < board.length; i ++) {
            for (int j = 0; j < board[0].length; j ++) {
                if (dfs(board, word, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};

    public boolean dfs(char[][] board, String word, int u, int x, int y) {


        if (board[x][y] != word.charAt(u)) {
            return false;
        }

        if (u == word.length() - 1) {
            return true;
        }


        char t = board[x][y];
        board[x][y] = '.';
        for (int i = 0; i < 4; i ++) {
            int a = dx[i] + x, b = dy[i] + y;
            if (a < 0 || a >= board.length || b < 0 || b >= board[0].length || board[a][b] == '.') {
                continue;
            }
            if (dfs(board, word, u + 1, a, b)) return true;
        }
        board[x][y] = t;
        return false;
    }
}
