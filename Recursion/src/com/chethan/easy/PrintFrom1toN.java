package com.chethan.easy;

public class PrintFrom1toN {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }

    static void print(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        print(n - 1);
        System.out.print(n + " ");
    }
}
