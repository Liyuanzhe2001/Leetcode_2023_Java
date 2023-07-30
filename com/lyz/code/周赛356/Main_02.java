package com.lyz.code.周赛356;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author lkunk
 * @date 2023年07月30日 10:23
 * @description
 */

public class Main_02 {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int n = set.size();
        if (n == 1) {
            int res = 0;
            for (int i = 1; i <= nums.length; i++) {
                res += i;
            }
            return res;
        }
        int lef = 0;
        int rig = 0;
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while (rig < nums.length) {
            map.put(nums[rig], map.getOrDefault(nums[rig], 0) + 1);
            if (map.size() >= n) {
                res += nums.length - rig;
                System.out.println(map);
                if (map.get(nums[lef]) == 1) {
                    map.remove(nums[lef]);
                } else {
                    map.put(nums[lef], map.get(nums[lef] - 1));
                }
                lef++;
                map.put(nums[rig], map.get(nums[rig]) - 1);
            } else {
                rig++;
            }
        }
        return res;
    }
}

/*
[1,3,1,2,2]
[5,5,5,5]
[459,459,962,1579,1435,756,1872,1597]
[1454,1789,1454]
 */
