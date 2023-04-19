//package com.lyz.code;
//
//public class main_443 {
//
//    public static void main(String[] args) {
////        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c' };
//        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
//        System.out.println(new main_443().compress(chars));
//    }
//
//    public int compress(char[] chars) {
//        int len = 1;
//        char bef = chars[0];
//        int cnt = 0;
//
//        for (int i = 1; i < chars.length; i++) {
//            if (chars[i] == bef) {
//                len++;
//            } else {
//                bef = chars[i];
//                cnt += len == 1 ? 1 : (len + "").length() + 1;
//                len = 1;
//            }
//        }
//        return cnt + (len == 1 ? 1 : (len + "").length() + 1);
//    }
//
//}
