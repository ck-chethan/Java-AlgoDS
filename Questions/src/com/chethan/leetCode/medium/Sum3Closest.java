package com.chethan.leetCode.medium;

// https://leetcode.com/problems/3sum-closest/
// Leetcode -Medium - 16

class Sum3Closest {
    public static void main(String[] args) {
        int[] nums = {-3,-2,-5,3,-4};
        int target = -1;
        int res = threeSumClosest(nums, target);
        System.out.println(res);
    }
    static int threeSumClosest(int[] nums, int target) {
        int closestSum = Integer.MAX_VALUE/2;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == target) {
                        return target;
                    }
                    if (Math.abs(nums[i] + nums[j] + nums[k] - target) < Math.abs(closestSum - target)) {
                        closestSum = nums[i] + nums[j] + nums[k];
                    }
                }
            }
        }
        return closestSum;
    }
}