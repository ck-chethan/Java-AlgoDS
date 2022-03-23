package com.chethan.leetCode.easy;

import java.util.Arrays;

// https://leetcode.com/problems/concatenation-of-array/
// 1929. Concatenation of Array - Leetcode - Easy

class ConcatenationOfArray1929 {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] res = getConcatenation(nums);
        System.out.println(Arrays.toString(res));
    }
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] res = new int[n*2];
        for(int i=0; i<n; i++){
            res[i] = nums[i];
            res[i+n] = nums[i];
        }
        return res;
    }
}