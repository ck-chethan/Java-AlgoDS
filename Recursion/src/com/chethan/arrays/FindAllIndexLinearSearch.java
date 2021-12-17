package com.chethan.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class FindAllIndexLinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 1, 3, 18, 3, 9};
        int target = 3;
        search(arr, 0, target);
        System.out.println(list);
        ArrayList<Integer> elements = new ArrayList<>();
        System.out.println(findAllIndexes(arr, 0, target, elements));
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void search(int[] arr, int index, int target){

        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        search(arr, index + 1, target);
    }

     static ArrayList findAllIndexes(int[] arr, int index, int target, ArrayList<Integer> list){

        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndexes(arr, index + 1, target, list);
    }
}
