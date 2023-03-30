//package com.lyz.code;
//
//import java.util.Arrays;
//import java.util.Stack;
//
//public class main_1092 {
//
//    public static void main(String[] args) {
//        new main_1092().shortestCommonSupersequence("abac", "cab");
//    }
//
//    public String shortestCommonSupersequence(String str1, String str2) {
//        if (str1.length() < str2.length()) {
//            String tmp = str1;
//            str1 = str2;
//            str2 = tmp;
//        }
//        char[] charOne = str1.toCharArray();
//        char[] charTwo = str2.toCharArray();
//        int[] note = new int[charOne.length];
//        boolean[] flag = new boolean[charOne.length];
//
//        for (int i = 0; i < charOne.length; i++) {
//            char c = charOne[i];
//            for (int j = 0; j < charTwo.length; j++) {
//                if (flag[j]) {
//                    continue;
//                }
//                if (charTwo[j] == c) {
//                    note[i] = j + 1;
//                    flag[j] = true;
//                    break;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(note));
//
//        int[] front = new int[note.length];
//        int[] len = new int[note.length];
//
//        Arrays.fill(front, -1);
//        Arrays.fill(len, 1);
//
//        for (int i = 0; i < note.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if (note[i] > note[j]) {
//                    if (len[i] > len[j]) {
//
//                    }
//                }
//            }
//        }
//
//
//        return "";
//    }
//
//
//}
