package com.lyz.code;

public class main_1486 {

    public static void main(String[] args) {
        System.out.println(new main_1486().xorOperation(5, 0));
    }

    public int xorOperation(int n, int start) {
        int sum = 0;
        for (int i = n; i > 0; i--) {
            sum ^= start;
            start += 2;
        }
        return sum;
    }

}
