package com.lyz.code;

import java.util.List;

public class main_1773 {

    public static void main(String[] args) {

    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        if ("type".equals(ruleKey)) {
            return cal(items, ruleValue, 1);
        }
        if ("color".equals(ruleKey)) {
            return cal(items, ruleValue, 2);
        }
        return cal(items, ruleValue, 3);
    }

    public int cal(List<List<String>> items, String ruleValue, int index) {
        int res = 0;
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                res++;
            }
        }
        return res;
    }

}
