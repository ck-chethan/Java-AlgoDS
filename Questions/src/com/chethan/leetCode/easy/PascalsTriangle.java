package com.chethan.leetCode.easy;
// https://leetcode.com/problems/pascals-triangle/
// Leetcode - Easy - 118
import java.util.ArrayList;
import java.util.List;

class PascalsTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> ans = generate(numRows);
        System.out.println(ans);
    }
    static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();
        if(numRows == 0){
            return triangle;
        }

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}