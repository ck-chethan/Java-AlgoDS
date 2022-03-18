package com.chethan.leetCode.medium;

//https://leetcode.com/problems/3sum/
//15. 3Sum - Leetcode - Medium

import java.util.*;

class SUM3 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum(nums);
        System.out.println(ans);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> ans=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[j]+nums[k];
                if(sum==(-nums[i])){
                    ans.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                }
                else if(sum>-nums[i]){
                    k--;
                }
                else if(sum<-nums[i]){
                    j++;
                }
            }
        }
        return new ArrayList<>(ans);
    }
}