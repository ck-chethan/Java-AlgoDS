package com.chethan;
// a^b
// Time complexity - O(b) times using normal procedure
// 3^6 = 3^2*3^4
// ans = 1
// base = 3
// n&1
// n = n>>1
// ans = ans*base

//Time complexity = O(logb) times we're running
public class ApowerB {
    public static void main(String[] args) {
        int ans = 1;
        int base = 3; //a
        int pow = 6;
        while(pow>0){
            if((pow&1) == 1){
                ans = ans*base;
            }
            base *= base;
            pow = pow >> 1;
        }
        System.out.println(ans);
    }
}
