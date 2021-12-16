package com.chethan.easy;

// 1342 = 1+3+4+2 = 10
public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1342;
        int res = method1(n);
        System.out.print(res);
    }

    static int method1(int n){
        int sum = 0;
        while(n>0){
            int dig = n%10;
            sum = sum + dig;
            n/=10;
        }
        return sum;
    }
}
