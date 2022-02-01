package com.chethan.leetCode.easy;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// 121. Best Time to Buy and Sell Stock - Leetcode - Easy

class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int res = maxProfit(prices);
        System.out.println(res);
    }
    static int maxProfit(int[] prices) {
        var maxProfit = 0;

        for (int i = 1, cheapest = prices[0]; i < prices.length; i++) {
            if (prices[i] >= cheapest)
                maxProfit = Math.max(maxProfit, prices[i] - cheapest);
            cheapest = Math.min(cheapest, prices[i]);
        }
        return maxProfit;
    }
}