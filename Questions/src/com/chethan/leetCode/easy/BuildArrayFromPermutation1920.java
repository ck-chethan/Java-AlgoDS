package com.chethan.leetCode.easy;

// https://leetcode.com/problems/build-array-from-permutation/
// 1920. Build Array from Permutation - Leetcode - Easy

import java.util.Arrays;

class BuildArrayFromPermutation1920 {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] res = buildArray(nums);
        System.out.println(Arrays.toString(res));
    }
    public static int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            res[i] = nums[nums[i]];
        }
        return res;
    }
}