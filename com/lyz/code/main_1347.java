package com.lyz.code;

import java.util.HashMap;

public class main_1347 {

    public static void main(String[] args) {
        String s = "friend";
        String t = "family";
        System.out.println(new main_1347().minSteps(s, t));
    }

    public int minSteps(String s, String t) {
        if (s.equals(t)) {
            return 0;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        int diff = 0;
        for (int i = 0; i < t.length(); i++) {
            int index = t.charAt(i) - 'a';
            if (count[index] > 0) {
                count[index]--;
            } else {
                diff++;
            }
        }
        return diff;
    }

}
