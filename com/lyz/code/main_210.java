package com.lyz.code;

import java.util.*;

public class main_210 {

    public static void main(String[] args) {

    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int index = 0;
        int[] res = new int[numCourses];
        HashMap<Integer, List<Integer>> father = new HashMap<>();
        int[] nums = new int[numCourses];
        int len = prerequisites.length;
        for (int[] prerequisite : prerequisites) {
            List<Integer> tmpList = father.getOrDefault(prerequisite[0], new ArrayList<>());
            tmpList.add(prerequisite[1]);
            father.put(prerequisite[0], tmpList);
            nums[prerequisite[0]]++;
        }

        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                queue.add(i);
                res[index++] = i;
            }
        }

        while (!queue.isEmpty()) {
            Integer no = queue.poll();
            for (Integer key : father.keySet()) {
                if (father.get(key).contains(no)) {
                    nums[key]--;
                    len--;
                    if (nums[key] == 0) {
                        queue.add(key);
                        res[index++] = key;
                    }
                }
            }
        }
        return len == 0 ? res : new int[]{};
    }

}
