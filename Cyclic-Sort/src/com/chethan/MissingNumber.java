package com.chethan;

import java.util.Arrays;

// https://leetcode.com/problems/missing-number/
// Amazon Question
class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        int res = missingNumber(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(res);
    }
    public static int missingNumber(int[] arr){
        int i = 0;
        while(i< arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]) {
                swap2elements(arr, i, correct);
            }
            else{
                i++;
            }
        }
        // search for missing number
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j) {
                return j;
            }
        }
        return arr.length;
    }

    static void swap2elements(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
