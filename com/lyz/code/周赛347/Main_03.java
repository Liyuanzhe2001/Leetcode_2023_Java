//package com.lyz.code.周赛347;
//
//import java.util.Locale;
//
//public class Main_03 {
//
//    public static void main(String[] args) {
//
//    }
//
//    public long minimumCost(String s) {
//        String leftS = s.substring(0, s.length() / 2);
//        String rigS = s.substring(s.length() / 2);
//        long lefRes1 = dfsLeft(leftS, "1");
//        long rigRes1 = dfsRight(rigS, "1");
//        long lefRes2 = dfsLeft(leftS, "0");
//        long rigRes2 = dfsRight(rigS, "0");
//        return Math.min(lefRes1 + rigRes1, lefRes2 + rigRes2);
//    }
//
//    public long dfsLeft(String s, String target) {
//        if (!s.contains(target)) {
//            return 0;
//        }
//        return s.lastIndexOf(target) + 1 + dfsLeft(rep(s.substring(0, s.lastIndexOf(target))), target);
//    }
//
//    public long dfsRight(String s, String target) {
//        if (!s.contains(target)) {
//            return 0;
//        }
//        return s.length() - s.indexOf(target) + dfsRight(rep(s.substring(s.indexOf(target))), target);
//    }
//
//    public String rep(String num) {
//        if (num.length() == 0) {
////            return "";
//        }
//        String tmp = "";
//        for (int i = 0; i < num.length(); i++) {
//            tmp += "1";
//        }
//        return Integer.toBinaryString(Integer.parseInt(num, 2) ^ Integer.parseInt(tmp, 2));
//    }
//
//
//}
