package com.chethan.leetCode.medium;

// https://leetcode.com/problems/reverse-integer/
// Leetcode - Medium - 7

class ReverseInteger {
    public static void main(String[] args) {
        int x = -1234;
        int res = reverse(x);
        System.out.println(res);
    }
    static int reverse(int x) {
        int rev = 0;
        while(x != 0){
            int pop = x % 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
            x = x/10;
        }

        return rev;
    }
}