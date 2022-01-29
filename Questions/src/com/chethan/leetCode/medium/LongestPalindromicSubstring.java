package com.chethan.leetCode.medium;

// https://leetcode.com/problems/longest-palindromic-substring/
// 5. Longest Palindromic Substring - Leetcode - Medium

class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        String res = longestPalindrome2(s);
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

    static String longestPalindrome2(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        String result = null;
        int maxLen = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int len = findPalindrome(s, i, i);
            if (len > maxLen) {
                maxLen = len;
                result = s.substring(i - len / 2, i + len / 2 + 1);
            }

            len = findPalindrome(s, i, i + 1);
            if (len > maxLen) {
                maxLen = len;
                result = s.substring(i - len / 2 + 1, i + len / 2 + 1);
            }
        }

        return result;
    }

    static Integer findPalindrome(String s, Integer left, Integer right) {
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) != s.charAt(right)) {
                break;
            }
            left--;
            right++;
        }

        return right - left - 1;
    }
}