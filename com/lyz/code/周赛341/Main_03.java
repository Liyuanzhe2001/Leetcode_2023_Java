package com.lyz.code.周赛341;

public class Main_03 {

    public static void main(String[] args) {

    }

    public int addMinimum(String word) {
        int res = 0;
        switch (word.charAt(0)) {
            case 'b':
                res = 1;
                break;
            case 'c':
                res = 2;
        }
        for (int i = 0; i < word.length() - 1; i++) {
            char tmpC = word.charAt(i);
            char nextC = word.charAt(i + 1);
            if (tmpC == 'a') {
                if (nextC == 'a') {
                    res += 2;
                } else if (nextC == 'c') {
                    res += 1;
                }
            } else if (tmpC == 'b') {
                if (nextC == 'a') {
                    res += 1;
                } else if (nextC == 'b') {
                    res += 2;
                }
            } else if (tmpC == 'c') {
                if (nextC == 'b') {
                    res += 1;
                } else if (nextC == 'c') {
                    res += 2;
                }
            }
        }
        if (word.charAt(word.length() - 1) == 'a') {
            res += 2;
        } else if (word.charAt(word.length() - 1) == 'b') {
            res += 1;
        }
        return res;
    }

}
