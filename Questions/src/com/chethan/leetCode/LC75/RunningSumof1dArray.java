package com.chethan.leetCode.LC75;

import java.util.Arrays;

// 1480. Running Sum of 1d Array - Easy
public class RunningSumof1dArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] res = runningSum(nums);
        System.out.println(Arrays.toString(res));
    }
    public static int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
