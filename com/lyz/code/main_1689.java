package com.lyz.code;

public class main_1689 {

    public static void main(String[] args) {

    }

    public int minPartitions(String n) {
        for (int i = 9; i >= 0; i--) {
            if (n.contains(i + "")) {
                return i;
            }
        }
        return 0;
    }

}
