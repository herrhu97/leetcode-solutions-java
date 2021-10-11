package com.herrhu.leetcode;

/**
 * @description:
 * @author: HerrHu
 * @time: 2021/3/20 09:54
 */
public class Lc48 {
    public void rotate(int[][] matrix) {
        //类似脑筋急转弯，比较难想的逻辑
        int n = matrix.length;
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < i ; j ++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i ++) {
            for (int j = 0, k = n - 1; j < k; j ++, k --) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
            }
        }
    }
}
