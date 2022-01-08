package com.chethan.leetCode.easy;

// https://leetcode.com/problems/valid-palindrome/
// Leetcode - Easy - 125

class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean res = isPalindrome(s);
        System.out.println(res);
    }
    static boolean isPalindrome(String s) {
        String fixedStr = "";
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                fixedStr += c;
            }
        }
        fixedStr = fixedStr.toLowerCase();

        int i = 0;
        int j = fixedStr.length() - 1;
        while(i < j){
            if(fixedStr.charAt(i) != fixedStr.charAt(j)){
                return false;
            }
            i+=1;
            j-=1;
        }
        return true;
    }
}