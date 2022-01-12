package com.chethan.leetCode.medium;

// https://leetcode.com/problems/3sum-closest/
// Leetcode -Medium - 16

import java.util.Arrays;

class Sum3Closest {
    public static void main(String[] args) {
        int[] nums = {-3,-2,-5,3,-4};
        int target = -1;
        int res = threeSumClosest2(nums, target);
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

    static int threeSumClosest2(int[] nums, int target) {
        int closestSum = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int a_pointer = i + 1;
            int b_pointer = nums.length - 1;
            while (a_pointer < b_pointer){
                int current_sum = nums[i] + nums[a_pointer] + nums[b_pointer];
                if(current_sum > target){
                    b_pointer -= 1;
                } else {
                    a_pointer += 1;
                }
                if(Math.abs(current_sum - target) < Math.abs(closestSum - target)){
                    closestSum = current_sum;
                }
            }
        }
        return closestSum;
    }
}