package com.lyz.code;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class main_2423 {

    public static void main(String[] args) {
        String word = "cbbd";
        System.out.println(new main_2423().equalFrequency(word));
    }

    public boolean equalFrequency(String word) {
        int[] cnt = new int[26];
        int n = word.length();
        for (int i = 0; i < n; i++) {
            cnt[word.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (cnt[i] != 0) {
                cnt[i]--;
                HashSet<Integer> set = new HashSet<>();
                for (int c : cnt) {
                    if (c > 0) {
                        set.add(c);
                    }
                }
                if (set.size() == 1) {
                    return true;
                }
                cnt[i]++;
            }
        }
        return false;
    }
}
