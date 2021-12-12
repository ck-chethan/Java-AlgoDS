package com.chethan;
// 5 - 101
// 1*5^3 + 0*5^2 + 1*5^1
public class FindNthMagicNumber {
    public static void main(String[] args) {
        int n = 6;
        int ans = 0;
        int i=1;
        while (n>0){
            if((n&1)!=0){
                ans = (int) (ans + Math.pow(5,i));
            }
            n=n>>1;
            i++;
        }
        System.out.println(ans);
    }
}
