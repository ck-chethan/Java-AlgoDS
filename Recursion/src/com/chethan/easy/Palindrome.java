package com.chethan.easy;

public class Palindrome {
    public static void main(String[] args) {
        int n = 123421;
        boolean res = pali(n);
        System.out.print(res);
    }

    static boolean pali(int n){
        return n == rev(n);
    }

    static int rev(int n){
        // Sometimes we might need some additional variables in the arguments in that case make a function.
        int digits = (int) (Math.log10(n)+1);
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if(n % 10 == n){
            return n;
        }
        int rem = n % 10;
        return (int) (rem*Math.pow(10, digits-1) + helper(n/10, digits - 1));
    }
}
