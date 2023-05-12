package com.lyz.code;

public class main_1330 {

    public static void main(String[] args) {

    }

    public int maxValueAfterReverse(int[] nums) {
        int value = 0, d = 0;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            int a = nums[i - 1], b = nums[i];
            int tmp = Math.abs(a - b);
            value += tmp;
            max = Math.max(max, Math.min(a, b));
            min = Math.min(min, Math.max(a, b));
            d = Math.max(d, Math.max(Math.abs(nums[0] - b) - tmp,
                    Math.abs(nums[nums.length - 1] - a) - tmp));
        }
        return value + Math.max(d, 2 * (max - min));
    }
}
