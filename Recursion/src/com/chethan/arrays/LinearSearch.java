package com.chethan.arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 18, 9};
        int target = 9;
        int res = search(arr, 0, target);
        System.out.println(res);
    }

    static int search(int[] arr, int index, int target){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return search(arr, index + 1, target);
    }
}
