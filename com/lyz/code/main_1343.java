package com.lyz.code;

public class main_1343 {

    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 5, 5, 5, 8};
        int k = 3;
        int threshold = 4;
        System.out.println(new main_1343().numOfSubarrays(arr, k, threshold));
    }

    public int numOfSubarrays(int[] arr, int k, int threshold) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int cnt = sum / k >= threshold ? 1 : 0;
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            cnt += sum / k >= threshold ? 1 : 0;
        }
        return cnt;
    }

}
