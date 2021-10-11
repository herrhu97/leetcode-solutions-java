package com.herrhu.leetcode;

import java.util.Stack;

public class Lc20 {
    public boolean solution(String s) {
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{') stk.push(c);
            else {
                if(stk.size() != 0 && Math.abs(c - stk.peek()) <= 2) stk.pop();
                else return false;
            }
        }

        return stk.empty();
    }
}

