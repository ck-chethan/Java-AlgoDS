package com.chethan.leetCode.easy;

// https://leetcode.com/problems/jewels-and-stones/
// Leetcode - Easy - 771

class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        int res = numJewelsInStones(jewels, stones);
        System.out.println(res);
    }
    static int numJewelsInStones(String jewels, String stones) {
        int res = 0;
        for (int i = 0; i < jewels.length(); i++) {
            char c = jewels.charAt(i);
            for (int j = 0; j < stones.length(); j++) {
                if(stones.charAt(j) == c){
                    res++;
                }
            }
        }
        return res;
    }
}