package com.lyz.code;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class main_2210 {

    public static void main(String[] args) {
        int[] nums = {2, 4, 1, 1, 6, 5};
        System.out.println(new main_2210().countHillValley(nums));
    }

    public int countHillValley(int[] nums) {
        int cnt = 0;
        int bef = nums[0];
        List<Integer> list = new ArrayList<>();
        list.add(bef);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == bef) {
                continue;
            }
            list.add(nums[i]);
            bef = nums[i];
        }

        for (int i = 1; i < list.size() - 1; i++) {
            if ((list.get(i) < list.get(i - 1) && list.get(i) < list.get(i + 1)) || (list.get(i) > list.get(i - 1) && list.get(i) > list.get(i + 1))) {
                cnt++;
            }
        }

        return cnt;
    }

}
