package com.chethan.leetCode.medium;

import java.util.Arrays;
// https://leetcode.com/problems/spiral-matrix/
// Leetcode - Medium - 59

class SpiralMatrixII {
    public static void main(String[] args) {
        int n = 4;
        int[][] res = generateMatrix2(n);
        for(int[] re: res) {
            System.out.println(Arrays.toString(re));
        }
    }
    static int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        if(n==0) return res;
        int rowBegin = 0;
        int rowEnd = n - 1;
        int colBegin = 0;
        int colEnd = n - 1;
        int count = 0;
        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            for (int i = colBegin; i <= colEnd; i++) {
                res[rowBegin][i] = ++count;
            }
            rowBegin++;

            for (int i = rowBegin; i <= rowEnd; i++) {
                res[i][colEnd] = ++count;
            }
            colEnd--;

            if(rowBegin<=rowEnd){
                for (int i = colEnd; i >= colBegin; i--) {
                    res[rowEnd][i] = ++count;
                }
            }
            rowEnd--;

            if(colBegin<=colEnd){
                for (int i = rowEnd; i >= rowBegin; i--) {
                    res[i][colBegin] = ++count;
                }
            }
            colBegin++;
        }
        return res;
    }

    static int[][] generateMatrix2(int n) {
        int[][] soln = new int[n][n];
        int left = 0, right = n-1, top = 0, bottom = n-1;
        int count = 1;
        while (count <= n*n) {
            for (int j=left; j<=right; j++) {
                soln[top][j] = count++;
            }
            top++;
            for (int i=top; i<=bottom; i++) {
                soln[i][right] = count++;
            }
            right--;
            for (int j=right; j>=left; j--) {
                soln[bottom][j] = count++;
            }
            bottom--;
            for (int i=bottom; i>=top; i--) {
                soln[i][left] = count++;
            }
            left++;
        }
        return soln;
    }
}