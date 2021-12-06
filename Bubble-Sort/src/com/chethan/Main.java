package com.chethan;

import java.util.Arrays;

public class Main {
// Time Complexity = O(N^2)
// Space Complexity = O(1)
// In-place Algorithm
// Stable Algorithm
    public static void main(String[] args) {
        int[] arr = {4,5,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        //Run the steps N-1 times
        boolean isSwapped;
        for (int i=0;i<arr.length;i++){
            //For each parse max element will come at last index
            isSwapped = false;
            for(int j=1;j< arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    //swap
                    isSwapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            if(!isSwapped){
                //return;
                break;
            }
        }
    }
}
