package com.lyz.code.双周赛109;

import java.util.*;

/**
 * @author lkunk
 * @date 2023年07月22日 22:26
 * @description
 */

public class Main_02 {
    public String sortVowels(String s) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('A');
        set.add('e');
        set.add('E');
        set.add('i');
        set.add('I');
        set.add('o');
        set.add('O');
        set.add('u');
        set.add('U');
        Queue<Integer> indexQueue = new PriorityQueue<>();
        Queue<Character> queue = new PriorityQueue<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (set.contains(chars[i])) {
                indexQueue.add(i);
                queue.add(chars[i]);
            }
        }
        while (!indexQueue.isEmpty()) {
            chars[indexQueue.poll()] = queue.poll();
        }
        return String.valueOf(chars);
    }
}
