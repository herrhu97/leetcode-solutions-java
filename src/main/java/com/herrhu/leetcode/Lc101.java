package com.herrhu.leetcode;

public class Lc101 {
    //很巧妙的递归
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return dfs(root.left, root.right);
    }

    boolean dfs(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null || p.val != q.val) return false;
        return dfs(p.left, q.right) && dfs(p.right, q.left);
    }
}
