package com.herrhu.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/*
递归写法很简单就不写了，前中后遍历背过这种比较特殊的解法就可以了
 */
public class Lc94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stk = new Stack();

        while(root != null || stk.size() != 0) {
            while (root != null) {
                stk.push(root);
                root = root.left;
            }

            root = stk.peek();
            stk.pop();
            res.add(root.val);
            root = root.right;
        }

        return res;
    }
}



