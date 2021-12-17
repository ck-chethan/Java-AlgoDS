package com.chethan.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class FindAllIndexLinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 1, 3, 18, 3, 9, 3};
        int target = 3;
        search(arr, 0, target);
        System.out.println(list);
        System.out.println(findAllIndexes(arr, 0, target, new ArrayList<>()));
        ArrayList<Integer> elements = findAllIndexes2(arr, 0 ,3);
        System.out.println(elements);
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

     static ArrayList<Integer> findAllIndexes(int[] arr, int index, int target, ArrayList<Integer> list){

        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndexes(arr, index + 1, target, list);
    }

    static ArrayList<Integer> findAllIndexes2(int[] arr, int index, int target){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }
        //This will contain answer for this function call only
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls =  findAllIndexes2(arr, index + 1, target);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
