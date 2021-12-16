package com.chethan.easy;

public class ReverseNumber {

    static int sum = 0;
    static void method3(int n){
        if(n == 0){
            return;
        }
        sum = sum * 10 + (n % 10);
        method3(n/10);
    }

    public static void main(String[] args) {
        int n = 1342;
        int res = method2(n);
        System.out.println(res);
        method3(n);
        System.out.print(sum);
    }

    static int method1(int n){
        int ans = 0;
        while (n > 0) {
           int digit = n % 10;
           ans = ans * 10 + digit;
           n = n / 10;
        }
        return ans;
    }

    static int method2(int n){
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
