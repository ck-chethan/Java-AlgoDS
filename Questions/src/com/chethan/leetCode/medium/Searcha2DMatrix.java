package com.chethan.leetCode.medium;

// https://leetcode.com/problems/search-a-2d-matrix/
// 74. Search a 2D Matrix - Leetcode - Medium

class Searcha2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean res=true;
        for(int i=0; i<matrix.length; i++){
            if(matrix[i][matrix[i].length-1] == target){
                return true;
            }
            else if(matrix[i][matrix[i].length-1]>target){
                for(int j=0; j<matrix[i].length-1; j++){
                    if(matrix[i][j] == target){
                        return true;
                    }
                }
                return false;
            }
            else{
                res=false;
            }
        }
        return res;
    }
}