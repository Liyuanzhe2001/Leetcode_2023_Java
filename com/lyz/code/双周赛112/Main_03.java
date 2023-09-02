package com.lyz.code.双周赛112;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lkunk
 * @date 2023年09月02日 22:03
 * @description
 */

public class Main_03 {
    public long maxSum(List<Integer> nums, int m, int k) {
        long res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        long tmp = 0;
        for (int i = 0; i < k; i++) {
            Integer num = nums.get(i);
            map.put(num, map.getOrDefault(num, 0) + 1);
            tmp += num;
        }
        System.out.println(map.size());
        if (map.size() >= m) {
            res = tmp;
        }
        for (int i = k; i < nums.size(); i++) {
            Integer num = nums.get(i);
            Integer tmpNum = nums.get(i - k);
            map.put(tmpNum, map.get(tmpNum) - 1);
            if (map.get(tmpNum) == 0) {
                map.remove(tmpNum);
            }
            tmp -= tmpNum;
            tmp += num;
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.size() >= m) {
                res = Math.max(res, tmp);
            }
        }
        return res;
    }
}

/*
[2,6,7,3,1,7]
3
4
[5,9,9,2,4,5,4]
1
3
[1,2,1,2,1,2,1]
3
3
[1,1,1,3]
2
2
 */
