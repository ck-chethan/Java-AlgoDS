package com.chethan.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintMatrixAndAllPaths {
    public static void main(String[] args) {
        boolean[][] board = {{true, true, true}, {true, true, true}, {true, true, true}};
        int[][] path = new int[board.length][board[0].length];
        pathAll("", board, 0, 0, path, 1);
    }

    static void pathAll(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        path[r][c] = step; // Last step is also a step
        if(r == (maze.length - 1) && c == (maze[0].length - 1)){
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;

        if(r < maze.length - 1) {
            pathAll(p + 'D', maze, r + 1, c, path, step + 1);
        }
        if(r > 0) {
            pathAll(p + 'U', maze, r - 1, c, path, step + 1);
        }
        if(c > 0) {
            pathAll(p + 'L', maze, r, c - 1, path, step + 1);
        }
        if(c < maze.length - 1) {
            pathAll(p + 'R', maze, r, c + 1, path, step + 1);
        }
        path[r][c] = 0;
        maze[r][c] = true;
    }
}
