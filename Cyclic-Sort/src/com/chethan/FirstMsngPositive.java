package com.chethan;

import java.util.Arrays;

//https://leetcode.com/problems/first-missing-positive/
class FirstMsngPositive {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        int res = firstMissingPositive(arr);
        System.out.print(res);
    }

    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i< nums.length){
            int correct = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap2elements(nums, i, correct);
            }
            else{
                i++;
            }
        }
        // search for missing number
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j + 1) {
                return j+1;
            }
        }
        return nums.length + 1;
    }

    static void swap2elements(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
