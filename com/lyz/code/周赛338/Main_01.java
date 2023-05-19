package com.lyz.code.周赛338;

public class Main_01 {

    public static void main(String[] args) {

    }

    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if (k > numNegOnes) {
            return k;
        }
        if (k > numZeros + numOnes) {
            return numOnes;
        }
        return numOnes - (k - numOnes);
    }

}
