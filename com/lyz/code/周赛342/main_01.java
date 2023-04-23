package com.lyz.code.周赛342;

public class main_01 {
    public static void main(String[] args) {

    }

    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }

}
