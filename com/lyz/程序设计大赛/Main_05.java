package com.lyz.程序设计大赛;

import java.util.Scanner;

public class Main_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        int tmp = 0;
        int len = 1;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
            if (i == 0) {
                tmp = Integer.MIN_VALUE;
            } else {
                if (nums[i] - nums[i - 1] != tmp) {
                    if (len >= 3) {
                        ans += ((len - 1) * (len - 2)) / 2;
                    }
                    len = 2;
                    tmp = nums[i] - nums[i - 1];
                } else {
                    len++;
                }
            }
        }

        if (len >= 3) {
            ans += ((len - 1) * (len - 2)) / 2;
        }
        System.out.println(ans);
    }
}
