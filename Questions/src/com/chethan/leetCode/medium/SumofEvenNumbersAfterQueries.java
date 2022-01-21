package com.chethan.leetCode.medium;

import java.util.Arrays;

// https://leetcode.com/problems/sum-of-even-numbers-after-queries/
// 985. Sum of Even Numbers After Queries

class SumofEvenNumbersAfterQueries {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[][] queries = {{1,0},{-3,1},{-4,0},{2,3}};
        int[] res = sumEvenAfterQueries(nums, queries);
        System.out.println(Arrays.toString(res));
    }
    static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] sumArr = new int[nums.length];
        int i = 0;
        while(i<queries.length) {
            int index = queries[i][1];
            nums[index] += queries[i][0];
            int sumRes = evenSum(nums);
            sumArr[i] = sumRes;
            i++;
        }
        return sumArr;
    }
    static int evenSum(int[] arr){
        int sum = 0;
        for (int num: arr) {
            if(num%2 == 0){
                sum += num;
            }
        }
        return sum;
    }
}