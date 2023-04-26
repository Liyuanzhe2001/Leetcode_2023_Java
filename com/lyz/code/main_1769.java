package com.lyz.code;

public class main_1769 {

    public static void main(String[] args) {

    }

    public int[] minOperations(String boxes) {
        int[] res = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            char c = boxes.charAt(i);
            if (c == '1') {
                for (int j = 0; j < boxes.length(); j++) {
                    res[j] += Math.abs(i - j);
                }
            }
        }
        return res;
    }

}
