package com.herrhu.leetcode;

/*
实际上就是归并排序的一部分
 */

public class Lc88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) return;

        int[] nums3 = new int[m + n];

        int idk = 0;
        int i, j;
        for(i = 0, j = 0; i < m  && j < n; ){
            if(nums1[i] <= nums2[j]) nums3[idk ++] = nums1[i ++];
            else nums3[idk ++] = nums2[j ++];
        }

        if(i == m) {
            while(j < n) {
                nums3[idk ++] = nums2[j ++];
            }
        }

        if(j == n) {
            while(i < m) {
                nums3[idk ++] = nums1[i ++];
            }
        }

        i = 0;
        while(i < m + n) {
            nums1[i] = nums3[i];
            i ++;
        }
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        //不开辟新数组，放在nums1的后半段
        int k = m + n - 1;

        int i = m - 1, j = n - 1;
        while(i >= 0 && j >= 0) {
            if(nums1[i] >= nums2[j]) nums1[k --] = nums1[i --];
            else nums1[k --] = nums2[j --];
        }

        while(j >= 0) {
            nums1[k --] = nums2[j --];
        }
    }
}
