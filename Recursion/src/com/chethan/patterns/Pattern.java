package com.chethan.patterns;

public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        pattern1(n);
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
}
