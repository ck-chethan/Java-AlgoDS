package com.chethan.leetCode.easy;

// https://leetcode.com/problems/backspace-string-compare/
// Leetcode - Easy - 844

class BackSPaceStringCompare {
    public static void main(String[] args) {
        String s = "ab##";
        String t = "c#d#";
        boolean res = backspaceCompare(s, t);
        System.out.println(res);
    }
    static boolean backspaceCompare(String s, String t) {
        String ss = "";
        String ts = "";
        for (int i = 0; i < s.length(); i++) {
            if(!(i < (s.length()-1) && (s.charAt(i+1) == '#'))){
                if(!(t.charAt(i) == '#')) {
                    ss += s.charAt(i);
                }
            }
            else {
                i += 1;
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if(!(i < (t.length() -1) && (t.charAt(i+1) == '#'))){
                if(!(t.charAt(i) == '#')) {
                    ts += t.charAt(i);
                }
            }
            else {
                i += 1;
            }
        }
        return ss.equals(ts);
    }
}