package com.herrhu.leetcode;

public class Lc97 {
    // 状态表示 f[i][j] 表示s1 1-i与s2 1-j交错形成s3 1 - i + j方案
    // 状态属性 f[i][j] 是否是空集合
    // 状态计算 f[i][j] = f[i - 1][j] || f[i][j - 1]
    public boolean isInterleave(String s1, String s2, String s3) {
        int n = s1.length(), m = s2.length();
        if(s3.length() != n + m) return false;

        boolean[][] f = new boolean[n + 1][m + 1];
        s1 = ' ' + s1;
        s2 = ' ' + s2;
        s3 = ' ' + s3;

        for(int i = 0; i <= n; i ++) {
            for(int j = 0; j <= m; j ++) {
                if(i == 0 && j == 0) f[i][j] = true;
                else {
                    if(i != 0 && s1.charAt(i) == s3.charAt(i + j)) f[i][j] = f[i - 1][j];
                    if(j != 0 && s2.charAt(j) == s3.charAt(i + j)) f[i][j] = f[i][j] || f[i][j - 1];
                }
            }
        }

        return f[n][m];
    }
}
