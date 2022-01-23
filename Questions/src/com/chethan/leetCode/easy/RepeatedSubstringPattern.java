package com.chethan.leetCode.easy;

// https://leetcode.com/problems/repeated-substring-pattern/
// 459. Repeated Substring Pattern - Easy

class RepeatedSubstringPattern {
    public static void main(String[] args) {
        String s = "abab";
        boolean res = repeatedSubstringPattern(s);
        System.out.println(res);
    }
    static boolean repeatedSubstringPattern(String s) {
        boolean ans;
        String ss =s+s;

        return (ss.substring(1,ss.length()-1).contains(s));
    }
}