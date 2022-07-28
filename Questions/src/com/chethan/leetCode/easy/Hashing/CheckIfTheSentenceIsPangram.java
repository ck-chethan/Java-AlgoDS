package com.chethan.leetCode.easy.Hashing;

import java.util.HashMap;

// 1832. Check if the Sentence Is Pangram - Easy

public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean res = checkIfPangram(sentence);
        System.out.println(res);

    }

    public static boolean checkIfPangram(String sentence) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0; i<sentence.length(); i++) {
            map.put(sentence.charAt(i), (map.getOrDefault(sentence.charAt(i), 0)+1));
        }

        return map.size() == 26;
    }

    public boolean checkIfPangram2(String sentence) {
        if(sentence.length()<26) return false;
        for(int i=1;i<=26;i++)
            if(sentence.indexOf((char)i+96)<0)
                return false;
        return true;
    }
}
