package com.lyz.code;

public class main_2106 {

    public static void main(String[] args) {
        int[][] fruits = {{2, 8}, {6, 3}, {8, 6}};
        int startPos = 5;
        int k = 4;
        System.out.println(new main_2106().maxTotalFruits(fruits, startPos, k));
    }

    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int left = search(fruits, startPos - k);
        int ans = 0, s = 0, n = fruits.length;
        for (int right = left; right < n && fruits[right][0] <= startPos + k; right++) {
            s += fruits[right][1];
            while (fruits[right][0] * 2 - fruits[left][0] - startPos > k && fruits[right][0] - fruits[left][0] * 2 + startPos > k) {
                s -= fruits[left++][1];
            }
            ans = Math.max(ans, s);
        }
        return ans;
    }

    private int search(int[][] fruits, int target) {
        int left = -1, right = fruits.length;
        while (left + 1 < right) {
            int mid = (left + right) >>> 1;
            if (fruits[mid][0] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return right;
    }
}
