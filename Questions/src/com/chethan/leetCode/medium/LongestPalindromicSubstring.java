package com.chethan.leetCode.medium;

// https://leetcode.com/problems/longest-palindromic-substring/
// 5. Longest Palindromic Substring - Leetcode - Medium

class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        String res = longestPalindrome(s);
        System.out.println(res);
    }
    static String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        String best = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j > i; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    String result = checkPalindrome(s, i, j);
                    if (result == null) {
                        continue;
                    }
                    if (result.length() > best.length()) {
                        best = result;
                    }
                    break;
                }

            }
        }

        return best;
    }

    static String checkPalindrome(String s, Integer start, Integer end) {
        for (int i = start, j = end; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return null;
            }
        }
        return s.substring(start, end + 1);
    }
}