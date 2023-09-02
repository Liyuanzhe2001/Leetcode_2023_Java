package com.lyz.code.双周赛112;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lkunk
 * @date 2023年09月02日 22:03
 * @description
 */

public class Main_01 {
    public boolean canBeEqual(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i += 2) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
            map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0) - 1);
        }
        for (Integer value : map.values()) {
            if (value != 0) {
                return false;
            }
        }
        map = new HashMap<>();
        for (int i = 1; i < s1.length(); i += 2) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
            map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0) - 1);
        }
        for (Integer value : map.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
}
