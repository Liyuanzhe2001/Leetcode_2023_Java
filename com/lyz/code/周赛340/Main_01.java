package com.lyz.code.周赛340;

public class Main_01 {

    public static void main(String[] args) {

    }

    public int diagonalPrime(int[][] nums) {
        int max = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i][i] > max && judge(nums[i][i])) {
                max = Math.max(max, nums[i][i]);
            }
            if (nums[i][nums.length - 1 - i] > max && judge(nums[i][nums.length - 1 - i])) {
                max = Math.max(max, nums[i][nums.length - 1 - i]);
            }
        }
        return max == 1 ? 0 : max;
    }

    public boolean judge(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
