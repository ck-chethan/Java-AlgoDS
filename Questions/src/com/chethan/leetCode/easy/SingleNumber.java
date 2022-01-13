package com.chethan.leetCode.easy;

// https://leetcode.com/problems/single-number/
// Leetcode - Easy - 136

class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        int res = singleNumber(nums);
        System.out.println(res);
    }
    static int singleNumber(int[] nums) {
        int res = 0;
        for (int i : nums) {
            res = res^i;
        }
        return res;
    }
}