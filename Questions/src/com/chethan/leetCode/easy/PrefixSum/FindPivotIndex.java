package com.chethan.leetCode.easy.PrefixSum;

// 724. Find Pivot Index - Easy

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int res = pivotIndex(nums);
        System.out.println(res);
    }
    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        for(int x: nums){
            totalSum += x;
        }
        int ps = 0;
        for(int i=0; i<nums.length; i++){
            totalSum -= nums[i];
            if(ps == totalSum){
                return i;
            }
            ps += nums[i];
        }
        return -1;
    }
}
