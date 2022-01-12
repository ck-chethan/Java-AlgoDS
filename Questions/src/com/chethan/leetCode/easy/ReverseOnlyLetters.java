package com.chethan.leetCode.easy;

// https://leetcode.com/problems/reverse-only-letters/
// Leetcode - Easy - 917

import java.util.Arrays;

class ReverseOnlyLetters {
    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        String res = reverseOnlyLetters2(s);
        System.out.println(res);
    }
    static String reverseOnlyLetters(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] out = new char[s.length()];
        while (i < j){
            if(Character.isLetter(s.charAt(i)) && Character.isLetter(s.charAt(j))){
                out[i] = s.charAt(j);
                out[j] = s.charAt(i);
                i++;
                j--;
            } else if(!Character.isLetter(s.charAt(i))){
                out[i] = s.charAt(i);
                i++;
            } else{
                out[j] = s.charAt(j);
                j--;
            }
        }
        return new String(out);
    }
    static String reverseOnlyLetters2(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] arr =   s.toCharArray();
        while (i < j){
            if(Character.isLetter(arr[i]) && Character.isLetter(arr[j])){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else if(!Character.isLetter(s.charAt(i))){
                i++;
            } else{
                j--;
            }
        }
        return new String(arr);
    }
}