package com.lyz.code;

public class main_1232 {

    public static void main(String[] args) {
//        int[][] coordinates = {{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};
        int[][] coordinates = {{0, 0}, {0, 1}, {0, -1}};
        System.out.println(new main_1232().checkStraightLine(coordinates));
    }

    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 2) {
            return true;
        }
        if (coordinates[0][0] == coordinates[1][0]) {
            for (int[] coordinate : coordinates) {
                if (coordinate[0] != coordinates[0][0]) {
                    return false;
                }
            }
            return true;
        }
        if (coordinates[0][1] == coordinates[1][1]) {
            for (int[] coordinate : coordinates) {
                if (coordinate[1] != coordinates[0][1]) {
                    return false;
                }
            }
            return true;
        }
        double k = 1.0 * (coordinates[0][1] - coordinates[1][1]) / (coordinates[0][0] - coordinates[1][0]);
        double b = coordinates[0][1] - k * coordinates[0][0];
        for (int i = 2; i < coordinates.length; i++) {
            if (coordinates[i][1] != k * coordinates[i][0] + b) {
                return false;
            }
        }
        return true;
    }

}
