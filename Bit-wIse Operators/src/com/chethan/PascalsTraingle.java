package com.chethan;

//Row0= 1
//Row1= 1 1
//Row2= 1 2 1
//Row3= 1 3 3 1
//Row4= 1 4 6 4 1
//Row5= 1 5 10 10 5 1

// Find the nth row Sum = 1*2^(n-1) == 1<<(n-1)
// Sum of each row = nc0 + nc1 + nc2 + nc3 + ..... + ncn = 2^n

public class PascalsTraingle {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(1<<(n-1));
    }
}
