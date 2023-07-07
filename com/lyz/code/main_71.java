package com.lyz.code;

import java.util.Stack;

/**
 * @author lkunk
 * @date 2023年07月07日 21:35
 * @description
 */

public class main_71 {

    public static void main(String[] args) {
        String s = new main_71().simplifyPath("/../");
        System.out.println(s);
    }

    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        for (String s : path.split("/")) {
            if ("".equals(s) || ".".equals(s)) {
            } else if ("..".equals(s)) {
                if (stack.size() != 1) {
                    stack.pop();
                }
            } else {
                stack.add(s);
            }
        }
        String res = "";
        while (!stack.isEmpty()) {
            res = "/" + stack.pop() + res;
        }
        return "".equals(res) ? "/" : res;
    }
}
