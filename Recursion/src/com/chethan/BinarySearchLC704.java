package com.chethan;

public class BinarySearchLC704 {public static void main(String[] args) {
    int[] arr = {-1,0,3,5,9,12};
    int target = 0;
    System.out.print(search(arr, target));
}
    static int search(int[] nums, int target) {
        return bs(nums, target, 0, nums.length-1);
    }
    static int bs(int[] arr, int n, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == n){
            return mid;
        }
        if(n<arr[mid]){
            return bs(arr, n, start, mid-1);
        }
        return bs(arr, n, mid+1, end);
    }
}