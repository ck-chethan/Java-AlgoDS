package com.chethan.leetCode.easy.Hashing;

import java.util.HashMap;

// 1684. Count the Number of Consistent Strings - Easy

public class CountTheNumberOfConsistentStrings {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        int res = countConsistentStrings(allowed, words);
        System.out.println(res);
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i=0; i<allowed.length(); i++) {
            map.put(allowed.charAt(i), (map.getOrDefault(allowed.charAt(i), 0)+1));
        }

        int count = 0;
        for (String word : words) {
            boolean flag = true;
            for (int j = 0; j < word.length(); j++) {
                if (map.getOrDefault(word.charAt(j), 0) == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }
}
