package com.lyz.code.双周赛104;

public class Main_01 {

    public static void main(String[] args) {

    }

    public int countSeniors(String[] details) {
        int cnt = 0;
        for (String detail : details) {
            System.out.println(Integer.parseInt(detail.substring(11, 13)));
            if (Integer.parseInt(detail.substring(11, 13)) > 60) {
                cnt++;
            }
        }
        return cnt;
    }

}
