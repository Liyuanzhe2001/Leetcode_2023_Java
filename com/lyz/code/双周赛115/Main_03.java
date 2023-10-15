//package com.lyz.code.双周赛115;
//
//import java.util.*;
//
///**
// * @author lkunk
// * @date 2023年10月14日 21:49
// * @description
// */
//
//public class Main_03 {
//
//    Set<Integer> set = new HashSet<>();
//
//    public List<String> getWordsInLongestSubsequence(int n, String[] words, int[] groups) {
//        Map<Integer, List<String>> wordMap = new HashMap<>();
//        Map<Integer, List<Integer>> groupMap = new HashMap<>();
//        for (int i = 0; i < words.length; i++) {
//            String word = words[i];
//            if (!wordMap.containsKey(word.length())) {
//                wordMap.put(word.length(), new ArrayList<>());
//                groupMap.put(word.length(), new ArrayList<>());
//            }
//            wordMap.get(word.length()).add(word);
//            groupMap.get(word.length()).add(groups[i]);
//        }
//        List<String> res = new ArrayList<>();
//
//        List<String> addList = new ArrayList<>();
//        List<String> noList = new ArrayList<>();
//        for (Integer key : wordMap.keySet()) {
//            List<List<String>>[] dp = new ArrayList<>[2];
//            List<Integer> group = groupMap.get(key);
//            List<String> word = wordMap.get(key);
//            for (int i = 1; i < wordMap.get(key).size(); i++) {
//            }
//
//            set = new HashSet<>();
//            List<String> tmp = dfs(new ArrayList<>(), -1, 0, groupMap.get(key), wordMap.get(key));
//            res = res.size() > tmp.size() ? res : tmp;
//        }
//        return res;
//    }
//
//    public List<String> dfs(List<String> list, int preIndex, int index, List<Integer> groups, List<String> words) {
//        if (index >= words.size()) {
//            return list;
//        }
//        List<String> list1 = dfs(new ArrayList<>(list), preIndex, index + 1, groups, words);
//        List<String> list2;
//        List<String> tmp = new ArrayList<>();
//        if (preIndex != -1 && (Objects.equals(groups.get(preIndex), groups.get(index)) || !judge(words.get(preIndex), words.get(index)))) {
//            tmp.add(words.get(index));
//        } else {
//            tmp.addAll(list);
//            tmp.add(words.get(index));
//        }
//        list2 = dfs(tmp, index, index + 1, groups, words);
//        set.add(index);
//        return list1.size() > list2.size() ? list1 : list2;
//    }
//
//    public boolean judge(String w1, String w2) {
//        int n = 0;
//        for (int i = 0; i < w1.length(); i++) {
//            if (w1.charAt(i) != w2.charAt(i)) {
//                n++;
//                if (n > 1) {
//                    return false;
//                }
//            }
//        }
//        return n == 1;
//    }
//
//
//}
//
///*
//3
//["bab","dab","cab"]
//[1,2,2]
//4
//["a","b","c","d"]
//[1,2,3,4]
//9
//["bad","dc","bc","ccd","dd","da","cad","dba","aba"]
//[9,7,1,2,6,8,3,7,2]
// */
