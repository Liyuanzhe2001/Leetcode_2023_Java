package com.lyz.code.周赛339;

import java.util.Arrays;

public class Main_03 {

    public static void main(String[] args) {
        System.out.println(new Main_03().miceAndCheese(new int[]{1, 1, 3, 4}, new int[]{4, 4, 1, 1}, 2));
    }

    class Reward {
        int index;
        int value;
    }

    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        Reward[] rewards = new Reward[reward1.length];
        for (int i = 0; i < reward1.length; i++) {
            rewards[i] = new Reward();
            rewards[i].index = i;
            rewards[i].value = reward1[i] - reward2[i];
        }
        Arrays.sort(rewards, (o1, o2) -> o2.value - o1.value);

        boolean[] flag = new boolean[reward1.length];

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int index = rewards[i].index;
            flag[index] = true;
            sum += reward1[index];
        }

        for (int i = 0; i < reward2.length; i++) {
            if (!flag[i]) {
                sum += reward2[i];
            }
        }

        return sum;
    }

}
