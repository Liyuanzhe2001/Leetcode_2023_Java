package com.lyz.code.双周赛115;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lkunk
 * @date 2023年10月14日 21:49
 * @description
 */

public class Main_02 {
    public List<String> getWordsInLongestSubsequence(int n, String[] words, int[] groups) {
        List<String> res = new ArrayList<>();
        if (n == 1) {
            res.add(words[0]);
            return res;
        }
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            while (i + 1 < n && groups[i] == groups[i + 1]) {
                if (words[maxIndex].length() < words[i + 1].length()) {
                    maxIndex = i + 1;
                }
                i++;
            }
            res.add(words[maxIndex]);
        }
        if (groups[n - 1] != groups[n - 2]) {
            res.add(words[n - 1]);
        }
        return res;
    }

}
