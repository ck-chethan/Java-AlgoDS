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
        int i = 0;
        while(i< nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap2elements(nums, i, correct);
                } else {
                    return nums[i];
                }
            } else{
                i++;
            }
        }
        return -1;
    }


    static void swap2elements(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}