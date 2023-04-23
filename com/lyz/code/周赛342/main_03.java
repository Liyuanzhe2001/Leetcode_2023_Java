package com.lyz.code.周赛342;

import java.util.*;

public class main_03 {

    public static void main(String[] args) {
        int[] nums = {-3, 1, 2, -3, 0, -3};
        int k = 2, x = 1;
        int[] subarrayBeauty = new main_03().getSubarrayBeauty(nums, k, x);
        System.out.println(Arrays.toString(subarrayBeauty));
    }

        public int[] getSubarrayBeauty(int[] nums, int k, int x) {
            int[] res = new int[nums.length - k + 1];
            int index = 0;

            Map<Integer, Integer> map = new TreeMap<>();
            for (int i = 0; i < k; i++) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
            int tmpIndex = 0;
            for (Integer key : map.keySet()) {
                Integer value = map.get(key);
                tmpIndex += value;
                if (tmpIndex >= x) {
                    if (key < 0) {
                        res[index++] = key;
                    } else {
                        res[index++] = 0;
                    }
                    break;
                }
            }

            for (int i = k; i < nums.length; i++) {
                // 删除头部
                int bef = map.get(nums[i - k]);

                if (bef == 1) {
                    map.remove(nums[i - k]);
                } else {
                    map.put(nums[i - k], bef - 1);
                }

                // 添加尾部
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

                tmpIndex = 0;
                for (Integer key : map.keySet()) {
                    Integer value = map.get(key);
                    tmpIndex += value;
                    if (tmpIndex >= x) {
                        if (key < 0) {
                            res[index++] = key;
                        } else {
                            res[index++] = 0;
                        }
                        break;
                    }
                }
            }
            return res;
        }

}
