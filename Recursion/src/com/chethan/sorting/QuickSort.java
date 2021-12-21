package com.chethan.sorting;

// Recurrence relation on quick sort:
// T(N) = T(K) + T(N-K-1) + N ----> To send Pivot to correct position
//         |           |
//  To sort till Pivot |
//           To sort from Pivot to end

// Worst case-> If Pivot is either smallest or biggest number always --> K=0
// T(N) = T(0) + T(N-1) + O(N) == T(N-1) + O(N) = O(N^2)

// Best Case -> If Pivot is middle element
// T(N) = T(N/2) + T(N/2) + O(N) = O(N*logN)


// Hybrid Sort Algorithm (Tim sort):
// Merge + Insertion
//           |-> Works well with particularly sorted algorithm

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 8, 7, 2, 5, 0, 4, 9, 6};
        sort(arr, 0, arr.length-1);
        System.out.print(Arrays.toString(arr));
    }

    static void sort(int[] nums, int low, int hi) {
        if(low >= hi){
            return;
        }
        int s = low;
        int e = hi;
        int mid = s + (e - s)/2;
        int pivot = nums[mid];

        while(s <= e){
            //If array already sorted it won't swap
            while(nums[s] < pivot){s++;}
            while(nums[e] > pivot){e--;}
            if(s <= e){
                swap(nums, s, e);
                s++;
                e--;
            }
        }
        sort(nums, low, e);
        sort(nums, s, hi);
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
