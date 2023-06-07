package com.lyz.code;

import java.util.Arrays;

public class main_2611 {

    public static void main(String[] args) {

    }

    class Reward {
        int index;
        int value;
    }

    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int len = reward1.length;
        Reward[] rewards = new Reward[len];
        for (int i = 0; i < len; i++) {
            rewards[i] = new Reward();
            rewards[i].index = i;
            rewards[i].value = reward1[i] - reward2[i];
        }
        Arrays.sort(rewards, (o1, o2) -> o2.value - o1.value);
        for (Reward reward : rewards) {
            System.out.println(reward.index + " " + reward.value);
        }
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if (i < k) {
                sum += reward1[rewards[i].index];
            } else {
                sum += reward2[rewards[i].index];
            }
        }
        return sum;
    }

}
