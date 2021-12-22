package com.chethan.Ajay;

import java.util.Arrays;

public class BinaryTwoDArray {
    public static void main(String[] args) {
        int [] [] nums = {{1,2}, {7,8}};
        System.out.println(Arrays.toString(Search(nums, 7)));
    }
    static int [] Binary(int [] [] matrix, int row, int start, int end, int target){
        while(end>=start){
            int mid = start + (end-start)/2;
            if(target == matrix[row][mid]){
                return new int[] {row, mid};
            }
            else if(target < matrix[row][mid]){
                end = mid-1;
            }
            else if(target > matrix[row][mid]) {
                start = mid+1;
            }
        }
        return new int[] {-1, -1};
    }
    static int[] Search(int [] [] matrix, int target){
        int row = matrix.length;
        int col = matrix[0].length;
        if(row == 1){
           return Binary(matrix, 0 , 0, col-1, target);
        }
        int rStart = 0;
        int rend = row-1;
        int cMid = (col-1)/2;
        while (rend>rStart+1){
           int rMid = rStart+(rend-rStart)/2;
           if (matrix[rMid][cMid] == target){
               return new int[] {rMid, cMid};
           }
           else if (matrix[rMid][cMid]<target){
               rStart = rMid;
           }
           else if(matrix[rMid][cMid]>target){
               rend = rMid;
           }
        }
        // below code is commented, because this code is breaking at int [] [] nums = {{1,2}, {5,44}} and target as -55
//        if (matrix[rStart][cMid] == target){
//            return new int[] {rStart, cMid};
//        }
//        if (matrix[rStart+1][cMid] == target){
//            return new int[] {rStart+1, cMid};
//        }
//        if(target<=matrix[rStart][cMid-1]){
//            return Binary(matrix, rStart, 0, cMid-1, target);
//        }
//        if(target>=matrix[rStart][cMid+1] && target<=matrix[rStart][col-1]){
//            return Binary(matrix, rStart, cMid+1, col-1, target);
//        }
//        if(target<=matrix[rStart+1][cMid-1]){
//            return Binary(matrix, rStart+1, 0, cMid-1, target);
//        }
//        if(target>=matrix[rStart+1][cMid+1] && target<=matrix[rStart+1][col-1]){
//            return Binary(matrix, rStart+1, cMid+1, col-1, target);
//        }
        // Code ends here
        if(target>=matrix[rStart][0] && target<=matrix[rStart][col-1]){
            return Binary(matrix, rStart, 0, col-1, target);
        }
        return Binary(matrix, rStart+1, 0, col-1, target);
//        return new int[] {-1, -1};
    }
}
