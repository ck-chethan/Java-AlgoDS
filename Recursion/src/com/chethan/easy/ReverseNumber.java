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
        //System.out.println(res);
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
        if(n % 10 == n){
            return n;
        }
        return (10*(n % 10) + method2(n / 10));
    }


}
