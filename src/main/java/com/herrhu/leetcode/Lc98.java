package com.herrhu.leetcode;

public class Lc98 {
  public boolean isValidBST(TreeNode root) {
    return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
  }

  boolean dfs(TreeNode root, long l, long r) {
    if(root == null) return true;
    if(root.val <= l || root.val >= r) return false; //存在相等情况
    return dfs(root.left, l, root.val) && dfs(root.right, root.val, r);
  }
}
