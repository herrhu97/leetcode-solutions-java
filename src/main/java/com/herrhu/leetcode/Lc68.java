package com.herrhu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Lc68 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<String>();
        for(int i = 0; i < words.length; i ++) {
            int len = words[i].length();
            int j = i + 1;
            while(j < words.length && len + 1 + words[j].length() <= maxWidth) {
                len += 1 + words[j].length();
                j ++;
            }

            if(j == i + 1 || j == words.length) { //情况2：只能容下一个单词 情况三：位于最后一行
                String row = words[i];
                for(int k = i + 1; k < j; k ++) {
                    row += ' ' + words[k];
                } //把单词加完
                while(row.length() < maxWidth) row += ' '; //左对齐，右边填充空格
                res.add(row);
            } else { //情况3: 右对齐
                String row = words[i];
                int pos = j - i - 1, space = maxWidth - len + pos; //pos 几个间隔 space 几个空格
                String s = "";
                for(int m = 0; m < space / pos; m ++) s += ' ';// s为基本空格

                int k = 0;
                while(k < space % pos) { //space % pos 多出来的空格数，前面的每个多分配一个
                    row += s + " " + words[i + k + 1];
                    k ++;
                }
                while(k < pos) { //后面的只有基本空格
                    row += s + words[i + k + 1];
                    k ++;
                }
                res.add(row);
            }
            i = j - 1; //后面还有i++，让下一行直接从j位置开始
        }
        return res;
    }
}
