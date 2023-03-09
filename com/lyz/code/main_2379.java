package com.lyz.code;

public class main_2379 {

    public static void main(String[] args) {
//        String blocks = "WBBWWBBWBW";
        String blocks = "WBWBBBW";
//        int k = 7;
        int k = 2;
        System.out.println(new main_2379().minimumRecolors(blocks, k));
    }

    public int minimumRecolors(String blocks, int k) {
        int min = 0;
        // 检查最前面k个
        for (int i = 0; i < k; i++) {
            char c = blocks.charAt(i);
            if (c == 'W') {
                min++;
            }
        }

        int tmp = min;
        for (int i = k; i < blocks.length(); i++) {
            char c = blocks.charAt(i);
            char bef = blocks.charAt(i - k);
            if (bef == c) {
                continue;
            }
            if (bef == 'B' && c == 'W') {
                tmp++;
            } else if (bef == 'W' && c == 'B') {
                tmp--;
            }
            min = Math.min(tmp, min);
        }
        return min;
    }

}
