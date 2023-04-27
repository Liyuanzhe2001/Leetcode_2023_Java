package com.lyz.code;

public class main_2011 {

    public static void main(String[] args) {

    }

    public int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for (String operation : operations) {
            res += operation.charAt(1) == '+' ? 1 : -1;
        }
        return res;
    }


}
