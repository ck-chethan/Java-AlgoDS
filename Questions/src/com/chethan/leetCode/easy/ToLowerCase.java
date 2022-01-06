package com.chethan.leetCode.easy;

// https://leetcode.com/problems/to-lower-case/
// Leetcode - Easy - 709
class ToLowerCase {
    public static void main(String[] args) {
        String s = "-Hello";
        String res = toLowerCase(s);
        System.out.println(res);
    }
    static String method1(String s) {
        return s.toLowerCase();
    }

    static String toLowerCase(String s) {
        String out = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                out += Character.toLowerCase(c);
            }
            else {
                out += c;
            }
        }
        return out;
    }
}