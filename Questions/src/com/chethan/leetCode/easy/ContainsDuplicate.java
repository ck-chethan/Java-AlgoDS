package com.chethan.leetCode.easy;

// https://leetcode.com/problems/contains-duplicate/
// Leetcode - 217

import java.util.Arrays;
import java.util.HashSet;

class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        boolean res = method1(nums);
        boolean res2 = method2(nums);
        System.out.println(res);
        System.out.println(res2);
    }
    static boolean method1(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for(int num: nums){
            if(numbers.contains(num)) {
                return true;
            }
            numbers.add(num);
        }
        return false;
    }

    static boolean method2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]) return true;
        }
        return false;
    }
}