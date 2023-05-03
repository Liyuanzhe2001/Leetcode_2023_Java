package com.lyz.code;

import java.util.Stack;

public class main_1003 {

    public static void main(String[] args) {
        String s = "aabcbc";
        System.out.println(new main_1003().isValid(s));
    }

    public boolean isValid(String s) {
        while (s.contains("abc")) {
            s = s.replaceAll("abc", "");
        }
        return "".equals(s);
    }
}
