package com.chethan.leetCode.easy;

import java.util.Arrays;

// https://leetcode.com/problems/running-sum-of-1d-array/
// 1480. Running Sum of 1d Array - Leetcode - Eaasy

class RunningSumOf1dArray1480 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        runningSum(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}