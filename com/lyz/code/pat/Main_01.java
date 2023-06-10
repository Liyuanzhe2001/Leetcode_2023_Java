package com.lyz.code.pat;

import java.util.Scanner;

public class Main_01 {
    static String[] map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        map = new String[n];
        for (int i = 0; i < n; i++) {
            map[i] = sc.next();
        }
        String res = "";
        boolean pre = true;
        for (int i = 0; i < n - 1; i++) {
            if (!cal(n - 1, i)) {
                if (map[n - 1].charAt(i) == '1' && !pre) {
                    continue;
                }
                res = res + (i + 1) + " ";
                pre = true;
            } else {
                pre = false;
            }
        }
        System.out.println(res.substring(0, res.length() - 1));
    }

    public static boolean cal(int line, int index) {
        if (line == 0) {
            return true;
        }
        if (index <= 0) {
            return true;
        }
        if (map[line - 1].charAt(index) == '1' && map[line].charAt(index - 1) == '1') {
            return false;
        }
        if (map[line - 1].charAt(index) == '1') {
            return cal(line, index - 1);
        } else {
            return cal(line - 1, index);
        }
    }
}
