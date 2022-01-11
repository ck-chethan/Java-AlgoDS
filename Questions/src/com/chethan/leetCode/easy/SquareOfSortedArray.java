package com.chethan.leetCode.easy;

// https://leetcode.com/problems/squares-of-a-sorted-array/
// Leetcode - Easy - 977

import java.util.Arrays;

class SquareOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] res = sortedSquares2(nums);
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

    static int[] sortedSquares2(int[] nums) {
        int[] nums1 = new int[nums.length];
        int start = 0, end = nums.length-1, position;
        while(start<=end){
            position = end-start;
            if(Math.abs(nums[start]) > Math.abs(nums[end])){
                nums1[position]=nums[start]*nums[start];
                start++;
            }else{
                nums1[position]=nums[end]*nums[end];
                end--;
            }
        }
        return nums1;
    }
}
