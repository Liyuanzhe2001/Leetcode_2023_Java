package com.lyz.code.双周赛104;

import java.util.Arrays;

public class Main_02 {

    public static void main(String[] args) {
        int[][] nums = {{7, 2, 1}, {6, 4, 2}, {6, 5, 3}, {3, 2, 1}};
        System.out.println(new Main_02().matrixSum(nums));
    }

    public int matrixSum(int[][] nums) {
        int res = 0;
        for (int[] num : nums) {
            Arrays.sort(num);
        }
        int len = nums[0].length;
        int i = 0;
        int max = 0;
        while (i < len) {
            for (int[] num : nums) {
                max = Math.max(num[i], max);
            }
            res += max;
            i++;
        }
        return res;
    }

}
