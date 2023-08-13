package com.lyz.code.周赛358;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author lkunk
 * @date 2023年08月13日 10:43
 * @description
 */

public class Main_03 {
    public int minAbsoluteDifference(List<Integer> nums, int x) {
        if (x == 0) {
            return 0;
        }
        int n = nums.size();
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size() - x; i++) {
            res = Math.min(res, Math.abs(nums.get(i) - find(nums.subList(i + x, n), nums.get(i))));
        }
        return res;
    }

    public int find(List<Integer> arr, int x) {
        int low = 0, high = arr.size() - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) >= x) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return arr.get(low);
    }

}
/*
[4,3,2,4]
2
[5,3,2,10,15]
1
[1,2,3,4]
3
[24,121,85,83]
1
[71,4]
1
 */
