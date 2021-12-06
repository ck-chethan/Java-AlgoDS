package com.chethan;

import java.util.Arrays;

public class Main {
// When the range of 1-N is given => Cyclic sort can be used
// The Worst case time complexity => (2N-1) = O(N)
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 1, 2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        int i = 0;
        while(i< arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]) {
                swap2elements(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }

    static void swap2elements(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
