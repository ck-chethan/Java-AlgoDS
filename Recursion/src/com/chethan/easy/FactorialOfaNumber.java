package com.chethan.easy;

public class FactorialOfaNumber {
    public static void main(String[] args) {
        int n = 5;
        int res = fact(n);
        System.out.print(res);
    }

    static int fact(int n){
        if(n<=1){
            return 1;
        }
        else return n * fact(n - 1);
    }
}
