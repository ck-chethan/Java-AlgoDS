package com.chethan;
// Note:
// a^1 = a'
// a^0 = a
// a^a = 0
public class NumberAppearingOnce {
    public static void main(String[] args) {
        //int[] arr = {-2, 3, -2, 4, -5, -5, 4};
        int[] arr = {2,3,2,4,5,4,3,6,7,7,6};
        int res = 0;
        for (int i : arr) {
            res = res^i;
        }
        System.out.println(res);
    }
}
