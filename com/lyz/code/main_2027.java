package com.lyz.code;

public class main_2027 {

    public static void main(String[] args) {
        System.out.println(new main_2027().minimumMoves("XXOX"));
    }

    public int minimumMoves(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'X') {
                res++;
                i += 2;
            }
        }
        return res;
    }

}
