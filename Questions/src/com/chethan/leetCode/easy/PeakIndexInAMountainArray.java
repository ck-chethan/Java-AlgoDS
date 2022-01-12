package com.chethan.leetCode.easy;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/
// Leetcode - Easy - 852

class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        int[] arr = {10,9,8,7};
        int res = peakIndexInMountainArray(arr);
        System.out.println(res);
    }
    static int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e){
            int m = s + (e-s)/2;
            if(arr[m] > arr[m + 1]){
                e = m;
            } else {
                s = m + 1;
            }
        }
        return s;
    }
}