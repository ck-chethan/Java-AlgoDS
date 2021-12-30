package com.chethan.backtracking;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = {{true, true, true}, {true, true, true}, {true, true, true}};
        pathAll("", board, 0, 0);
    }

    static void pathAll(String p, boolean[][] maze, int r, int c){
        if(r == (maze.length - 1) && c == (maze[0].length - 1)){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r < maze.length - 1) {
            maze[r][c] = false;
            pathAll(p + 'D', maze, r + 1, c);
            maze[r][c] = true;
        }
        if(r > 0) {
            maze[r][c] = false;
            pathAll(p + 'U', maze, r - 1, c);
            maze[r][c] = true;
        }
        if(c > 0) {
            maze[r][c] = false;
            pathAll(p + 'L', maze, r, c - 1);
            maze[r][c] = true;
        }
        if(c < maze.length - 1) {
            maze[r][c] = false;
            pathAll(p + 'R', maze, r, c + 1);
            maze[r][c] = true;
        }
    }
}
