package com.lyz.code;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class test {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(0,1);
//        list.add(0,2);
//        list.add(0,3);
//        list.add(0,4);
//        System.out.println(list);
//        System.out.println(-1 % 4);
//        int[][] nums=new int[][]{{1,3},{1,2},{4,5},{3,7}};
//        方法一
//        Arrays.sort(nums, (a, b) -> {
//            if(a[0]==b[0]){
//                return a[1]-b[1];
//            }else{
//                return a[0]-b[0];
//            }
//        });
        Integer[] nums = {1, 2, 34, 5, 6};
        Arrays.sort(nums, (a, b) -> b - a);
        System.out.println(Arrays.toString(nums));
    }
}
