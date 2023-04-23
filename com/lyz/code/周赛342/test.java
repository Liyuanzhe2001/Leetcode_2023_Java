package com.lyz.code.周赛342;

import java.util.Map;
import java.util.TreeMap;

public class test {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new TreeMap<>();
        map.put(-1, 100);
        map.put(-2, 1);
        map.put(3, -2123);
        map.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });
    }

}
