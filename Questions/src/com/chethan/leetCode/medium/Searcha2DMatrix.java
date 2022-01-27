package com.chethan.leetCode.medium;

// https://leetcode.com/problems/search-a-2d-matrix/
// 74. Search a 2D Matrix - Leetcode - Medium

class Searcha2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        boolean res = searchMatrix2(matrix, target);
        System.out.println(res);
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        boolean res=true;
        for (int[] ints : matrix) {
            if (ints[ints.length - 1] == target) {
                return true;
            } else if (ints[ints.length - 1] > target) {
                for (int j = 0; j < ints.length - 1; j++) {
                    if (ints[j] == target) {
                        return true;
                    }
                }
                return false;
            } else {
                res = false;
            }
        }
        return res;
    }

    static boolean searchMatrix2(int[][] matrix, int target) {

        for(int[] rows : matrix){
            if(rows[rows.length -1] >= target){
                for(int col :rows){
                    if(col ==target) return true;
                }
                return false;
            }
        }
        return false;
    }
}