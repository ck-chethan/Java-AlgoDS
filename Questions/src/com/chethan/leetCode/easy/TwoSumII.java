package com.chethan.leetCode.easy;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
// Leetcode - Easy - 167
import java.util.Arrays;

class TwoSumII {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] res = twoSum(numbers, target);
        System.out.println(Arrays.toString(res));
    }
    static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while(i<j){
            int sum = numbers[i] + numbers[j];
            if(sum > target) {
                j -= 1;
            }
            else if(sum < target){
                i += 1;
            }
            else {
                return new int[] {
                    i + 1, j + 1
                } ;
            }
        }
        return new int[] { i+1, j+1};
    }
}