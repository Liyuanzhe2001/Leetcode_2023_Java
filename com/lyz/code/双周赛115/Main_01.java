package com.lyz.code.双周赛115;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lkunk
 * @date 2023年10月14日 21:49
 * @description
 */

public class Main_01 {
    public List<Integer> lastVisitedIntegers(List<String> words) {
        List<Integer> nums = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int n = 0;
        for (String word : words) {
            if ("prev".equals(word)) {
                n++;
                if (n > nums.size()) {
                    res.add(-1);
                } else {
                    res.add(nums.get(nums.size() - n));
                }
            } else {
                n = 0;
                nums.add(Integer.parseInt(word));
            }
        }
        return res;
    }
}
