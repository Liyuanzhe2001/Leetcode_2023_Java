package com.lyz.code.pat;

import java.util.Scanner;
import java.util.Stack;

public class Main_02 {

    static Stack<Integer> s1 = new Stack<Integer>();
    static Stack<Integer> s2 = new Stack<Integer>();
    static boolean flag = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String operation = sc.next();
            if ("I".equals(operation)) {
                int inValue = sc.nextInt();
                caseI(inValue);
            } else {
                caseO();
            }
        }
    }

    public static void caseI(int inValue) {
        s1.push(inValue);
    }

    public static void caseO() {
        if (flag) {
            System.out.println();
        } else {
            flag = true;
        }
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.print("ERROR");
            return;
        }
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            int res = s2.size() * 2 + 1;
            System.out.print(s2.pop() + " " + res);
        } else {
            System.out.print(s2.pop() + " " + 1);
        }
    }

}
