package com.lyz.code.双周赛103;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main_04 {

    public static void main(String[] args) {
        int[] nums = {3, 4, -1};
        long l = new Main_04().countOperationsToEmptyArray(nums);
        System.out.println(l);
    }

    public long countOperationsToEmptyArray(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>() {
            {
                for (int num : nums) {
                    add(num);
                }
            }
        };
        list.sort((Comparator.comparingInt(o -> o)));

        int index = 0;
        int n = 0;
        long cnt = 0;
        boolean[] visited = new boolean[nums.length];
        while (n < nums.length) {
            while (visited[index % nums.length]) {
                index++;
            }
            if (list.get(n) == nums[index % nums.length]) {
                n++;
                visited[index % nums.length] = true;
            }
            index++;
            cnt++;
        }
        return cnt;
    }

}
