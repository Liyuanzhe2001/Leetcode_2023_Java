//package com.lyz.code;
//
//import java.util.LinkedList;
//import java.util.List;
//
//public class main_1388 {
//
//    public static void main(String[] args) {
//
//    }
//
//    public int maxSizeSlices(int[] slices) {
//        int n = slices.length / 3;
//        int res = 0;
//        List<Integer> list = new LinkedList<>() {{
//            for (int slice : slices) {
//                add(slice);
//            }
//        }};
//        while (list.size() < 3) {
//            int max = -1;
//            int maxIndex = -1;
//            for (int i = 0; i < list.size(); i++) {
//                if (max < list.get(i)) {
//                    max = list.get(i);
//                    maxIndex = i;
//                }
//            }
//            res += max;
//            int lef = (maxIndex - 1 + list.size()) % list.size();
//            int rig = (maxIndex + 1) % list.size();
//            int tmp = list.get(lef) + list.get(rig) - max;
//            list.remove(maxIndex);
//            list.add(maxIndex, tmp);
//            list.remove(lef);
//            list.remove(rig);
//        }
//        return res;
//    }
//
//}
