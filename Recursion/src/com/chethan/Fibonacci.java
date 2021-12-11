package com.chethan;

public class Fibonacci {
    public static void main(String[] args) {
        int ans = fiboFormula(50);
        for (int i = 0; i < 12; i++) {
            System.out.println(fiboFormula(i));
        }
        System.out.println(ans);
    }

    static int fiboFormula(int n){
        //return (int)((Math.pow(((1+Math.sqrt(5))/2), n) - Math.pow(((1-Math.sqrt(5))/2), n))/Math.sqrt(5));
        return (int)(Math.pow(((1+Math.sqrt(5))/2), n)/Math.sqrt(5));
    }

    static int fibo(int n) {
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
