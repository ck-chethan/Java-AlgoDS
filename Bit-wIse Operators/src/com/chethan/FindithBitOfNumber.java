package com.chethan;

public class FindithBitOfNumber {
    public static void main(String[] args) {
        int n = 153;
        int i = 8;
        System.out.println(res(n,i));
    }

    private static int res(int n, int i) {
        // 1<<(i-1) ==> Creates a Mask Then and it with n => if it is != 0 Then it's 1
        return (n&(1<<(i-1)))==0?0:1;
    }
}
