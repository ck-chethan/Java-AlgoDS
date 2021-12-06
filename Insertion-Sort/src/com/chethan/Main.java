package com.chethan;

import java.util.Arrays;

public class Main {
// For Every Index put that index element in the correct position from the LHS.
// Worst case Time Complexity = O(N^2)
// Best case Time Complexity = O(N)
// Adaptive --> Steps are getting reduced if array is sorted.(No of swaps has reduced compared to Bubble Sort).
// Stable Algorithm.
// In-Place Algorithm.
// Used for smaller sized array and works good when array is partially sorted. -> It takes part in Hybrid sorting algorithms

    public static void main(String[] args) {
        int[] arr = {4,5,2,3,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr){
        for (int i = 0; i <= arr.length-2; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    swap2elements(arr, j-1, j);
                }else {
                    break;
                }
            }
        }
    }
    static void swap2elements(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
