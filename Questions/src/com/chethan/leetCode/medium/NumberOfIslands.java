package com.chethan.leetCode.medium;

// LC-200 -> https://leetcode.com/problems/number-of-islands/
class NumberOfIslands {
    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        System.out.println(numIslands(grid));
    }
    static int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1'){
                    count += 1;
                    callBSF(grid, i, j);
                }
            }
        }
        return count;
    }

    static void callBSF(char[][] grid, int i, int j) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        callBSF(grid, i-1, j); //Check up
        callBSF(grid, i+1, j); //Check Down
        callBSF(grid, i, j-1); //Check left
        callBSF(grid, i, j+1); //Check right
    }
}