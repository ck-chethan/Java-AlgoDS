package com.chethan.sorting;

import java.util.Arrays;

public class MergeSortInplace {
    public static void main(String[] args) {
        int[] arr = {3, 1, 8, 7, 2, 5, 0, 4, 9, 6};
        sort(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int s, int e){
        if(e - s == 1){
            return ;
        }
        int mid = s + (e-s)/2;
        sort(arr, s, mid);
        sort(arr, mid, e);

        merge(arr, s, mid, e);
    }

    static void merge(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;
        while(i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}
