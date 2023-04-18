package com.lyz.code;

public class main_1716 {

    public static void main(String[] args) {
        System.out.println(new main_1716().totalMoney(20));
    }

    public int totalMoney(int n) {
        int money = 0;
        int total = 0;
        for (int i = 0; i < n; i++) {
            if (i % 7 == 0) {
                money = 1 + i / 7;
            }
            total += money;
            money++;
        }
        return total;
    }

}
