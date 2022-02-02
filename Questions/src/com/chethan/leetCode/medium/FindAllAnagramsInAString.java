package com.chethan.leetCode.medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-anagrams-in-a-string/
// 438. Find All Anagrams in a String - Leetcode - Medium

class FindAllAnagramsInAString {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> res = findAnagrams(s, p);
        System.out.println(res);
    }
    static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int n = s.length();
        int m = p.length();
        if (n < m)
            return list;
        int[] pAlphas = new int[26];
        for (char c : p.toCharArray()) {
            pAlphas[c - 'a']++;
        }
        int[] sAlphas = new int[26];
        for (int i = 0; i < m; i++) {
            sAlphas[s.charAt(i) - 'a']++;
        }
        if (compareAlphaList(pAlphas, sAlphas))
            list.add(0);
        for (int i = m; i < n; i++) {
            sAlphas[s.charAt(i - m) - 'a']--;

            char c = s.charAt(i);
            sAlphas[c - 'a']++;
            if (compareAlphaList(sAlphas, pAlphas))
                list.add(i - m + 1);
        }
        return list;
    }

    static boolean compareAlphaList(int[] a, int[] b) {
        for (int i = 0; i < 26; i++)
            if (a[i] != b[i])
                return false;
        return true;
    }
}