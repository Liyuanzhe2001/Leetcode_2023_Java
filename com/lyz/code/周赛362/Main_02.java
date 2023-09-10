package com.lyz.code.周赛362;

/**
 * @author lkunk
 * @date 2023年09月10日 10:17
 * @description
 */

public class Main_02 {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int minX = Math.min(sx, fx);
        int minY = Math.min(sy, fy);
        int maxX = Math.max(sx, fx);
        int maxY = Math.max(sy, fy);
        int cX = maxX - minX;
        int cY = maxY - minY;
        int minT = Math.abs(cX - cY) + Math.min(cX, cY);
        if (minT == 0) {
            return t != 1;
        }
        return minT <= t;
    }

}
