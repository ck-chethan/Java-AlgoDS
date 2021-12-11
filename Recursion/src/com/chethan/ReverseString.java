package com.chethan;

import java.util.Arrays;

class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
    static void reverseString(char[] s) {
        int j = s.length-1;
        int i = 0;
        while(i < j){
            swap(s, i, j);
            i++;j--;
        }
    }
    static void swap(char[] s, int i, int j){
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}