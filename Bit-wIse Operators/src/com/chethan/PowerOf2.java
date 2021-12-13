package com.chethan;
// We can do right shift till number is 0 and run a counter if counter=1 then it's Power of 2
// Or If n&(n-1) == 0 Then it's a power of 2
public class PowerOf2 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(method1(n));
        System.out.println(method2(n));
    }
    //Method 1
    static boolean method1(int n){
        return n>0 && (n&(n-1)) == 0;
    }

    //Method 2
    static boolean method2(int n){
        int counter = 0;
        while(n>0){
            if((n&1)!=0){
                counter++;
            }
            n=n>>1;
        }
        return counter==1;
    }
}
