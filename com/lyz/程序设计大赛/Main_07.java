package com.lyz.程序设计大赛;

import java.util.Scanner;

public class Main_07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int res = dfs(target, 0, nums);
        System.out.print(res);
    }

    public static int dfs(int target, int index, int[] nums) {
        if (index == nums.length) {
            if (target == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        return dfs(target - nums[index], index + 1, nums) +
                dfs(target + nums[index], index + 1, nums);
    }

}
