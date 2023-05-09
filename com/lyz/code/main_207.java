package com.lyz.code;

import java.util.*;

public class main_207 {

    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}};
        System.out.println(new main_207().canFinish(numCourses, prerequisites));
    }

    boolean[] visit;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> father = new HashMap<>();
        int[] nums = new int[numCourses];
        for (int[] prerequisite : prerequisites) {
            List<Integer> tmpList = father.getOrDefault(prerequisite[0], new ArrayList<>());
            tmpList.add(prerequisite[1]);
            father.put(prerequisite[0], tmpList);
            nums[prerequisite[0]]++;
        }
        visit = new boolean[numCourses];
        boolean res = true;
        for (int i = 0; i < visit.length; i++) {
            if (!visit[i]) {
                res = res && dfs(visit, father, i);
            }
        }
        return res;
    }

    public boolean dfs(boolean[] visited, HashMap<Integer, List<Integer>> father, int now) {
        if (visited[now]) {
            return false;
        }
        if (!father.containsKey(now)) {
            return true;
        }
        visited[now] = true;
        boolean res = true;
        for (Integer key : father.keySet()) {
            if (father.get(key).contains(now) && !visited[key]) {
                res = res && dfs(visited, father, key);
            }
        }
        for (Integer key : father.get(now)) {
            if (!visited[key]) {
                res = res && dfs(visited, father, key);
            }
        }
        return res;
    }

    /**
     * 方式一： 广度优先
     * public boolean canFinish(int numCourses, int[][] prerequisites) {
     *     HashMap<Integer, List<Integer>> father = new HashMap<>();
     *     int[] nums = new int[numCourses];
     *     int len = prerequisites.length;
     *     for (int[] prerequisite : prerequisites) {
     *         List<Integer> tmpList = father.getOrDefault(prerequisite[0], new ArrayList<>());
     *         tmpList.add(prerequisite[1]);
     *         father.put(prerequisite[0], tmpList);
     *         nums[prerequisite[0]]++;
     *     }
     *
     *     Queue<Integer> queue = new ArrayDeque<>();
     *     for (int i = 0; i < nums.length; i++) {
     *         if (nums[i] == 0) {
     *             queue.add(i);
     *         }
     *     }
     *
     *     while (!queue.isEmpty()) {
     *         Integer no = queue.poll();
     *         for (Integer key : father.keySet()) {
     *             if (father.get(key).contains(no)) {
     *                 nums[key]--;
     *                 len--;
     *                 if (nums[key] == 0) {
     *                     queue.add(key);
     *                 }
     *             }
     *         }
     *     }
     *
     *     return len == 0;
     * }
     */


}
