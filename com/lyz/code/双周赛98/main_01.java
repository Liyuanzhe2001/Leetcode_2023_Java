package com.lyz.code.双周赛98;

import com.lyz.code.main_659;

public class main_01 {

    public static void main(String[] args) {
        System.out.println(new main_01().minMaxDifference(11891));
    }

    public int minMaxDifference(int num) {
        String s = String.valueOf(num);
        int max = num, min;
        min = Integer.parseInt(s.replaceAll(String.valueOf(s.charAt(0)), "0"));
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '9') {
                max = Integer.parseInt(s.replaceAll(String.valueOf(c), "9"));
                break;
            }
        }
        return max - min;
    }

}
