package com.lyz.code.周赛350;

public class Main_01 {
    public static void main(String[] args) {

    }

    public int distanceTraveled(int mainTank, int additionalTank) {
        int res = 0;
        while (mainTank > 0) {
            if (mainTank >= 5) {
                mainTank -= 5;
                if (additionalTank > 0) {
                    mainTank += 1;
                    additionalTank -= 1;
                }
                res += 50;
            } else {
                res += mainTank * 10;
            }
        }
        return res;
    }

}
