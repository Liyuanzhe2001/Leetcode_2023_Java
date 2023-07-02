package com.lyz.code.周赛352;

import java.util.LinkedList;

/**
 * @author lkunk
 * @date 2023年07月02日 10:15
 * @description
 */

public class Main_03 {
    public long continuousSubarrays(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        LinkedList<Integer> qmin = new LinkedList<>();
        LinkedList<Integer> qmax = new LinkedList<>();
        int i = 0;
        int j = 0;
        int res = 0;
        while (i < nums.length) {
            while (j < nums.length) {
                while (!qmin.isEmpty() && nums[qmin.peekLast()] >= nums[j]) {
                    qmin.pollLast();
                }
                qmin.addLast(j);
                while (!qmax.isEmpty() && nums[qmax.peekLast()] <= nums[j]) {
                    qmax.pollLast();
                }
                qmax.addLast(j);
                if (nums[qmax.getFirst()] - nums[qmin.getFirst()] > 2) {
                    break;
                }
                j++;
            }
            if (qmin.peekFirst() == i) {
                qmin.pollFirst();
            }
            if (qmax.peekFirst() == i) {
                qmax.pollFirst();
            }
            res += j - i;
            i++;
        }
        return res;
    }
}
