package com.lyz.code;

import java.util.Comparator;

public class offor_034 {

    public static void main(String[] args) {
        String[] words = {"hello", "leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        System.out.println(new offor_034().isAlienSorted(words, order));
    }

    public boolean isAlienSorted(String[] words, String order) {
        Comparator<String> stringComparator = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                int len = Math.min(o1.length(), o2.length());
                for (int i = 0; i < len; i++) {
                    char c1 = o1.charAt(i);
                    char c2 = o2.charAt(i);
                    System.out.println(c1 + " " + c2);
                    int index1 = order.indexOf(c1);
                    int index2 = order.indexOf(c2);
                    if (index1 == index2) {
                        continue;
                    }
                    if (index1 > index2) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
                return o1.length() <= o2.length() ? -1 : 1;
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        };

        for (int i = 0; i < words.length - 1; i++) {
            System.out.println(words[i] + " " + words[i + 1]);
            if (stringComparator.compare(words[i], words[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

}
