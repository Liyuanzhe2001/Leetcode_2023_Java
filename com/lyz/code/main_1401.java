package com.lyz.code;

public class main_1401 {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        double res = 0;
        if (xCenter < x1 || xCenter > x2) {
            res += Math.min(Math.pow(x1 - xCenter, 2), Math.pow(xCenter - x2, 2));
        }
        if (yCenter < y1 || yCenter > y2) {
            res += Math.min(Math.pow(y1 - yCenter, 2), Math.pow(yCenter - y2, 2));
        }
        return res <= radius * radius;
    }
}
