package com.lyz.程序设计大赛;

import java.util.Scanner;

public class Main_06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        int caseOne = 2 * (n - 1);
        int caseTwo = 0;
        int index = 0;
        StringBuilder res = new StringBuilder();
        while (index < str.length()) {
            res.append(str.charAt(index));
            index += caseOne;
        }

        for (int i = 1; i < n - 1; i++) {
            index = i;
            int c = 0;
            caseOne = caseOne - 2;
            caseTwo += 2;
            while (index < str.length()) {
                res.append(str.charAt(index));
                if (c % 2 == 0) {
                    index += caseOne;
                } else {
                    index += caseTwo;
                }
                c++;
            }
        }

        index = n - 1;
        caseTwo += 2;
        while (index < str.length()) {
            res.append(str.charAt(index));
            index += caseTwo;
        }
        System.out.print(res);
    }
}

