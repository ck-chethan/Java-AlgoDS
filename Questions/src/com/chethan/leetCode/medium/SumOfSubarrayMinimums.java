package com.chethan.leetCode.medium;

// 907. Sum of Subarray Minimums - Medium
public class SumOfSubarrayMinimums {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        int res = sumSubarrayMins(arr);
        System.out.println(res);
    }

    // Time Limit Exceeded
    public static int sumSubarrayMins(int[] arr) {
        int N = arr.length;
        int i=0, j=0;
        int ans = 0;
        int min;
        while(i<N && j<N){
            min = arr[i];
            while(j<N){
                min = Math.min(min, arr[j]);
                ans += min;
                ans = ans%1000000007;
                j += 1;
            }
            i+=1;
            j=i;
        }
        return ans;
    }

}
