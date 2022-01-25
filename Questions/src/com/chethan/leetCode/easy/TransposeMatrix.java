package com.chethan.leetCode.easy;

// https://leetcode.com/problems/transpose-matrix/
// 867. Transpose Matrix - Leetcode - Easy

import java.util.Arrays;

class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] res = transpose(matrix);
        for (int[] row: res) {
            System.out.println(Arrays.toString(row));
        }
    }
    static int[][] transpose(int[][] matrix) {
        int a=matrix.length;
        int b=matrix[0].length;

        int[][] trans= new int[b][a];

        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                trans[j][i]=matrix[i][j];
            }

        }

        return trans;
    }
}