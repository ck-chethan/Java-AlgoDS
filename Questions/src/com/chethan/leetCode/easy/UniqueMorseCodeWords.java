package com.chethan.leetCode.easy;

// https://leetcode.com/problems/unique-morse-code-words/
// Leetcode - Easy - 804

import java.util.HashMap;
import java.util.HashSet;

class UniqueMorseCodeWords {
    public static void main(String[] args) {
        String[] words = {"gin","zen","gig","msg"};
        int res = uniqueMorseRepresentations2(words);
        System.out.println(res);

    }
    static int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<Character, String> morseCode = new HashMap<>();
        int count = 0;
        for (int i = 97; i < 97 + 26; i++) {
            morseCode.put((char) i, morse[count++]);
        }
        HashSet<String> res = new HashSet<>();
        for(String word: words){
            String out = "";
            for (int i = 0; i < word.length(); i++) {
                out += morseCode.get(word.charAt(i));
            }
            res.add(out);
        }
        return res.size();
    }

    static int uniqueMorseRepresentations2(String[] words) {
        String[] MORSE = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        HashSet<String> res = new HashSet<>();
        for(String word: words){
            StringBuilder out = new StringBuilder();
            for (char c: word.toCharArray()) {
                out.append(MORSE[c-'a']);
            }
            res.add(out.toString());
        }
        return res.size();
    }
}