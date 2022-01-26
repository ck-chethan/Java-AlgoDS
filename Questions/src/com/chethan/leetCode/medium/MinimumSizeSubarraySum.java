package com.chethan.leetCode.medium;

// https://leetcode.com/problems/minimum-size-subarray-sum/
// 209. Minimum Size Subarray Sum - Leetcode - Medium

import java.util.Arrays;

class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int res = minSubArrayLen(target, nums);
        System.out.println(res);
    }
    static int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int i = 0;
        int sum = 0;
        for(int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while(sum >= target) {
                ans = Math.min(ans, j - i + 1);
                sum -= nums[i];
                i++;
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}