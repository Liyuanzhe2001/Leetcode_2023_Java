package com.lyz.code.周赛360;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lkunk
 * @date 2023年08月27日 9:54
 * @description
 */

public class Main_01 {
    public int furthestDistanceFromOrigin(String moves) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('L', 0);
        map.put('R', 0);
        map.put('_', 0);
        for (char c : moves.toCharArray()) {
            map.put(c, map.get(c) + 1);
        }
        if (map.get('L') < map.get('R')) {
            return map.get('R') - map.get('L') + map.get('_');
        } else {
            return map.get('L') - map.get('R') + map.get('_');
        }
    }

    int res = 0;

    public void dfs(String moves, int n, int index) {
        if (index >= moves.length()) {
            res = Math.max(res, Math.abs(n));
            return;
        }
        if (moves.charAt(index) == 'L') {
            n--;
            dfs(moves, n, index + 1);
        } else if (moves.charAt(index) == 'R') {
            n++;
            dfs(moves, n, index + 1);
        } else {
            dfs(moves, n + 1, index + 1);
            dfs(moves, n - 1, index + 1);
        }
    }

}
