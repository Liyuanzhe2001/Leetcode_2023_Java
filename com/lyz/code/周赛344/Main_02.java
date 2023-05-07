package com.lyz.code.周赛344;

import java.util.HashMap;

public class Main_02 {

    public static void main(String[] args) {

    }
}

class FrequencyTracker {

    HashMap<Integer, Integer> map;
    int[] times;

    public FrequencyTracker() {
        map = new HashMap<>();
        times = new int[1000000];
    }

    public void add(int number) {
        if (map.containsKey(number)) {
            times[map.get(number)]--;
            map.put(number, map.get(number) + 1);
            times[map.get(number)]++;
        } else {
            map.put(number, 1);
            times[1]++;
        }
    }

    public void deleteOne(int number) {
        if (!map.containsKey(number)) {
            return;
        }
        if (map.get(number) == 1) {
            times[map.get(number)]--;
            map.remove(number);
        } else {
            times[map.get(number)]--;
            map.put(number, map.get(number) - 1);
            times[map.get(number)]++;
        }
    }

    public boolean hasFrequency(int frequency) {
        return times[frequency] > 0;
    }
}
