package com.chethan;

public class PrimeNumbers {

    public static void main(String[] args) {
        int n = 13;
        boolean ans = isPrime(n);
        if(ans) {
            System.out.printf("%d is a prime number", n);
        }
        else {
            System.out.printf("%d is not a prime number", n);
        }
    }
    static boolean isPrime(int n){
        if(n <= 1) {
            return false;
        }
        int c = 2;
        while(c * c <= n){
            if(n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
