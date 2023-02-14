package com.lyz.code;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class test {

    public static void main(String[] args) {
        Deque<Integer> list = new ArrayDeque<>(){
            {
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
                add(6);
            }
        };
        System.out.println(list);
        list.pop();
        System.out.println(list);
        list.pollLast();
        System.out.println(list);

    }

}
