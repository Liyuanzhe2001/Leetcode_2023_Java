package com.lyz.code;

public class main_1250 {

    public static void main(String[] args) {
        // 根据裴蜀定理
        // 如果 a 和 b 最大公约数为1，则一定存在整数x,y，使ax+by=d成立
        int[] nums = new int[]{3, 6};
        System.out.println(new main_1250().isGoodArray(nums));
    }

    public boolean isGoodArray(int[] nums) {
        // 因为可能是多个数乘以一个 任意整数 等于1
        // 所以n要一直更新
        // （如果两个数乘以一个 任意整数 等于1，n就不需要一直更新，直接判断这两个数公约数是否等于1即可）
        int n = nums[0];
        for (int num : nums) {
            if (num == 1) {
                return true;
            }
            n = gcd(n, num);
            if (n == 1) {
                return true;
            }
        }
        return false;
    }

    // 求最大公约数
    // 辗转相除法、欧几里德算法
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }


}
