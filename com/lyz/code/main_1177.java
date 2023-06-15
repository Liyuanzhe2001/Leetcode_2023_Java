package com.lyz.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main_1177 {

    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        int[][] sum = new int[s.length() + 1][26];
        for (int i = 0; i < s.length(); i++) {
            sum[i + 1] = sum[i].clone();
            sum[i + 1][s.charAt(i) - 'a']++;
        }

        List<Boolean> res = new ArrayList<>();
        for (int[] query : queries) {
            int lef = query[0];
            int rig = query[1] + 1;
            int k = query[2];
            int ss = 0;
            for (int i = 0; i < sum[rig].length; i++) {
                ss += (sum[rig][i] - sum[lef][i]) % 2;
            }
            res.add(ss / 2 <= k);
        }
        return res;
    }

}
