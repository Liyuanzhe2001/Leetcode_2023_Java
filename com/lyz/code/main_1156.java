package com.lyz.code;

import java.util.HashMap;
import java.util.Map;

public class main_1156 {

    public static void main(String[] args) {

    }

    public int maxRepOpt1(String text) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        for (int i = 0; i < text.length(); i++) {
            char key = text.charAt(i);
            map.put(key, map.getOrDefault(key, 0) + 1);
            maxLen = Math.max(maxLen, map.get(key));
        }

        int len = 1;
        while (len <= maxLen) {
            Map<Character, Integer> tmpMap = new HashMap<>();
            for (int i = 0; i < len; i++) {
                char key = text.charAt(i);
                tmpMap.put(key, tmpMap.getOrDefault(key, 0) + 1);
            }
            if (tmpMap.keySet().size() == 1) {
                len++;
                continue;
            }
            if (tmpMap.keySet().size() == 2) {
                boolean f = false;
                for (Character key : tmpMap.keySet()) {
                    if (tmpMap.get(key) == len - 1 && map.get(key) >= len) {
                        f = true;
                    }
                }
                if (f) {
                    len++;
                    continue;
                }
            }
            boolean flag = false;
            for (int i = len; i < text.length(); i++) {
                char key = text.charAt(i);
                tmpMap.put(key, tmpMap.getOrDefault(key, 0) + 1);
                char preKey = text.charAt(i - len);
                if (tmpMap.get(preKey) == 1) {
                    tmpMap.remove(preKey);
                } else {
                    tmpMap.put(preKey, tmpMap.get(preKey) - 1);
                }
                if (tmpMap.keySet().size() == 1) {
                    flag = true;
                    break;
                }
                if (tmpMap.keySet().size() == 2) {
                    boolean f = false;
                    for (Character k : tmpMap.keySet()) {
                        if (tmpMap.get(k) == len - 1 && map.get(k) >= len) {
                            f = true;
                        }
                    }
                    if (f) {
                        flag = true;
                        break;
                    }
                }
            }
            if (flag) {
                len++;
            } else {
                break;
            }
        }
        return len-1;
    }

}
