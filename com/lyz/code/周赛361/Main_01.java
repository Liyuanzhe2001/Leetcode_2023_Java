package com.lyz.code.周赛361;

/**
 * @author lkunk
 * @date 2023年09月03日 10:20
 * @description
 */

public class Main_01 {
    public int countSymmetricIntegers(int low, int high) {
        int res = 0;
        for (int i = low; i <= high; i++) {
            String num = i + "";
            if (num.length() % 2 == 0 && judge(num)) {
                res++;
            }
        }
        return res;
    }

    public boolean judge(String nums) {
        int tmp = 0;
        int l = nums.length() / 2;
        for (int i = 0; i < nums.length(); i++) {
            tmp += (nums.charAt(i) - '0') - (nums.charAt(i + l) - '0');
        }
        return tmp == 0;
    }
}
