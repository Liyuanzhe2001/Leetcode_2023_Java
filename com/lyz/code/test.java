package com.lyz.code;

import java.lang.reflect.Array;
import java.util.*;

public class test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(3);
//        Set<Integer> set = new HashSet<>();
//        set.add(5);
//        set.add(1);
//        set.add(3);
        System.out.println(list);
        Map<List<Integer>,Integer> map = new HashMap<>();
        map.put(list,1234);
        List<Integer> list2 = new ArrayList<>(list);
        list2.add(4);
        System.out.println(list2);
        System.out.println(map.containsKey(list2));
    }
}
