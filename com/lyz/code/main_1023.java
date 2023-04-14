package com.lyz.code;

import java.util.ArrayList;
import java.util.List;

public class main_1023 {

    public static void main(String[] args) {
        String[] queries = {"FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack"};
        String pattern = "FB";
        System.out.println(new main_1023().camelMatch(queries, pattern));
    }

    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> list = new ArrayList<>();
        char[] chars = pattern.toCharArray();
        for (String query : queries) {
            list.add(compare(query, chars));
        }
        return list;
    }

    public boolean compare(String query, char[] pattern) {
        for (char c : pattern) {
            int index = query.indexOf(c);
            if (index >= 0) {
                String tmp = query.substring(0, query.indexOf(c));
                if (tmp.equals(tmp.toLowerCase())) {
                    query = query.substring(query.indexOf(c) + 1);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return query.equals(query.toLowerCase());
    }

}
