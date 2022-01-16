package com.chethan.leetCode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/find-common-characters/
// Leetcode - Easy - 1002

class FindCommonCharacters {
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        List<String> res = commonChars(words);
        System.out.println(res);
    }
    static List<String> commonChars(String[] words) {
        List<String> commonStr = new ArrayList<>();
        int[] min_freq = new int[26];
        Arrays.fill(min_freq, Integer.MAX_VALUE);
        for (String currentStr: words){
            int[] char_freq = new int[26];
            for(char c: currentStr.toCharArray()){
                char_freq[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                min_freq[i] = Math.min(min_freq[i], char_freq[i]);
            }
        }
        for (int i = 0; i < 26; i++) {
            while(min_freq[i] > 0){
                commonStr.add(""+(char)(i+'a'));
                min_freq[i]--;
            }
        }
        return commonStr;
    }
}