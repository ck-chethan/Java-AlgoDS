package com.chethan.leetCode.easy;

// https://leetcode.com/problems/squares-of-a-sorted-array/
// Leetcode - Easy - 977

import java.util.Arrays;

class SquareOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] res = sortedSquares(nums);
        System.out.println(Arrays.toString(res));
    }
    static int[] sortedSquares(int[] nums) {
        int N = nums.length;
        int posPointer = 0;

        while(posPointer < N && nums[posPointer] < 0){
            posPointer += 1;
        }

        int negPointer = posPointer - 1;
        int[] sortedSquaredArr = new int[N];
        int counter = 0;
        while(negPointer >= 0 && posPointer < N){
            if(nums[negPointer] * nums[negPointer] < nums[posPointer] * nums[posPointer]){
                sortedSquaredArr[counter] = nums[negPointer] * nums[negPointer];
                negPointer--;
            } else{
                sortedSquaredArr[counter] = nums[posPointer] * nums[posPointer];
                posPointer++;
            }
            counter++;
        }
        while(negPointer >= 0){
            sortedSquaredArr[counter] = nums[negPointer] * nums[negPointer];
            negPointer--;
            counter ++;
        }
        while(posPointer < N){
            sortedSquaredArr[counter] = nums[posPointer] * nums[posPointer];
            posPointer++;
            counter ++;
        }
        return sortedSquaredArr;
    }
}