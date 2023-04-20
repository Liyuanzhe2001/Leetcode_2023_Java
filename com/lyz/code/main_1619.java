package com.lyz.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class main_1619 {

    public static void main(String[] args) {

    }

    public int[] pondSizes(int[][] land) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[i].length; j++) {
                if (land[i][j] == 0) {
                    list.add(dfs(land, i, j));
                }
            }
        }
        list.sort(Comparator.comparingInt(o -> o));
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public int dfs(int[][] land, int x, int y) {
        if (x < 0 || x > land.length - 1 || y < 0 || y > land[0].length - 1 || land[x][y] != 0) {
            return 0;
        }
        land[x][y] = 1;
        int res = 1;
        res += dfs(land, x + 1, y);
        res += dfs(land, x - 1, y);
        res += dfs(land, x, y + 1);
        res += dfs(land, x, y - 1);
        res += dfs(land, x + 1, y + 1);
        res += dfs(land, x - 1, y - 1);
        res += dfs(land, x - 1, y + 1);
        res += dfs(land, x + 1, y - 1);
        return res;
    }

}
