package com.chethan;

public class SetTheithBit {
    public static void main(String[] args) {
        int n = 153;
        int[] bit = {2, 3, 6, 7};
        int res = n;
        for (int i : bit) {
            res = setithBit(res, i);
        }
        System.out.println(res);
    }

    private static int setithBit(int n, int i) {
        // 1<<(i-1) ==> Creates a Mask Then or it with n => Then return the result
        return n|(1<<(i-1));
    }
}
