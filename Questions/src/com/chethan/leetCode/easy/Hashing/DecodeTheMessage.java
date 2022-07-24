package com.chethan.leetCode.easy.Hashing;

// 2325. Decode the Message - Easy

import java.util.HashMap;

public class DecodeTheMessage {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv";
        String resmsg = decodeMessage(key, message);
        System.out.println(resmsg);
    }

    private static String decodeMessage(String key, String message) {
        StringBuilder str = new StringBuilder();
        HashMap<Character, Character> hm = new HashMap();
        int k = 'a';
        for (int i=0; i<key.length(); i++) {
            if(hm.containsKey(key.charAt(i)) || key.charAt(i) == ' '){
                continue;
            }
            hm.put(key.charAt(i), (char) k++);
        }
        for (int i=0; i<message.length(); i++){
            if (message.charAt(i) == ' '){
                str.append(' ');
                continue;
            }
            str.append(hm.get(message.charAt(i)));
        }
        return String.valueOf(str);
    }

    public static String decodeMessage1(String key, String message) {
        int n = key.length();
        int len = message.length();
        int[] m = new int[26];
        for (int i = 0; i < 26; i++) {
            m[i] = -1;
        }
        int ch = 0;
        for (int i = 0; i < n; i++) {
            char c = key.charAt(i);
            if (c != ' ' && m[c - 'a'] == -1) {
                m[c - 'a'] = ch;
                ++ch;
            }
        }
        char[] msg = new char[len];
        for (int i = 0; i < len; i++) {
            char c = message.charAt(i);
            if (c != ' ') {
                msg[i] = (char) (m[c - 'a'] + 'a');
            } else {
                msg[i] = ' ';
            }
        }
        return new String(msg);
    }

}
