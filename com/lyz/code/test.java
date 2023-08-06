package com.lyz.code;

import java.util.*;

public class test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.subList(0, 3));
        System.out.println(list.subList(3, list.size()));
    }
}
