package com.chethan.leetCode.easy.BinarySearch;

// 704. Binary Search - Easy

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 9;
        int res = search(arr, target);
        System.out.println(res);
    }
    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length;
        while (l<=r){
            int m = l + (r-l)/2;
            if(nums[m] < target){
                l = m+1;
            }else if(nums[m] > target) {
                r = m - 1;
            }else{
                return m;
            }
        }
        return -1;
    }
}
