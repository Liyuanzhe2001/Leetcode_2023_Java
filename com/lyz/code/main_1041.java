package com.lyz.code;

public class main_1041 {

    public static void main(String[] args) {
        System.out.println(new main_1041().isRobotBounded("GL"));
    }

    public boolean isRobotBounded(String instructions) {
        int[][] step = {
                {0, 1},
                {-1, 0},
                {0, -1},
                {1, 0},
        };
        int x = 0;
        int y = 0;
        int front = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < instructions.length(); j++) {
                char c = instructions.charAt(j);
                if (c == 'G') {
                    x += step[front][0];
                    y += step[front][1];
                } else if (c == 'L') {
                    front = (front + 1) % 4;
                } else if (c == 'R') {
                    front = (front + 4 - 1) % 4;
                }
            }
            if (x == 0 && y == 0) {
                return true;
            }
        }
        return false;
    }

}
