package com.chethan.easy;

public class CountingZeros {
    public static void main(String[] args) {
        int n = 300220;
        int res = method1(n);
        System.out.print(res);
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
}
