//package com.lyz.code;
//
//import java.util.Arrays;
//import java.util.Comparator;
//
//public class main_1024 {
//
//    public static void main(String[] args) {
////        int[][] clips = {{0, 2}, {4, 6}, {8, 10}, {1, 9}, {1, 5}, {5, 9}};
//        int[][] clips = {{0, 1}, {6, 8}, {0, 2}, {5, 6}, {0, 4}, {0, 3}, {6, 7}, {1, 3}, {4, 7}, {1, 4}, {2, 5}, {2, 6}, {3, 4}, {4, 5}, {5, 7}, {6, 9}};
////        int time = 10;
//        int time = 9;
//        System.out.println(new main_1024().videoStitching(clips, time));
//    }
//
//    public int videoStitching(int[][] clips, int time) {
//        Arrays.sort(clips, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if (o1[0] != o2[0]) {
//                    return o1[0] - o2[0];
//                } else {
//                    return (o2[1] - o2[0]) - (o1[1] - o1[0]);
//                }
//            }
//        });
//        for (int[] clip : clips) {
//            System.out.println(Arrays.toString(clip));
//        }
//        if (clips[0][0] != 0 || clips[clips.length - 1][1] < time) {
//            return -1;
//        }
//        int end = clips[0][1];
//        int index = 1;
//        int cnt = 1;
//        while (end < time) {
//            int max = Integer.MIN_VALUE;
//            while (index < clips.length) {
//                if (clips[index][0] <= end) {
//                    max = Math.max(max, clips[index][1]);
//                } else {
//                    break;
//                }
//                index++;
//            }
//            end = max;
//            cnt++;
//        }
//
//        return cnt;
//    }
//
//}
