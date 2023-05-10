package com.lyz.code;

import java.util.HashSet;
import java.util.Set;

public class main_1015 {

    public static void main(String[] args) {
        int n = 7;
        new main_1015().smallestRepunitDivByK(n);
    }

    public int smallestRepunitDivByK(int k) {
        Set<Integer> set = new HashSet<>();
        int x = 1 % k;
        while (x > 0 && set.add(x)) {
            x = (x * 10 + 1) % k;
        }
        return x > 0 ? -1 : set.size() + 1;
    }

}
