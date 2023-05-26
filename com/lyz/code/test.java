package com.lyz.code;

import java.lang.reflect.Array;
import java.util.*;

public class test {
    public static void main(String[] args) {
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(1);
        System.out.println(list1.hashCode());
        List<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2.add(1);
        System.out.println(list2.hashCode());
        set.add(list1);
        set.add(list2);
        System.out.println(set);
    }
}
