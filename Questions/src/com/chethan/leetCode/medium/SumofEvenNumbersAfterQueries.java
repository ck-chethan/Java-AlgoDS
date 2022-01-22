package com.chethan.leetCode.medium;

import java.util.Arrays;

// https://leetcode.com/problems/sum-of-even-numbers-after-queries/
// 985. Sum of Even Numbers After Queries

class SumofEvenNumbersAfterQueries {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[][] queries = {{1,0},{-3,1},{-4,0},{2,3}};
        int[] res = sumEvenAfterQueries2(nums, queries);
        System.out.println(Arrays.toString(res));
    }
    static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] sumArr = new int[nums.length];
        int i = 0;
        while(i<sumArr.length) {
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

    static int[] sumEvenAfterQueries2(int[] A, int[][] queries) {
        int S = 0;
        for (int x: A)
            if (x % 2 == 0)
                S += x;

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; ++i) {
            int val = queries[i][0], index = queries[i][1];
            if (A[index] % 2 == 0) S -= A[index];
            A[index] += val;
            if (A[index] % 2 == 0) S += A[index];
            ans[i] = S;
        }

        return ans;
    }
}