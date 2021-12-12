package com.chethan;
// 5 - 101
// 1*5^3 + 0*5^2 + 1*5^1
public class FindNthMagicNumber {
    public static void main(String[] args) {
        int n = 6;
        int ans = 0;
        int base=5;
        while (n>0){
            int last = n & 1;
            ans += last*base;
            base = base * 5;
            n=n>>1;
        }
        System.out.println(ans);
    }
}
