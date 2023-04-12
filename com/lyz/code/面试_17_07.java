//package com.lyz.code;
//
//import java.util.Arrays;
//import java.util.HashMap;
//
//public class 面试_17_07 {
//
//    public static void main(String[] args) {
//        String[] names = {"John(15)", "Jon(12)", "Chris(13)", "Kris(4)", "Christopher(19)"};
//        String[] synonyms = {"(Jon,John)", "(John,Johnny)", "(Chris,Kris)", "(Chris,Christopher)"};
//        System.out.println(Arrays.toString(new 面试_17_07().trulyMostPopular(names, synonyms)));
//    }
//
//    public String[] trulyMostPopular(String[] names, String[] synonyms) {
//        HashMap<String, String> replace = new HashMap<>();
//        for (String synonym : synonyms) {
//            String[] nameReplace = getSynonyms(synonym);
//            replace.put(nameReplace[0], nameReplace[1]);
//        }
//
//        HashMap<String, Integer> res = new HashMap<>();
//        for (String name : names) {
//            String n = getName(name);
//            int num = getNum(name);
//            while (replace.containsKey(n)) {
//                n = replace.get(n);
//            }
//            res.put(n, res.getOrDefault(n, 0) + num);
//        }
//
//        String[] resStr = new String[res.size()];
//        int i = 0;
//        for (String key : res.keySet()) {
//            resStr[i++] = key + "(" + res.get(key) + ")";
//        }
//        return resStr;
//    }
//
//    public int getNum(String s) {
//        return Integer.parseInt(s.substring(s.indexOf("(") + 1, s.length() - 1));
//    }
//
//    public String getName(String s) {
//        return s.substring(0, s.indexOf("("));
//    }
//
//    public String[] getSynonyms(String s) {
//        String[] split = s.split(",");
//        String str1 = split[0].substring(1);
//        String str2 = split[1].substring(0, split[1].length() - 1);
//        if (str1.compareTo(str2) < 0) {
//            String tmp = str1;
//            str1 = str2;
//            str2 = tmp;
//        }
//
//        return new String[]{str1, str2};
//    }
//
//}
