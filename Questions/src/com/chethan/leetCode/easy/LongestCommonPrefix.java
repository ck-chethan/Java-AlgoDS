package com.chethan.leetCode.easy;

// https://leetcode.com/problems/longest-common-prefix/
// 14. Longest Common Prefix - Leetcode - Easy

import java.util.Arrays;

class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String res = longestCommonPrefix2(strs);
        System.out.println(res);
    }
    static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int i = 0;
        while(i < strs[0].length()){
            if(strs[strs.length-1].charAt(i) == strs[0].charAt(i))
                i++;
            else break;
        }
        if(i>0) return strs[0].substring(0,i);
        return "";
    }

    static String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(result)) {
                result = result.substring(0, result.length() - 1);
            }
        }
        return result;
    }
}