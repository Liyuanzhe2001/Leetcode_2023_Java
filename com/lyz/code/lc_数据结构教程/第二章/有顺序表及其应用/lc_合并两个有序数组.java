package com.lyz.code.lc_数据结构教程.第二章.有顺序表及其应用;

/**
 * @author lkunk
 * @date 2023年08月16日 23:20
 * @description
 */

public class lc_合并两个有序数组 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m -= 1;
        n -= 1;
        int index = nums1.length - 1;
        while (index >= 0) {
            if (m >= 0 && n < 0) {
                nums1[index] = nums1[m];
                m--;
            } else if (n >= 0 && m < 0) {
                nums1[index] = nums2[n];
                n--;
            } else if (nums1[m] > nums2[n]) {
                nums1[index] = nums1[m];
                m--;
            } else {
                nums1[index] = nums2[n];
                n--;
            }
            index--;
        }
    }
}
