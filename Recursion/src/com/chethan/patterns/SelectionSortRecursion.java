package com.chethan.patterns;

import java.util.Arrays;

public class SelectionSortRecursion {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 3, 1, 8, 0, 2};
        sortAsc(arr, arr.length-1, 0, 0);
        System.out.println(Arrays.toString(arr));
        int[] arr1 = {4, 5, 6, 7, 3, 1, 8, 0, 2};
        sortDsc(arr1, arr1.length-1, 0, 0);
        System.out.println(Arrays.toString(arr1));
    }

    static void sortAsc(int[] arr, int r, int c, int max){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[max] < arr[c]) {
                max = c;
            }
            sortAsc(arr, r, c + 1, max);
        }else{
            swap(arr, max, r);
            sortAsc(arr, r-1, 0, max);
        }
    }

    static void sortDsc(int[] arr, int r, int c, int min){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[min] > arr[c]) {
                min = c;
            }
            sortDsc(arr, r, c + 1, min);
        }else{
            swap(arr, min,r);
            sortDsc(arr, r-1, 0, min);
        }
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
