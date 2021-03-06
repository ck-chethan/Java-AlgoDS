package com.chethan.leetCode.medium;

// 12. Integer to Roman - Leetcode - Medium
// https://leetcode.com/problems/integer-to-roman/

class IntegerToRoman {
    public static void main(String[] args) {
        int num = 1994;
        String res = intToRoman(num);
        System.out.println(res);
    }
    public static String intToRoman(int num) {
        StringBuilder s = new StringBuilder();
        int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] symbols = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        while(num > 0){
            for (int i = 12; i >= 0; i--) {
                if(num >= values[i]){
                    num -= values[i];
                    s.append(symbols[i]);
                    break;
                }
            }
        }

        return String.valueOf(s);
    }
}