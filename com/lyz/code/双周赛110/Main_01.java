package com.lyz.code.双周赛110;

/**
 * @author lkunk
 * @date 2023年08月05日 22:27
 * @description
 */

public class Main_01 {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        if (purchaseAmount % 10 == 0) {
            return 100 - purchaseAmount;
        }
        if (purchaseAmount % 10 < 5) {
            return 100 - purchaseAmount / 10 * 10;
        }
        return 100 - (purchaseAmount / 10 + 1) * 10;
    }
}
