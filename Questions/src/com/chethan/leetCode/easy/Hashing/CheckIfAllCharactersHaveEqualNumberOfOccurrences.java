package com.chethan.leetCode.easy.Hashing;

import java.util.HashMap;
// 1941. Check if All Characters Have Equal Number of Occurrences - Easy
public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    public static void main(String[] args) {
        String s = "abacbc";
        boolean res = areOccurrencesEqual(s);
        System.out.println(res);
    }

    public static boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i=0; i<s.length(); i++) {
            map.put(s.charAt(i), (map.getOrDefault(s.charAt(i), 0)+1));
        }
        int val = map.get(s.charAt(0));
        for(int value: map.values()) {
            if (value != val) {
                return false;
            }
        }
        return true;
    }

    public boolean areOccurrencesEqual2(String s) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int temp=freq[s.charAt(0)-'a'];
        for (int j : freq) {
            if (j != temp && j != 0) {
                return false;
            }
        }
        return true;
    }
}
