package com.lyz.code;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class main_1079 {

    public static void main(String[] args) {

    }

    public int numTilePossibilities(String tiles) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < tiles.length(); i++) {
            char c = tiles.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
        return dfs(map, tiles.length());
    }

    public int dfs(Map<Character, Integer> map, int i) {
        if (i == 0) {
            return 1;
        }
        int res = 0;
        Set<Character> set;
        set = map.keySet();
        for (Character key : set) {
            if (map.get(key) > 0) {
                map.put(key, map.get(key) - 1);
                res += dfs(map, i - 1);
                map.put(key, map.get(key) + 1);
            }
        }
        return res;
    }

}
