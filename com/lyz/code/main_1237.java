package com.lyz.code;

import java.util.ArrayList;
import java.util.List;

class CustomFunction {
    public int f(int x, int y) {
        return x + y;
    }
};

public class main_1237 {

    public static void main(String[] args) {
        CustomFunction customFunction = new CustomFunction();
        System.out.println(new main_1237().findSolution(customFunction, 5));
    }

    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= 1000; j++) {
                if(customfunction.f(i,j)==z){
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    res.add(list);
                }
            }
        }
        return res;
    }

}
