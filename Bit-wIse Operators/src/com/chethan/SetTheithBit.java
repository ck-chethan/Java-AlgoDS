package com.chethan;

public class SetTheithBit {
    public static void main(String[] args) {
        int n = 153;
        int i = 3;
        System.out.println(setithBit(n,i));
    }

    private static int setithBit(int n, int i) {
        // 1<<(i-1) ==> Creates a Mask Then or it with n => Then return the result
        return n|(1<<(i-1));
    }
}
