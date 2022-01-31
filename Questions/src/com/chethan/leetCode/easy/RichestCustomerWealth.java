package com.chethan.leetCode.easy;

// https://leetcode.com/problems/richest-customer-wealth/
// 1672. Richest Customer Wealth - Leetcode - Easy

class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        int res = maximumWealth(accounts);
        System.out.println(res);
    }
    static int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] person: accounts){
            int bal = 0;
            for (int account: person){
                bal+=account;
            }
            max = Math.max(max, bal);
        }
        return max;
    }
}