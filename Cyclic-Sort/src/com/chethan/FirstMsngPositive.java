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
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }

    static void sort(int[] arr){
        int i = 0;
        while(i< arr.length){
            int correct = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap2elements(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }

    static void swap2elements(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
