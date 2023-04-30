package com.lyz.code.周赛343;

public class Main_01 {

    public static void main(String[] args) {
        //[10,2,2,3]
        //[3,8,4,5]
        int[] player1 = {10, 2, 2, 3};
        int[] player2 = {3, 8, 4, 5};
        System.out.println(new Main_01().isWinner(player1, player2));
    }

    public int isWinner(int[] player1, int[] player2) {
        if (player1.length == 1) {
            if (player1[0] > player2[0]) {
                return 1;
            }
            if (player1[0] < player2[0]) {
                return 2;
            }
            return 0;
        }

        int cnt1 = player1[0];
        int cnt2 = player2[0];
        if (cnt1 == 10) {
            cnt1 += player1[1] * 2;
        } else {
            cnt1 += player1[1];
        }
        if (cnt2 == 10) {
            cnt2 += player2[1] * 2;
        } else {
            cnt2 += player2[1];
        }
        for (int i = 2; i < player1.length; i++) {
            if (player1[i - 1] == 10 || player1[i - 2] == 10) {
                cnt1 += 2 * player1[i];
            } else {
                cnt1 += player1[i];
            }
            if (player2[i - 1] == 10 || player2[i - 2] == 10) {
                cnt2 += 2 * player2[i];
            } else {
                cnt2 += player2[i];
            }
        }
        if (cnt1 > cnt2) {
            return 1;
        }
        if (cnt2 > cnt1) {
            return 2;
        }
        return 0;
    }

}
