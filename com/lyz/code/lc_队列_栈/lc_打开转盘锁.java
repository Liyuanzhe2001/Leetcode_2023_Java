package com.lyz.code.lc_队列_栈;

import java.util.*;

/**
 * @author lkunk
 * @date 2023年07月31日 23:07
 * @description
 */

public class lc_打开转盘锁 {
    public int openLock(String[] deadends, String target) {
        if (target.equals("0000")) {
            return 0;
        }
        Set<String> set = new HashSet<>(Arrays.asList(deadends));
        if (set.contains("0000")) {
            return -1;
        }
        set.add("0000");
        Queue<String> queue = new LinkedList<>();
        queue.add("0000");
        int n = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int ii = 0; ii < len; ii++) {
                String str = queue.poll();
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    String strAdd = str.substring(0, i) + (ch == '9' ? 0 : ch - '0' + 1) + str.substring(i + 1);
                    String strSub = str.substring(0, i) + (ch == '0' ? 9 : ch - '0' - 1) + str.substring(i + 1);
                    if (!set.contains(strAdd)) {
                        queue.add(strAdd);
                        set.add(strAdd);
                    }
                    if (!set.contains(strSub)) {
                        queue.add(strSub);
                        set.add(strSub);
                    }
                }
            }
            n++;
            if (set.contains(target)) {
                return n;
            }
        }
        return -1;
    }
}
