package com.chethan;
// If n = 9 ( 1001)
// Ans = 2

public class FindNumberOfSetBits {
    public static void main(String[] args) {
        int n = 45;
        method1(n);
        method2(n);
        method3(n);
    }

    static void method1(int n){
        int counter = 0;
        while(n>0){
            if((n&1)==1){
                counter++;
            }
            n = n>>1;
        }
        System.out.println(counter);
    }

    // Ex = 100101
    // n&-n will give us Right most Set Bit.(1)
    // n - [n&-n] -> will give 2nd set bit which is from Left hand side.

    static void method2(int n){
        int count = 0;
        while(n>0){
            count++;
            n -= (n&-n);
        }
        System.out.println(count);
    }

    static void method3(int n){
        int count = 0;
        while(n>0){
            count++;
            n = (n&(n-1));
        }
        System.out.println(count);
    }
}
