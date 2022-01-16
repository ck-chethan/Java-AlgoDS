package com.chethan.leetCode.easy;

// https://leetcode.com/problems/array-partition-i/
// Leetcode - Easy - 561

import java.util.Arrays;

class ArrayPartitionI {
    public static void main(String[] args) {
        int[] nums = {6,2,6,5,1,2};
        int res = arrayPairSum(nums);
        System.out.println(res);
    }
    // When array is sorted maximum sum will come when we add nums in even positions.
    static int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i+=2) {
            sum += nums[i];
        }
        return sum;
    }
}