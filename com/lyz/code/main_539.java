package com.lyz.code;

import java.util.*;

public class main_539 {

    public static void main(String[] args) {
        List<String> timePoints = new ArrayList<>() {{
            add("00:00");
            add("23:59");
            add("00:00");
        }};
        System.out.println(new main_539().findMinDifference(timePoints));
    }

    public int findMinDifference(List<String> timePoints) {
        Collections.sort(timePoints);
        int min = getM(timePoints.get(timePoints.size() - 1), timePoints.get(0));
        for (int i = 0; i < timePoints.size() - 1; i++) {
            min = Math.min(min, getM(timePoints.get(0), timePoints.get(1)));
        }
        return min;
    }

    public int getM(String time1, String time2) {
        String[] splitOne = time1.split(":");
        String[] splitTwo = time2.split(":");
        int res = 60 * (Integer.parseInt(splitTwo[0]) - Integer.parseInt(splitOne[0]))
                + (Integer.parseInt(splitTwo[1]) - Integer.parseInt(splitOne[1]));
        res = Math.abs(res);
        return res > 720 ? 1440 - res : res;
    }

}
