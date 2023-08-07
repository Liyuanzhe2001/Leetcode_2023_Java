package com.lyz.code.lc_队列_栈;

import java.util.Stack;

/**
 * @author lkunk
 * @date 2023年08月07日 22:45
 * @description
 */

public class lc_字符串解码 {
    // "3   [a2[c]]"
    // 3[acc]
    // accaccacc
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        String num = "";
        for (char c : s.toCharArray()) {
            if (c <= '9' && c >= '0') {
                num += c;
            } else {
                if (!"".equals(num)) {
                    numStack.add(Integer.parseInt(num));
                    num = "";
                }
                System.out.println(numStack);
                if (c == ']') {
                    String tmp = "";
                    while (!"[".equals(strStack.peek())) {
                        tmp = strStack.pop() + tmp;
                    }
                    strStack.pop();
                    Integer pop = numStack.pop();
                    String str = "";
                    for (int i = 0; i < pop; i++) {
                        str += tmp;
                    }
                    strStack.add(str);
                } else {
                    strStack.add(String.valueOf(c));
                }
            }
        }
        String res = "";
        while (!strStack.isEmpty()) {
            res = strStack.pop() + res;
        }
        return res;
    }
}

/*
"3[a]2[bc]"
"3[a2[c]]"
"2[abc]3[cd]ef"
"abc3[cd]xyz"
"100[leetcode]"
 */

/*
[]
[, 3]
[, 3]
[, 3]
[, 3, a, 2]
[, 3, a, 2]
[, 3, a, 2]
[, 3, a, cc]
 */
