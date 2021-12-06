package com.chethan;

import java.util.Arrays;

public class Main {
// Best and Worst Time Complexity = O(N^2);
// Good for small arrays
// Not a Stable Algorithm
// In-place Algorithm
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 1, 2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
        // At each parse biggest element of remaining array will go to respective index
            int last = arr.length - i - 1;
            int maxElementIndex = getMaxElementIndex(arr, 0, last);
            swap2elements(arr, maxElementIndex,last);
        }
    }

     static void swap2elements(int[] arr, int maxElementIndex, int last) {
        int temp = arr[maxElementIndex];
        arr[maxElementIndex] = arr[last];
        arr[last] = temp;
    }

     static int getMaxElementIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = 0; i <= end; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}
