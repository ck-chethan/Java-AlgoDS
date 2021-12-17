package com.chethan.patterns;

import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 3, 1, 8, 0, 2};
        sortAsc(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
        int[] arr1 = {4, 5, 6, 7, 3, 1, 8, 0, 2};
        sortDsc(arr1, arr1.length-1, 0);
        System.out.println(Arrays.toString(arr1));
    }

    static void sortAsc(int[] arr, int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[r]<arr[c]) {
                swap(arr, r, c);
            }
            sortAsc(arr, r,c + 1);
        }else{
            if(arr[r]<arr[c]) {
                swap(arr, r, c);
            }
            sortAsc(arr, r-1, 0);
        }
    }

    static void sortDsc(int[] arr, int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[r]>arr[c]) {
                swap(arr, r, c);
            }
            sortDsc(arr, r,c + 1);
        }else{
            if(arr[r]>arr[c]) {
                swap(arr, r, c);
            }
            sortDsc(arr, r-1, 0);
        }
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
