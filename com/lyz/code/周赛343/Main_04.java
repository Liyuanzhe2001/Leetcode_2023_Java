package com.lyz.code.周赛343;

public class Main_04 {

    public static void main(String[] args) {
        String s = "b";
        int k = 6;
        System.out.println(new Main_04().smallestBeautifulString(s, k));
    }

    public String smallestBeautifulString(String s, int k) {
        char a = 'a';
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            for (c++; c < 'a' + k; c++) {
                if (judge(replace(s, c, i), i)) {
                    return replace(s, c, i);
                }
            }
            s = replace(s, a, i);
            a++;
            if (a == 'a' + k) {
                break;
            }
        }
        return "";
    }

    public String replace(String s, char c, int index) {
        s = s.substring(0, index) + c + s.substring(index + 1);
        return s;
    }

    public boolean judge(String s, int index) {
        char c = s.charAt(index);
        if (index - 1 >= 0 && c == s.charAt(index - 1)) {
            return false;
        }
        if (index - 2 >= 0 && c == s.charAt(index - 2)) {
            return false;
        }
        if (index + 1 < s.length() && c == s.charAt(index + 1)) {
            return false;
        }
        if (index + 2 < s.length() && c == s.charAt(index + 2)) {
            return false;
        }
        return true;
    }

}
