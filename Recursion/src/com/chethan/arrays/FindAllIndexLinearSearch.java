package com.chethan.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class FindAllIndexLinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 1, 3, 18, 3, 9};
        int target = 3;
        search(arr, 0, target);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void search(int[] arr, int index, int target){

        if(index == arr.length){
            System.out.println(list);
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        search(arr, index + 1, target);
    }
}
