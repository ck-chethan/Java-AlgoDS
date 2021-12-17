package com.chethan.arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 18, 9};
        int target = 3;
        int res = search(arr, 0, target);
        boolean res1 = find(arr, 0, target);
        System.out.println(res1);
        System.out.println(res);
    }

    static boolean find(int[] arr, int index, int target){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, index + 1, target);
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
