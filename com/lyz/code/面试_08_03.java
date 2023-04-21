package com.lyz.code;

public class 面试_08_03 {

    public static void main(String[] args) {

    }

    public int findMagicIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i) {
                return i;
            }
            i = Math.max(i, nums[i] - 1);
        }
        return -1;
    }

}
