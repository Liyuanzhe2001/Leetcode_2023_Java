package com.lyz.code.周赛337;

public class main_04 {

	public static void main(String[] args) {
		int[] nums = { 1, -10, 7, 13, 6, 8 };
//		int[] nums = { 3, 0, 3, 2, 4, 2, 1, 1, 0, 4 };
//		int[] nums = {1,-10,7,13,6,8};
		int value = 5;
		System.out.println(new main_04().findSmallestInteger(nums, value));
	}

	public int findSmallestInteger(int[] nums, int value) {
		int target = 0;
		boolean[] flag = new boolean[nums.length];
		int start = 0;
		int end = nums.length;
		for (int i = 0; i < nums.length; i++) {
			boolean tmp = false;
			for (int j = start; j < end; j++) {
				if (!flag[j]) {
					int tmpN = nums[j];
					if (tmpN < target) {
						while (tmpN < target) {
							tmpN += value;
						}
					} else if (tmpN > target) {
						while (tmpN > target) {
							tmpN -= value;
						}
					}
					if (tmpN == target) {
						target++;
						flag[j] = true;
						if (start == j) {
							start = j + 1;
						}
						if (end == j) {
							end = j - 1;
						}
						tmp = true;
						break;
					}
				}
			}
			if (!tmp) {
				return target;
			}
		}
		return target;
	}

}
