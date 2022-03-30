package com.chethan.leetCode.easy;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// 121. Best Time to Buy and Sell Stock - Leetcode - Easy

class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int res = maxProfit3(prices);
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

    static int maxProfit2(int[] prices){
        int buyat = prices[0];
        int maxprof = 0;

        for(int price: prices) {

            if(price<buyat) {
                buyat = price;
            }

            else if(price -buyat > maxprof)
                maxprof = price - buyat;
        }
        return maxprof;
    }

    static int maxProfit3(int[] prices){
        int l = 0;
        int r = 1;
        int maxP = 0;

        while (r < prices.length){
            if(prices[l] < prices[r]){
                int profit = prices[r] - prices[l];
                maxP = Math.max(profit, maxP);
            } else{
                l = r;
            }
            r++;
        }

        return maxP;
    }
}