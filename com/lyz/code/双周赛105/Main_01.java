package com.lyz.code.双周赛105;

import java.util.Arrays;

public class Main_01 {

    public static void main(String[] args) {
        int[] prices = {98, 54, 6, 34, 66, 63, 52, 39};
        int money = 62;
        System.out.println(new Main_01().buyChoco(prices, money));
    }

    public int buyChoco(int[] prices, int money) {
        int min = money;
        boolean flag = false;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] + prices[j] <= money) {
                    min = Math.min(prices[i] + prices[j], min);
                    flag = true;
                }
            }
        }
        return flag ? money : money - min;
    }

}
