package com.chethan;
// If n = 9 ( 1001)
// Ans = 2

public class FindNumberOfSetBits {
    public static void main(String[] args) {
        int n = 9;
        int counter = 0;
        while(n>0){
            if((n&1)==1){
                counter++;
            }
            n = n>>1;
        }
        System.out.println(counter);
    }
}
