package com.chethan.leetCode.easy;

// https://leetcode.com/problems/valid-palindrome-ii/
// 680. Valid Palindrome II - Leetcode - Easy

class ValidPalindromeII {
    public static void main(String[] args) {
        String s = "aba";
        boolean res = validPalindrome2(s);
        System.out.println(res);
    }
    static boolean validPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1, false);
    }

    static boolean isPalindrome(final String s, int leftIndex, int rightIndex, final boolean isCharacterDeleted){

        while(leftIndex < rightIndex){

            if(s.charAt(leftIndex) != s.charAt(rightIndex)){

                if(isCharacterDeleted){
                    return false;
                }

                // isPalindrome(s, leftIndex + 1, rightIndex, true) for cases like "ececabbacec"
                // isPalindrome(s, leftIndex, rightIndex - 1, true) for cases like "abccbab"
                return isPalindrome(s, leftIndex + 1, rightIndex, true) || isPalindrome(s, leftIndex, rightIndex - 1, true);
            }

            ++leftIndex;
            --rightIndex;

        }

        return true;
    }

    static boolean validPalindrome2(String s) {
        return validPalindrome(0, s.length() - 1, s, false);
    }

    static boolean validPalindrome(int start, int end, String s, boolean used) {
        if (start >= end) return true;
        if (s.charAt(start) == s.charAt(end)) return validPalindrome(start + 1, end - 1, s, used);
        return used ? false : validPalindrome(start + 1, end, s, true) || validPalindrome(start, end - 1, s, true);
    }
}