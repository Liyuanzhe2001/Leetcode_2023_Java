package com.lyz.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class main_32 {

    public static void main(String[] args) {
        String s = "()(())";
        System.out.println(new main_32().longestValidParentheses(s));
    }

    public int longestValidParentheses(String s) {
        boolean[] success = new boolean[s.length()];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '('){
                stack.push(i);
            }else {
                if(stack.isEmpty()){
                    success[i] = true;
                }else {
                    stack.pop();
                }
            }
        }
        while (!stack.isEmpty()) {
            success[stack.pop()] = true;
        }
        int max = 0;
        int tmp = 0;
        for (boolean b : success) {
            if (!b) {
                tmp++;
            } else {
                max = Math.max(tmp, max);
                tmp = 0;
            }
        }
        return Math.max(tmp, max);
    }

}
