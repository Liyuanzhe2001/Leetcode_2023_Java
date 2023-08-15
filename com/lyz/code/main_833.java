package com.lyz.code;

import java.util.*;

/**
 * @author lkunk
 * @date 2023年08月15日 23:12
 * @description
 */

public class main_833 {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        int n = s.length();
        String[] replaceStr = new String[n];
        int[] replaceLen = new int[n];
        Arrays.fill(replaceLen, 1);
        for (int i = 0; i < indices.length; i++) {
            int idx = indices[i];
            if (s.startsWith(sources[i], idx)) {
                replaceStr[idx] = targets[i];
                replaceLen[idx] = sources[i].length();
            }
        }

        String res = "";
        for (int i = 0; i < n; i += replaceLen[i]) {
            if (replaceStr[i] == null) {
                res += s.charAt(i);
            } else {
                res += replaceStr[i];
            }
        }
        return res;
    }
}
