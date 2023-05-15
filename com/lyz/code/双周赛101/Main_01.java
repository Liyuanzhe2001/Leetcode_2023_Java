package com.lyz.code.双周赛101;

import java.util.Arrays;

public class Main_01 {

    public static void main(String[] args) {

    }

    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for (int i : nums1) {
            for (int j : nums2) {
                if (i == j) {
                    return i;
                }
            }
        }
        int n1 = nums1[0];
        int n2 = nums2[0];
        if (n1 > n2) {
            int tmp = n1;
            n1 = n2;
            n2 = tmp;
        }
        return n1 * 10 + n2;
    }

}
