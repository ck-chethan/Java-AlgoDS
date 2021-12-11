package com.chethan;

class PowerOfNumber {
    public static void main(String[] args) {
        boolean ans = isPowerOfFour(64);
        System.out.print(ans);
    }
    static boolean isPowerOfTwo(int n) {
        if(n == 1){return true;}
        if(n <= 0 || (n&1) !=0){return false;}
        n=n/2;
        return isPowerOfTwo(n);
    }

    static boolean isPowerOfThree(int n) {
        if(n == 1){return true;}
        if(n <= 0 || (n%3)!=0){return false;}
        n=n/3;
        return isPowerOfThree(n);
    }

    static boolean isPowerOfFour(int n) {
        if(n == 1){return true;}
        if(n <= 0 || (n%4)!=0){return false;}
        n=n/4;
        return isPowerOfFour(n);
    }
}