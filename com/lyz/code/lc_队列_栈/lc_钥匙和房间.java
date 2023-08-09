package com.lyz.code.lc_队列_栈;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author lkunk
 * @date 2023年08月09日 23:00
 * @description
 */

public class lc_钥匙和房间 {

    public static void main(String[] args) {
        int[][] arr = {{1}, {2}, {3}, {}};
        List<List<Integer>> rooms = new ArrayList<>() {{
            for (int[] ints : arr) {
                List<Integer> list = new ArrayList<>();
                for (int anInt : ints) {
                    list.add(anInt);
                }
                add(list);
            }
        }};
        boolean b = new lc_钥匙和房间().canVisitAllRooms(rooms);
    }

    boolean[] visited;
    int size;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        size = rooms.size();
        visited = new boolean[size];
        dfs(rooms, 0);
        System.out.println(size);
        return size == 0;
    }

    public void dfs(List<List<Integer>> rooms, int index) {
        visited[index] = true;
        size--;
        for (Integer integer : rooms.get(index)) {
            if (!visited[integer]) {
                dfs(rooms, integer);
            }
        }
    }

}

/*
[[1,3],[3,0,1],[2],[0]]
[[1],[2],[],[3]]
 */
