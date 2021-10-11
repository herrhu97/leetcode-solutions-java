package com.herrhu.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Lc105 {
    Map<Integer, Integer> pos = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0; i < inorder.length; i ++) {
            pos.put(inorder[i], i);
        }
        return build(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
        //主要是递归的方式返回的变量想不到
    }

    TreeNode build(int[] preorder, int[] inorder, int pl, int pr, int il, int ir) {
        if(pl > pr) return null;
        TreeNode root = new TreeNode(preorder[pl]);
        int k = pos.get(root.val);
        root.left = build(preorder, inorder, pl + 1, pl + 1 + k - 1 - il , il, k - 1);
        root.right = build(preorder, inorder, pl + 1 + k - 1 - il + 1, pr, k + 1, ir);
        return root;
    }
}
