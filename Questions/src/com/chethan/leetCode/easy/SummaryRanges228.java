package com.chethan.leetCode.easy;

import java.util.*;

// https://leetcode.com/problems/summary-ranges/
// 228. Summary Ranges - Leetcode - Easy

class SummaryRanges228 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        List<String> result = summaryRanges(nums);
        System.out.println(result);
    }
    public static List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int st = nums[i];
            while((i+1) < nums.length && nums[i]+1 == nums[i+1]){
                ++i;
            }
            if(st != nums[i]){
                res.add("" + st + "->" + nums[i]);
            }else{
                res.add("" + st);
            }
        }
        return res;
    }
}