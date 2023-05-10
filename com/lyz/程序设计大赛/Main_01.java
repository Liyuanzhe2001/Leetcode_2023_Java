package com.lyz.程序设计大赛;

import java.util.Scanner;

public class Main_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int[] n1 = new int[n];
        for (int i = 0; i < n1.length; i++) {
            n1[i] = sc.nextInt();
        }
        int[] n2 = new int[n];
        for (int i = 0; i < n2.length; i++) {
            n2[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(n1[i] == n2[i]){
                cnt++;
            }
        }
        System.out.println(cnt);
    }



}
