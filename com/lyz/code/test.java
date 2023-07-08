package com.lyz.code;

import java.lang.reflect.Array;
import java.util.*;

public class test {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>() {{
            add("1");
            add("101");
            add("11001");
            add("1001110001");
            add("110000110101");
            add("11110100001001");
            add("10011000100101101");
        }};
        System.out.println(set.contains("101"));
    }
}
