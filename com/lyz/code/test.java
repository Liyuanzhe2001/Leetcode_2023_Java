package com.lyz.code;

import java.lang.reflect.Array;
import java.util.*;

public class test {
    public static void main(String[] args) {
        Set<int[]> set = new TreeSet<>();
        set.add(new int[]{1, 2});
        set.add(new int[]{2, 3});
        System.out.println(set.contains(new int[]{1, 2}));
    }
}
