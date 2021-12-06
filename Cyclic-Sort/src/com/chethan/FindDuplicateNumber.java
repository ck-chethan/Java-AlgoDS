package com.chethan;

import java.util.Arrays;
import java.util.List;

class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int res = findDuplicate(arr);
        System.out.print(res);
    }

    public static int findDuplicate(int[] nums) {
        sort(nums);
        return nums[nums.length-1];
    }

    static void sort(int[] arr){
        int i = 0;
        while(i< arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]) {
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