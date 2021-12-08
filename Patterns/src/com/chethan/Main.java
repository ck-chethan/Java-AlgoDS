package com.chethan;

public class Main {

    public static void main(String[] args) {
//        pattern1(4);
//        pattern2(4);
//        pattern3(4);
//        pattern4(4);
//        pattern5(5);
        pattern31(4);
    }

    static void pattern1(int n){
//        * * * *
//        * * * *
//        * * * *
//        * * * *
        System.out.println();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=n ; col++) {
                System.out.print("* ");
            }
                System.out.println();
        }
    }

    static void pattern2(int n){
//      *
//      * *
//      * * *
//      * * * *
        System.out.println();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
//      * * * *
//      * * *
//      * *
//      *
        System.out.println();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=(n-row+1) ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
//      1
//      1 2
//      1 2 3
//      1 2 3 4
        System.out.println();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
//      *
//      * *
//      * * *
//      * * * *
//      * * *
//      * *
//      *
        System.out.println();
        for (int row = 1; row <= 2*n; row++) {
            int totalNoCols = row > n ? 2*n - row : row;
            for (int col = 1; col <= totalNoCols; col++) {
                    System.out.print("* ");
                }
            System.out.println();
        }

//        int c = 0;
//        for (int row = 1; row <= 2*n; row++) {
//            if(c < n) {
//                for (int col = 1; col <= row; col++) {
//                    System.out.print("* ");
//                }
//            }
//            else{
//                for (int col = 1; col <=(2*n-row); col++) {
//                    System.out.print("* ");
//                }
//            }
//            c++;
//            System.out.println();
//        }

//        for (int row = 1; row <= n/2; row++) {
//            for (int col = 1; col <=row; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int row = n/2+1; row <= n; row++) {
//            for (int col = 1; col <=(n-row+1); col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }


    static void pattern28(int n){
//    *
//   * *
//  * * *
// * * * *
//* * * * *
// * * * *
//  * * *
//   * *
//    *
        System.out.println();
        for (int row = 1; row <= 2*n; row++) {
            int totalNoCols = row > n ? 2*n - row : row;
            //int totalNoSpaces = row > n ? n - totalNoCols : n - row;// row=totalNoCols when row < n
            for (int col = 1; col <= n - totalNoCols; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalNoCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
//          1
//        2 1 2
//      3 2 1 2 3
//    4 3 2 1 2 3 4
//  5 4 3 2 1 2 3 4 5
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row ; col++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1 ; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n){
//          1
//        2 1 2
//      3 2 1 2 3
//    4 3 2 1 2 3 4
//  5 4 3 2 1 2 3 4 5
//    4 3 2 1 2 3 4
//      3 2 1 2 3
//        2 1 2
//          1
        for (int row = 1; row <= 2*n; row++) {
            int c = row > n ? 2 * n - row : row;
                for (int col = 1; col <= n - c; col++) {
                    System.out.print("  ");
                }
                for (int col = c; col >= 1; col--) {
                    System.out.print(col + " ");
                }
                for (int col = 2; col <= c; col++) {
                    System.out.print(col + " ");
                }
                System.out.println();
        }
    }
    
    static void pattern31(int n){
//        4444444
//        4333334
//        4322234
//        4321234
//        4322234
//        4333334
//        4444444
        for (int row = 1; row <= 2*n - 1; row++) {
            for (int col = 1; col <= 2*n - 1; col++) {
                int atEveryIndex = n - Math.min(Math.min(row, col), Math.min(2*n - row, 2*n - col)) + 1;
                System.out.print(atEveryIndex);
            }
            System.out.println();
        }
    }
}
