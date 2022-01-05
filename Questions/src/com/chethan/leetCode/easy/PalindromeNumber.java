package com.chethan.leetCode.easy;

// https://leetcode.com/problems/palindrome-number/
// Leetcode - Easy - 9

class PalindromeNumber {
    public static void main(String[] args) {
        int x = 12321;
        boolean res = isPalindrome(x);
        System.out.println(res);
    }
    static boolean isPalindrome(int x) {
        if(x == 0) return true;
        if(x < 0 || x % 10 == 0) return false;
        int revNum = 0;
        while(x > revNum){
            revNum = revNum * 10 + x % 10;
            x /= 10;
        }
        return x == revNum || x == revNum / 10;
    }
}