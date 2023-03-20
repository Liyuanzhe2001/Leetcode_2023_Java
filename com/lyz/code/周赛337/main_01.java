package com.lyz.code.周赛337;

public class main_01 {

	public static void main(String[] args) {
		new main_01().evenOddBit(2);
	}

	public int[] evenOddBit(int n) {
		String s = Integer.toBinaryString(n);
		int[] res = new int[2];
		for (int i = s.length()-1; i >=0; i--) {
			char c = s.charAt(i);
			if(c == '1') {
				res[(s.length()-1-i)%2]++;
			}
		}
		return res;
    }

}
