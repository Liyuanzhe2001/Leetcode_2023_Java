package com.lyz.code;

public class main_2446 {

    public static void main(String[] args) {

    }

    public boolean haveConflict(String[] event1, String[] event2) {
        int[] nums1 = {toInt(event1[0]), toInt(event1[1])};
        int[] nums2 = {toInt(event2[0]), toInt(event2[1])};
        return (nums1[0] <= nums2[0] && nums2[0] <= nums1[1]) ||
                (nums1[0] <= nums2[1] && nums2[1] <= nums1[1]) ||
                (nums1[1] <= nums2[1] && nums2[0] <= nums1[0]) ||
                (nums2[1] <= nums1[1] && nums1[0] <= nums2[0]);
    }

    public int toInt(String time) {
        String[] split = time.split(":");
        return Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
    }

}
