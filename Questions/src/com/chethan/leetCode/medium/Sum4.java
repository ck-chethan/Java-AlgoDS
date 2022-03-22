package com.chethan.leetCode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

// https://leetcode.com/problems/4sum/
//18. 4Sum - Leetcode - Medium

class Sum4 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 2};
        int target = 8;
        List<List<Integer>> result  = fourSum(nums, target);
        System.out.println(result);
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> res = new HashSet<>();

        Arrays.sort(nums);
        
        for(int i=0; i<nums.length - 3; i++){
                for(int j=i+1; j < nums.length - 2; j++){
                    int k = j+1;
                    int l = nums.length - 1;
                    while(k<l){
                        if(nums[i] + nums[j] + nums[k] + nums[l] == target){
                            res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++; l--;
                        }
                        else if(nums[i] + nums[j] + nums[k] + nums[l] > target){
                            l--;
                        }
                        else{
                            k++;
                        }
                    }
                }
            }
        return new ArrayList<>(res);
        }
    }