package com.lyz.code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class main_2418 {

    public static void main(String[] args) {

    }

    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer, String> map = new TreeMap<>((o1, o2) -> o2 - o1);
        for (int i = 0; i < heights.length; i++) {
            map.put(heights[i], names[i]);
        }
        return map.values().toArray(new String[heights.length]);
    }

}
