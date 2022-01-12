package com.chethan.leetCode.easy;

// https://leetcode.com/problems/reverse-only-letters/
// Leetcode - Easy - 917

import java.util.Arrays;
import java.util.Stack;

class ReverseOnlyLetters {
    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        String res = reverseOnlyLettersUsingStack(s);
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

    static String reverseOnlyLettersUsingStack(String s) {
        Stack<Character> letters = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i))){
                letters.push(s.charAt(i));
            }
        }

        StringBuilder reversed_str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i))){
                reversed_str.append(letters.pop());
            } else {
                reversed_str.append(s.charAt(i));
            }
        }
        return reversed_str.toString();
    }
}