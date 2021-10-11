package com.herrhu.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Lc106 {
    Map<Integer, Integer> pos = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i = 0; i < inorder.length; i ++) {
            pos.put(inorder[i], i);
        }
        return build(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
    }

    TreeNode build(int[] inorder, int[] postorder, int il, int ir, int pl, int pr) {
        if(il > ir || pl > pr) return null;
        TreeNode root = new TreeNode(postorder[pr]);
        int k = pos.get(root.val);
        root.left = build(inorder, postorder, il, k - 1, pl, pl + k - 1 - il);
        root.right = build(inorder, postorder, k + 1, ir, pl + k - 1 - il + 1, pr - 1);
        return root;
    }
}
