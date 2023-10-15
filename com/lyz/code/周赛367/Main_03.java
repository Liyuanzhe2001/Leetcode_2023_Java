package com.lyz.code.周赛367;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2023年10月15日 10:23
 * @description
 */

public class Main_03 {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int n = nums.length;
        int[] minNums = new int[n];
        int[] minIndex = new int[n];
        int[] maxNums = new int[n];
        int[] maxIndex = new int[n];
        minNums[n - 1] = nums[n - 1];
        minIndex[n - 1] = n - 1;
        maxNums[n - 1] = nums[n - 1];
        maxIndex[n - 1] = n - 1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < minNums[i + 1]) {
                minNums[i] = nums[i];
                minIndex[i] = i;
            } else {
                minNums[i] = minNums[i + 1];
                minIndex[i] = minIndex[i + 1];
            }
            if (nums[i] > maxNums[i + 1]) {
                maxNums[i] = nums[i];
                maxIndex[i] = i;
            } else {
                maxNums[i] = maxNums[i + 1];
                maxIndex[i] = maxIndex[i + 1];
            }
        }

        for (int i = 0; i + indexDifference < nums.length; i++) {
            if (Math.abs(nums[i] - minNums[i + indexDifference]) >= valueDifference) {
                return new int[]{i, minIndex[i + indexDifference]};
            }
            if (Math.abs(nums[i] - maxNums[i + indexDifference]) >=valueDifference){
                return new int[]{i, maxIndex[i + indexDifference]};
            }
        }
        return new int[]{-1, -1};
    }
}


/*
[3,12,40]
0
9
[1]
0
1

 */
