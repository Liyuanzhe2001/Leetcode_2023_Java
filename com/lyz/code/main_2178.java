package com.lyz.code;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lkunk
 * @date 2023年07月06日 14:21
 * @description
 */

public class main_2178 {

    public static void main(String[] args) {

    }

    List<Long> res = new ArrayList<>();

    public List<Long> maximumEvenSplit(long finalSum) {
        if (finalSum % 2 == 1) {
            return new ArrayList<>();
        }
        dfs(finalSum, 2);
        return res;
    }

    public void dfs(long finalSum, long num) {
        if (finalSum - num < num + 2) {
            res.add(finalSum);
            return;
        }
        res.add(num);
        dfs(finalSum - num, num + 2);
    }

}
