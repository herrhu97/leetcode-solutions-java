package com.herrhu.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Lc93 {
  List<String> res = new LinkedList<>();

  public List<String> restoreIpAddresses(String s) {
    dfs(0, s, new StringBuilder(), 0);
    return res;
  }

    public void dfs(int x, String s, StringBuilder sb, int count) {
        if(x == s.length()) {
            if(count == 4) {
                res.add(sb.substring(0, sb.length() - 1));
            }
            return;
        }
        if(count == 4) {
            return;
        }
        count ++;
        for(int i = 0; i < 3; i ++) {
            if(i == 0) {
                //一位数肯定行
                sb.append(s.charAt(x));
                sb.append('.');
                dfs(x + 1, s, sb, count);
                sb.delete(sb.length() - 2, sb.length());
            } else if (i == 1 && x + 1 < s.length()) {
                if(s.charAt(x) != '0') {
                    sb.append(s.charAt(x));
                    sb.append(s.charAt(x + 1));
                    sb.append('.');
                    dfs(x + 2, s, sb, count);
                    sb.delete(sb.length() - 3, sb.length());
                }
            } else if(i == 2 && x + 2 < s.length()) {
                if(s.charAt(x) != '0' && (s.charAt(x) - '0') * 100 + (s.charAt(x + 1) - '0') * 10 + (s.charAt(x + 2) - '0')
                        < 256) {
                    sb.append(s.charAt(x));
                    sb.append(s.charAt(x + 1));
                    sb.append(s.charAt(x + 2));
                    sb.append('.');
                    dfs(x + 3, s, sb, count);
                    sb.delete(sb.length() - 4, sb.length());
                }

            }
        }
    }
}
