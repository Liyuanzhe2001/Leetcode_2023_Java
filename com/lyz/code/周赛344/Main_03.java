package com.lyz.code.周赛344;

import java.util.Arrays;

public class Main_03 {

    public static void main(String[] args) {
        int n = 4;
        int[][] queries = {{0, 2}, {1, 2}, {3, 1}, {1, 1}, {2, 1}};
        System.out.println(Arrays.toString(new Main_03().colorTheArray(n, queries)));
    }

    public int[] colorTheArray(int n, int[][] queries) {
        int[] nums = new int[n];
        int[] res = new int[queries.length];
        nums[queries[0][0]] = queries[0][1];

        for (int i = 1; i < queries.length; i++) {
            int index = queries[i][0];
            int color = queries[i][1];
            if (nums[index] == 0) {
                res[i] = res[i - 1];
                nums[index] = color;
                if (0 < index && index <= nums.length - 1 && nums[index] == nums[index - 1]) {
                    res[i] += 1;
                }
                if (index < nums.length - 1 && nums[index] == nums[index + 1]) {
                    res[i] += 1;
                }
            } else {
                int tmp = res[i - 1];
                if (0 < index && index <= nums.length - 1 && nums[index] == nums[index - 1]) {
                    tmp -= 1;
                }
                if (index < nums.length - 1 && nums[index] == nums[index + 1]) {
                    tmp -= 1;
                }
                nums[index] = color;
                if (0 < index && index <= nums.length - 1 && nums[index] == nums[index - 1]) {
                    tmp += 1;
                }
                if (index < nums.length - 1 && nums[index] == nums[index + 1]) {
                    tmp += 1;
                }
                res[i] = tmp;
            }
        }
        return res;
    }

}
