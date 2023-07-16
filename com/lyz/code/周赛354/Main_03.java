package com.lyz.code.周赛354;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lkunk
 * @date 2023年07月16日 10:17
 * @description
 */

public class Main_03 {
    public int minimumIndex(List<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer integer : nums) {
            map.put(integer, map.getOrDefault(integer, 0) + 1);
        }
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < nums.size(); i++) {
            Integer num = nums.get(i);
            map.put(num, map.get(num) - 1);
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            if (freqMap.get(num) * 2 > i + 1 && map.get(num) * 2 > nums.size() - i - 1) {
                System.out.println(freqMap.get(num));
                return i;
            }
        }
        return -1;
    }


}
