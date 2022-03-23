package com.chethan.leetCode.easy;

// https://leetcode.com/problems/majority-element/
// 169. Majority Element - Leetcode - Easy

import java.util.HashMap;
import java.util.Map;

class MajorityElement169 {
    public static void main(String[] args) {
        int[] nums = {3,3,3,5,5};
        int result = majorityElement2(nums);
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

    public static int majorityElement2(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> it: map.entrySet()){
            if(it.getValue() > nums.length/2) return it.getKey();
        }
        return 0;
    }
}