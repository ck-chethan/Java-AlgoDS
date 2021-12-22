package com.chethan.Ajay;

import java.util.Arrays;

public class TwoDArrayBF {
    public static void main(String[] args) {
        int [] [] nums = {{1,2,3},
                          {5,40,56},
                          {31,44,66}};
        System.out.println(Arrays.toString(SearchBF(nums, -4)));
        System.out.println(Arrays.toString(Search(nums, -4)));
    }
    // Search in 2D Array Matrix, Time complexity O(mxn)
    static int [] SearchBF(int[] [] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++){
                if (arr[i][j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }
    // Search in 2D Array Matrix, Time complexity O(m+n), Even works fine if Array sorted in row and col.
    static int[] Search(int[] [] arr, int target){
        int row = 0;
        int col = arr[0].length-1;
        while(row <= arr.length-1 && col >= 0){
            if (arr[row][col] == target){
                return new int[] {row, col};
            }
            else if (arr[row][col] < target){
                col--;
            }
            // arr[row][col] > target
            else{
                row++;
            }
        }
        return new int[] {-1, -1};
    }
}
