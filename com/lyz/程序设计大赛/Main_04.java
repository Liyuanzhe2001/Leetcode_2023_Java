package com.lyz.程序设计大赛;

import java.util.Arrays;
import java.util.Scanner;

public class Main_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }
        Arrays.sort(price);
        System.out.println(Arrays.toString(price));
        int res = 0;
        if (price.length % 2 == 0) {
            for (int i = 1; i < price.length; i += 2) {
                res += price[i];
            }
        } else {
            for (int i = 0; i < price.length; i += 2) {
                res += price[i];
            }
        }
        System.out.println(res);
    }
}
