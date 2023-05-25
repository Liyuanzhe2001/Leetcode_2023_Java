package com.lyz.code;

import java.util.ArrayList;
import java.util.List;

public class main_1414 {

    public static void main(String[] args) {

    }

    public int findMinFibonacciNumbers(int k) {
        List<Integer> f = new ArrayList<>();
        f.add(1);
        f.add(1);
        int i = 2;
        int tmp = 0;
        while (tmp < k) {
            tmp = f.get(i - 2) + f.get(i - 1);
            f.add(tmp);
            i++;
        }
        System.out.println(f);
        int res = 0;
        for (int index = f.size() - 1; index >= 0; index--) {
            if (f.get(index) <= k) {
                k -= f.get(index);
                res++;
                index++;
            }
        }
        return res;
    }

}
