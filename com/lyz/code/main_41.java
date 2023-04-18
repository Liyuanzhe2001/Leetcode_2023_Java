package com.lyz.code;

public class main_41 {

    public static void main(String[] args) {
        System.out.println(new main_41().firstMissingPositive(new int[]{1, 2, 0}));
    }

    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0 && nums[i] < nums.length && nums[i] - 1 != i && nums[i] != nums[nums[i] - 1]) {
                int tmp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = tmp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i] - 1) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }

}
