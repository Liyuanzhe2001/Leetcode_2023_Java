package com.lyz.code.周赛352;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author lkunk
 * @date 2023年07月02日 10:15
 * @description
 */

public class Main_02 {

    public List<List<Integer>> findPrimePairs(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;
        boolean flag;
        int now = 2;
        while (now < n) {
            for (int i = now + now; i < n; i += now) {
                arr[i] = 1;
            }
            flag = false;
            for (int i = now + 1; i < n; i++) {
                if (arr[i] == 0) {
                    now = i;
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                break;
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 2; i <= n / 2; i++) {
            if (arr[i] == 0 && arr[n - i] == 0) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(n - i);
                res.add(list);
            }
        }
        return res;
    }

}
