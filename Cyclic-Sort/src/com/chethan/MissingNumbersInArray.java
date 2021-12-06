package com.chethan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Asked in Google

class MissingNumbersInArray {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> res = findDisappearedNumbers(arr);
        System.out.println(Arrays.toString(arr));
        System.out.print(res);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        sort(nums);
        List<Integer> missingNums = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i+1){
                missingNums.add(i+1);
            }
        }
        return missingNums;
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