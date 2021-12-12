package com.chethan;
// We can do Right shift till we get 0
// Formula:
// Number of digits in base b of a number n is int(logn/logb)+1
public class FindNumberOfDigitsinBaseB {
    public static void main(String[] args) {
        int n = 12345;
        int b = 2;
        System.out.printf("Binary digit of %d is: " + Integer.toBinaryString(n), n);
        System.out.println();
        System.out.printf("No of Digit in %d in base %d is: " + (int)((Math.log(n)/Math.log(b))+1) ,n ,b);
        System.out.println();

        //2nd Method
        int a = n;
        int counter = 0;
        while(n>0){
            n=n>>1;
            counter++;
        }
        System.out.printf("No of Digit in %d in base %d is: " + counter ,a ,b);
    }
}
