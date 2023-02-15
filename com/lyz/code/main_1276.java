package com.lyz.code;

import java.util.ArrayList;
import java.util.List;

public class main_1276 {

    public static void main(String[] args) {
        int tomatoSlices = 2, cheeseSlices = 1;
        System.out.println(new main_1276().numOfBurgers(tomatoSlices, cheeseSlices));
    }

    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        if (tomatoSlices < 2 * cheeseSlices) {
            return new ArrayList<>();
        }
        int total_jumbo = (tomatoSlices - 2 * cheeseSlices) / 2;
        int total_small = cheeseSlices - total_jumbo;
        if (total_jumbo < 0 || total_small < 0 || total_jumbo * 4 + total_small * 2 != tomatoSlices) {
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>() {
            {
                add(total_jumbo);
                add(total_small);
            }
        };
        return list;
    }

}
