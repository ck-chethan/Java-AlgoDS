package com.chethan.backtracking;

// For each row we'll have 9 Possibilities
// Each Row has 9*9 => 81 => N^2 Possibilities
// Overall 9 columns are present, so => 9^N^2
// Time complexity = O(9^(N^2))
class SudokuSolverLC37 {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {5,3,0,0,7,0,0,0,0},
                {6,0,0,1,9,5,0,0,0},
                {0,9,8,0,0,0,0,6,0},
                {8,0,0,0,6,0,0,0,3},
                {4,0,0,8,0,3,0,0,1},
                {7,0,0,0,2,0,0,0,6},
                {0,6,0,0,0,0,2,8,0},
                {0,0,0,4,1,9,0,0,5},
                {0,0,0,0,8,0,0,7,9}
        };
        if(solve(board)){
            display(board);
        } else {
            System.out.println("Can't solve");
        }
    }
    public void solveSudoku(char[][] board) {
        
    }

    static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            // IF we found any empty row then break the loop
            if(emptyLeft == false){
                break;
            }
        }
        if(emptyLeft == true){
            //Sudoku is solved
            return true;
        }

        //Backtrack
        for (int number = 1; number <= 9; number++) {
            if(isSafe(board, row, col, number)){
                board[row][col] = number;
                if(solve(board)){
                    //Found the answer
                    return true;
                } else{
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    static boolean isSafe(int[][] board, int row, int col, int num){
        //ROW CHECK
        for (int i = 0; i < board.length; i++) {
            if(board[row][i] == num){
                return false;
            }
        }
        //COLUMN CHECK
        for (int j = 0; j < board.length; j++) {
            if(board[j][col] == num){
                return false;
            }
        }

        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - (row % sqrt);
        int colStart = col - (col % sqrt);

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt ; c++) {
                if(board[r][c] == num){
                    return false;
                }
            }
        }
        return true;
    }

    static void display(int[][] board){
        for (int[] row: board) {
            for (int num: row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}