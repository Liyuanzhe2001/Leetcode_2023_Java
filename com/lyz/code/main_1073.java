package com.lyz.code;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class main_1073 {

    public static void main(String[] args) {

    }

    public int[] addNegabinary(int[] arr1, int[] arr2) {
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int c = 0;
        List<Integer> list = new ArrayList<>();
        while (i >= 0 || j >= 0 || c != 0) {
            int x = c;
            if (i >= 0) {
                x += arr1[i];
            }
            if (j >= 0) {
                x += arr2[j];
            }
            if (x >= 2) {
                list.add(x - 2);
                c = -1;
            } else if (x >= 0) {
                list.add(x);
                c = 0;
            } else {
                list.add(1);
                c = 1;
            }
            i--;
            j--;
        }
        while (list.size() > 1 && list.get(list.size() - 1) == 0) {
            list.remove(list.size() - 1);
        }
        int[] res = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            res[k] = list.get(list.size() - k - 1);
        }
        return res;
    }

}
