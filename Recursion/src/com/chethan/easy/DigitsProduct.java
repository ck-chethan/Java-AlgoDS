package com.chethan.easy;

public class DigitsProduct {
    public static void main(String[] args) {
        int n = 1342;
        int res = method2(n);
        System.out.print(res);
    }

    static int method1(int n){
        if(n==0){
            return 0;
        }
        int sum = 1;
        while(n>0){
            int dig = n%10;
            sum = sum * dig;
            n/=10;
        }
        return sum;
    }

    static int method2(int n){
        if(n%10 == n){
            return n;
        }
        return ((n % 10) * method2(n / 10));
    }
}
