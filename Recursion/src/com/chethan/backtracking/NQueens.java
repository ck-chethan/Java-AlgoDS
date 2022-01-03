package com.chethan.backtracking;

// Space Complexity = O(N^2)
// Time Complexity = T(N) = N*T(N-1) + O(N^2) = O(N^3 + N!) = O(N!)
public class NQueens {
    public static void main(String[] args) {
        int n = 5;
        boolean[][] board = new boolean[n][n];
        int res = queens(board, 0);
        System.out.println(res);
    }

    static int queens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        // Placing the queen and checking for every row and column.
        for (int col = 0; col < board[0].length; col++) {
            // Place the queen if it's safe
            if(isSafe(board, row, col)){
                board[row][col] = true;
                // Go to next row
                count += queens(board, row + 1);
                // Backtracking
                board[row][col] = false;
            }
        }

        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        // CHECK VERTICAL ROW
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }

        // CHECK HORIZONTAL COLUMN --> You can't place in the same row so covered in else case

        // CHECK DIAGONAL LEFT
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row - i][col - i]){
                return false;
            }
        }
        // CHECK DIAGONAL RIGHT
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row - i][col + i]){
                return false;
            }
        }
        return true;
    }

    static void display(boolean[][] board) {
        for(boolean[] row: board){
            for(boolean element: row){
                if(element){
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
