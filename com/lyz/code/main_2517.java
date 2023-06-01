package com.lyz.code;

import java.util.Arrays;

public class main_2517 {

    public static void main(String[] args) {

    }

    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int lef = 0;
        int rig = price[price.length - 1] - price[0];
        int res = 0;
        while (lef <= rig) {
            int mid = (lef + rig - 1) >> 1;
            if (cal(price, k, mid)) {
                lef = mid + 1;
                res = mid;
            } else {
                rig = mid - 1;
            }
        }
        return res;
    }

    public boolean cal(int[] price, int k, int mid) {
        int pre = price[0];
        int cnt = 1;
        for (int i = 1; i < price.length; i++) {
            if (price[i] - pre >= mid) {
                cnt++;
                pre = price[i];
            }
        }
        return cnt >= k;
    }


}
