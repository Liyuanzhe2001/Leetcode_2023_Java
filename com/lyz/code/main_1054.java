package com.lyz.code;

import java.util.Arrays;

public class main_1054 {

    public static void main(String[] args) {
//        int[] barcodes = new int[]{1, 1, 1, 2, 2, 2};
//        int[] barcodes = new int[]{1, 1, 1, 1, 2, 2, 3, 3};
//        int[] barcodes = new int[]{1, 1, 2};
        int[] barcodes = new int[]{2, 1, 1};
        System.out.println(Arrays.toString(new main_1054().rearrangeBarcodes(barcodes)));
    }

    public int[] rearrangeBarcodes(int[] barcodes) {
        for (int i = 1; i < barcodes.length; i++) {
            if (barcodes[i] == barcodes[i - 1]) {
                for (int j = i + 1; j < barcodes.length; j++) {
                    if (barcodes[j] != barcodes[i]) {
                        int tmp = barcodes[i];
                        barcodes[i] = barcodes[j];
                        barcodes[j] = tmp;
                        break;
                    }
                }
            }
        }

        for (int i = barcodes.length - 2; i >= 0; i--) {
            if (barcodes[i] == barcodes[i + 1]) {
                for (int j = i - 1; j >= 0; j--) {
                    if (barcodes[j] != barcodes[i]) {
                        int tmp = barcodes[i];
                        barcodes[i] = barcodes[j];
                        barcodes[j] = tmp;
                        break;
                    }
                }
            }
        }

        return barcodes;
    }

}
