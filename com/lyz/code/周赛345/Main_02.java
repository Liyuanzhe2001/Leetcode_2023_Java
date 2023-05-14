package com.lyz.code.周赛345;

public class Main_02 {

    public static void main(String[] args) {

    }


    // a异或b等于c
    // 则 a异或c等于b
    public boolean doesValidArrayExist(int[] derived) {
        int[] original = new int[derived.length];
        for (int i = 0; i < original.length - 1; i++) {
            original[i + 1] = original[i] ^ derived[i];
        }
        if ((original[original.length - 1] ^ original[0]) == derived[derived.length - 1]) {
            return true;
        }
        original = new int[derived.length];
        original[0] = 1;
        for (int i = 0; i < original.length - 1; i++) {
            original[i + 1] = original[i] ^ derived[i];
        }
        if ((original[original.length - 1] ^ original[0]) == derived[derived.length - 1]) {
            return true;
        }
        return false;
    }

}
