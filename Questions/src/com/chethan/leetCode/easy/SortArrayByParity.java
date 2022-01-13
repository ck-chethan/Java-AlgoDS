package com.chethan.leetCode.easy;

import java.util.Arrays;

// https://leetcode.com/problems/sort-array-by-parity/
// Leetcode - Easy - 905

class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {1, 3};
        int[] res = sortArrayByParity2(nums);
        System.out.println(Arrays.toString(res));
    }

    static int[] sortArrayByParity2(int[] nums) {
        int[] newArr = new int[nums.length];
        int counter = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                newArr[counter++] = num;
            }
        }
        for (int num : nums) {
            if (num % 2 == 1) {
                newArr[counter++] = num;
            }
        }
        return newArr;
    }

    static int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i<j){
            while(nums[i] % 2 == 1 && i<j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
            i++;
        }
        return nums;
    }
}