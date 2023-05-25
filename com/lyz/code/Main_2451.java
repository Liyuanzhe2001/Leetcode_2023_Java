package com.lyz.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main_2451 {

    public static void main(String[] args) {

    }

    public String oddString(String[] words) {
        Map<String, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String s = "";
            for (int j = 0; j < word.length() - 1; j++) {
                s = s + (word.charAt(j + 1) - word.charAt(j)) + ".";
            }
            List<Integer> tmpList = map.getOrDefault(s, new ArrayList<>());
            tmpList.add(i);
            map.put(s, tmpList);
        }
        for (String key : map.keySet()) {
            if (map.get(key).size() == 1) {
                return words[map.get(key).get(0)];
            }
        }
        return "";
    }

}
