package com.chethan.arrays;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 5, 6, 7, 8, 9};
        boolean res = isSortedLinear(arr);
        boolean res1 = isSortedRecursion(arr);
        System.out.println(res);
        System.out.println(res1);
    }

    private static boolean isSortedLinear(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if(!(arr[i-1] <= arr[i])){
                return false;
            }
        }
        return true;
    }

     static boolean isSortedRecursion(int[] arr) {
        return helper(arr, 1);
    }

    static boolean helper(int[] arr, int index){
        if(index == arr.length){
            return true;
        }
        if(arr[index-1] > arr[index]) {
            return false;
        }
        if(arr[index-1] < arr[index]){
            return helper(arr, index+1);
        }
        return true;
    }
}
