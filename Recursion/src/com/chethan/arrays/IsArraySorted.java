package com.chethan.arrays;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 5, 7, 9};
        boolean res = isSortedLinear(arr);
        System.out.println(res);
    }

    private static boolean isSortedLinear(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if(!(arr[i-1] <= arr[i])){
                return false;
            }
        }
        return true;
    }
}
