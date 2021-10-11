package com.herrhu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Lc95 {
    //有点像归并排序
    //中序遍历是有序的
    /*
    卡特兰数，前面讲括号的时候好像也说到了
    思路就是把l、r看成是二叉搜索树中序遍历的左右边界

    然后枚举每个点为root，递归两边。返回的集合中都是合法的左子树或者右子树

    然后root和集合中的左右子树分别拼接一下即可（注意，root一定要在循环内new，否则会覆盖）
    */

    public List<TreeNode> generateTrees(int n) {
        if(n < 1) return new ArrayList<TreeNode>();
        return dfs(1, n);
    }

    public List<TreeNode> dfs(int l, int r) {
        List<TreeNode> res = new ArrayList<TreeNode>();

        if(l > r) {
            res.add(null);
            return res;
        }

        for(int i = l; i <= r; i ++) {
            List<TreeNode> left = dfs(l, i - 1), right = dfs(i + 1, r);
            for(TreeNode lc : left) {
                for(TreeNode rc : right) {
                    TreeNode root = new TreeNode(i);
                    root.left = lc;
                    root.right = rc;
                    res.add(root);
                }
            }
        }

        return res;
    }
}
