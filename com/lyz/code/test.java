package com.lyz.code;

import java.util.*;

public class test {

    public static void main(String[] args) {
        Deque<Integer> list = new ArrayDeque<>() {
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

        Queue<Integer> priorityQueue = new PriorityQueue();
        priorityQueue.add(1);
        priorityQueue.add(123);
        priorityQueue.add(112);
        priorityQueue.add(25);
        priorityQueue.add(63);
        priorityQueue.add(12);
        priorityQueue.add(7);
        priorityQueue.add(231);
        priorityQueue.add(93);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);

        System.out.println(getTopMapNum(new int[]{1, 5, 7, 12, 4, 1, 436, 13, 523, 7}, 10));

    }

    public static List<Integer> getTopMapNum(int[] arr, int k) {
        Queue<Integer> priorityQueue = new PriorityQueue();
        List<Integer> topKList = new ArrayList<>();
        if (arr == null || k > arr.length || k <= 0) {
            return topKList;
        }
        for (int i : arr) {
            if (priorityQueue.size() < k) {
                priorityQueue.add(i);
            } else {
                if (priorityQueue.peek() < i) {
                    priorityQueue.poll();
                    priorityQueue.add(i);
                }
            }
        }

        while (k-- > 0) {
            topKList.add(priorityQueue.poll());
        }
        return topKList;
    }

}
