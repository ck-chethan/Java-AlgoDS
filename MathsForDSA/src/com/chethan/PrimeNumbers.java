package com.chethan;

public class PrimeNumbers {

    public static void main(String[] args) {
        int n = 13;
        int counter = 0;
        for (int i = 2; i <= Math.floor(Math.sqrt(n)); i++) {
            if(n%i==0){counter++;}
        }
        if(counter==0) {
            System.out.printf("%d is a prime number", n);
        }
        else {
            System.out.printf("%d is not a prime number", n);
        }
    }
}
