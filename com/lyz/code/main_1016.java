package com.lyz.code;

import java.util.HashSet;

public class main_1016 {

    public static void main(String[] args) {

    }

    public boolean queryString(String s, int n) {
        for (int i = 1; i <= n; i++) {
            if(!s.contains(Integer.toBinaryString(i))){
                return false;
            }
        }
        return true;
    }

}
