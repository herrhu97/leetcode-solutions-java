package com.herrhu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Lc114 {
    List<Integer> arr = new ArrayList();

    public void flatten(TreeNode root) {
        if(root == null) return;//力扣特色判断特殊情况

        preTravel(root);
        TreeNode temp = root;
        root.left = null;

        //为root节点重新构造二叉树，并且先删除左子树，一直向下构造右子树
        for(int i = 1; i < arr.size(); i ++) {
            Integer a = arr.get(i);
            TreeNode newOne = new TreeNode(a, null, null);
            temp.right = newOne;
            temp = temp.right;
        }
    }

    //递归写前序遍历，把val值放入一个容器中
    public void preTravel(TreeNode root) {
        arr.add(root.val);
        if(root.left != null) {
            preTravel(root.left);
        }
        if(root.right != null) {
            preTravel(root.right);
        }
    }

}
