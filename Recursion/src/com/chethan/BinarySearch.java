package com.chethan;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
        int ans = bs(arr, 05, 0, arr.length-1);
        System.out.println(ans);
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
        else if(n>mid){
            return bs(arr, n, mid+1, end);
        }
return -1;
    }
}
