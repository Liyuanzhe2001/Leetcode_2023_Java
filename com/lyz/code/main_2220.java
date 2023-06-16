package com.lyz.code;

import java.util.Map;

public class main_2220 {

    public int minBitFlips(int start, int goal) {
        int res = 0;
        while (start > 0 || goal > 0) {
            if (start % 2 != goal % 2) {
                res++;
            }
            start >>= 1;
            goal >>= 1;
        }
        return res;
    }

}
