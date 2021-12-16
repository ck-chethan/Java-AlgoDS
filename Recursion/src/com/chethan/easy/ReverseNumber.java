package com.chethan.easy;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 0;
        int res = method1(n);
        System.out.print(res);
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
}
