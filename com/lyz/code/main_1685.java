package com.lyz.code;

import java.util.Arrays;

public class main_1685 {

    public static void main(String[] args) {
        int[] nums = {2, 3, 5};
        System.out.println(Arrays.toString(new main_1685().getSumAbsoluteDifferences(nums)));
    }

    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] pre = new int[nums.length];
        pre[0] = nums[0];
        int[] last = new int[nums.length];
        last[nums.length - 1] = nums[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            pre[i] = pre[i - 1] + nums[i];
            last[nums.length - 1 - i] = last[nums.length - i] + nums[nums.length - 1 - i];
        }
        System.out.println(Arrays.toString(pre));
        System.out.println(Arrays.toString(last));
        int[] res = new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = (i + 1) * nums[i] - pre[i] + last[i] - (nums.length - i) * nums[i];
        }
        return res;
    }

}
