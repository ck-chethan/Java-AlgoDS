package com.chethan.easy;

public class CountingZeros {

    static int c = 0;
    static void method2(int n){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        if(rem == 0){
            c++;
        }
        method2(n/10);
    }

    public static void main(String[] args) {
        int n = 10000;
        int res = method1(n);
        System.out.println(res);
        method2(n);
        if(n==0){
            System.out.println(1);
        }
        else{
            System.out.println(c);
        }
        if(n==0){
            System.out.println(1);
        }
        else{
            int res3 = method3(n);
            System.out.println(res3);
        }
    }

    static int method1(int n){
        int count = 0;
        if(n==0){
            return 1;
        }
        while(n>0){
            int rem = n % 10;
            if(rem == 0){
                count++;
            }
            n = n/10;
        }
        return count;
    }

    static int method3(int n){
        int count = 0;
        return helper(n, count);
    }

    private static int helper(int n, int count) {
        if(n == 0){
            return count;
        }
        int rem = n % 10;
        if(rem == 0){
            count++;
        }
        return helper(n/10, count);
    }

}
