package com.lyz.程序设计大赛;

import java.util.Scanner;

public class Main_08 {

    static int[] nums;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            sum += nums[i];
        }
        if (sum % 2 == 1) {
            System.out.println(0);
            return;
        }
        System.out.print(dfs(0, 0, 0) ? 1 : 0);
    }

    public static boolean dfs(int step, int ans1, int ans2) {
        if (step == nums.length) {
            return ans1 == ans2;
        }
        boolean res = dfs(step + 1, ans1 + nums[step], ans2);
        if (res) {
            return true;
        }
        return dfs(step + 1, ans1, ans2 + nums[step]);
    }

}
