package com.lyz.code;

import java.util.HashMap;

public class main_1419 {

    public static void main(String[] args) {

    }

    public int minNumberOfFrogs(String croakOfFrogs) {
        int len = croakOfFrogs.length();
        if (len % 5 != 0) {
            return -1;
        }
        int[] map = new int['r' + 1];
        char c;
        for (int i = 0; i < len; i++) {
            c = croakOfFrogs.charAt(i);
            if (c == 'c') {
                if (map['k'] != 0) {
                    map['k']--;
                }
                map['c']++;
            } else if (c == 'r') {
                if (map['c'] == 0) {
                    return -1;
                }
                map['c']--;
                map['r']++;
            } else if (c == 'o') {
                if (map['r'] == 0) {
                    return -1;
                }
                map['r']--;
                map['o']++;
            } else if (c == 'a') {
                if (map['o'] == 0) {
                    return -1;
                }
                map['o']--;
                map['a']++;
            } else if (c == 'k') {
                if (map['a'] == 0) {
                    return -1;
                }
                map['a']--;
                map['k']++;
            }
        }
        if (map['c'] != 0 || map['r'] != 0 || map['o'] != 0 || map['a'] != 0) {
            return -1;
        }
        return map['k'];
    }

}
