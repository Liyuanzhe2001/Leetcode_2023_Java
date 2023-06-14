package com.lyz.code;

import java.lang.reflect.Array;
import java.util.*;

public class test {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(1);
        set.add(3);
        Queue queue =  new ArrayDeque();
        System.out.println(set);
    }
}
