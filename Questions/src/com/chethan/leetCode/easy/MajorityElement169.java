package com.chethan.leetCode.easy;

// https://leetcode.com/problems/majority-element/
// 169. Majority Element - Leetcode - Easy

class MajorityElement169 {
    public static void main(String[] args) {
        int[] nums = {3,3,3,5,5};
        int result = majorityElement(nums);
        System.out.println(result);
    }
    public static int majorityElement(int[] nums) {
        // Using JAVA iterative Moore's voting algorithm
        int majority = nums[0];
        int count = 1;
        
        for(int i = 1; i < nums.length; i++){
            if(majority == nums[i]){
                count++;
            }else{
                count--;
                if(count == 0){
                    majority = nums[i];
                    count  = 1;
                }
            }
        }
        return majority;
    }
}