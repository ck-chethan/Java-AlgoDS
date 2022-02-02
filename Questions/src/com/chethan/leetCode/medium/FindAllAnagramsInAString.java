package com.chethan.leetCode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/find-all-anagrams-in-a-string/
// 438. Find All Anagrams in a String - Leetcode - Medium

class FindAllAnagramsInAString {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> res = findAnagrams2(s, p);
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

    static List<Integer> findAnagrams2(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        int s_len=s.length();
        int p_len=p.length();
        int[] freq1 = new int[26];
        for(int i=0;i<p_len;i++){
            freq1[p.charAt(i)-'a']++;
        }
        for(int i=0;i<s_len;i++){

            int[] freq2 = new int[26];
            for(int j=i;j<i+p_len&&j<s_len;j++){
                freq2[s.charAt(j)-'a']++;
            }
            if(Arrays.equals(freq1,freq2)){
                ans.add(i);
            }
        }
        return ans;
    }
}