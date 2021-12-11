package com.chethan;

public class EvenOrOdd {

    public static void main(String[] args) {
        System.out.println(isOdd(11));
    }
    static boolean isOdd(int n){
        return (n&1)==1;
    }
}
