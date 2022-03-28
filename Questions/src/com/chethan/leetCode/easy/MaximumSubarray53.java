package com.chethan.leetCode.easy;

// https://leetcode.com/problems/maximum-subarray/
// 53. Maximum Subarray - Leetcode - Eaasy

class MaximumSubarray53 {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int res = maxSubArray(nums);
        System.out.println(res);
    }
    public static int maxSubArray(int[] nums) {

        //Kadane’s Algorithm:
        int max = Integer.MIN_VALUE;
        int current = 0;

        for (int num : nums) {
            current += num;
            if (max < current) max = current;
            if (current < 0) current = 0;
        }

        return max;

        //time = O(n)
        //space = O(1)
    }
}