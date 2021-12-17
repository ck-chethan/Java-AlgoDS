package com.chethan.arrays;

//  arr = {5, 6, 7, 8, 1, 2, 3};
//  If arr[s] <= arr[mid]
//      If key >= arr[s] and key <= arr[mid]
//          end = mid - 1
//     else
//          start = mid + 1
//  arr = {5, 6, 7, 1, 2, 3, 4};
//  else
//      If key >= arr[mid] and key <= arr[e]
//          start = mid + 1
//      else
//          end = mid - 1
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 1, 2, 3, 4};
        int target = 3;
        int res = search(arr, target, 0, arr.length - 1);
        System.out.println(res);
    }

    static int search(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[s] <= arr[mid]){
            if(target>=arr[s] && target<=arr[mid]) {
                return search(arr, target, s, mid - 1);
            }
            return search(arr, target, mid + 1, e);
        }
        if(target>=arr[mid] && target<=arr[e]) {
            return search(arr, target, mid + 1, e);
        }
        return search(arr, target, s, mid - 1);
    }
}
