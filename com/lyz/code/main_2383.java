package com.lyz.code;

public class main_2383 {
    public static void main(String[] args) {
//        int initialEnergy = 5;
//        int initialExperience = 3;
//        int[] energy = {1, 4, 3, 2};
//        int[] experience = {2, 6, 3, 1};
        int initialEnergy = 2;
        int initialExperience = 4;
        int[] energy = {1};
        int[] experience = {3};
        System.out.println(new main_2383().minNumberOfHours(initialEnergy, initialExperience, energy, experience));
    }

    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int s = 0;
        for (int i = 0; i < energy.length; i++) {
            if (initialEnergy <= energy[i]) {
                s += energy[i] - initialEnergy + 1;
                initialEnergy = energy[i] + 1;
            }
            if (initialExperience <= experience[i]) {
                s += experience[i] - initialExperience + 1;
                initialExperience = experience[i] + 1;
            }
            initialEnergy -= energy[i];
            initialExperience += experience[i];
        }
        return s;
    }

}
