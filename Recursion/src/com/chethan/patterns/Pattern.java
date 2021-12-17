package com.chethan.patterns;

public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        pattern1(n);
        System.out.println();
        pattern2(n, 0);
    }

    static void pattern1(int n){
        if(n == 0){
            return;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        pattern1(n-1);
    }

    static void pattern2(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            System.out.print("*" + " ");
            pattern2(r,c + 1);
        }else{
            System.out.println();
            pattern2(r-1, 0);
        }
    }
}
