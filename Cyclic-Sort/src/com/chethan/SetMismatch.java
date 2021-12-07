package com.chethan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        int[] res = findErrorNums(arr);
        System.out.print(Arrays.toString(res));
    }

    public static int[] findErrorNums(int[] nums) {
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i+1){
                return new int[] {nums[i], i+1};
            }
        }
        return new int[] {-1, -1};
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
