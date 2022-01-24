package com.chethan.leetCode.easy;

// https://leetcode.com/problems/sort-array-by-parity-ii/
// 922. Sort Array By Parity II - Easy

import java.util.Arrays;

class SortArrayByParityII {
    public static void main(String[] args) {
        int[] nums = {4,2,5,7};
        int[] res = sortArrayByParityII(nums);
        System.out.println(Arrays.toString(res));
    }
    static int[] sortArrayByParityII(int[] nums) {
        int j=1;
        for(int i=0;i<nums.length;i+=2)
        {
            if(nums[i]%2!=0)
            {
                while(nums[j]%2!=0)
                    j+=2;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        return nums;
    }
}