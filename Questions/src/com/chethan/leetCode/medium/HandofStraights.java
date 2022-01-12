package com.chethan.leetCode.medium;

// https://leetcode.com/problems/hand-of-straights/
// Leetcode - Medium - 846

import java.util.TreeMap;

class HandofStraights {
    public static void main(String[] args) {
        int[] hand = {1, 2, 3, 6, 2, 3, 4, 7, 5};
        int groupSize = 3;
        boolean res = isNStraightHand(hand, groupSize);
        System.out.println(res);
    }
    static boolean isNStraightHand(int[] hand, int groupSize) {
        TreeMap<Integer, Integer> card_counts = new TreeMap<>();
        for (int card: hand) {
            if(!card_counts.containsKey(card)){
                card_counts.put(card, 1);
            }
            else {
                card_counts.put(card, card_counts.get(card) + 1);
            }
        }

        while (card_counts.size() > 0){
            int first_card = card_counts.firstKey();
            for (int i = first_card; i < first_card + groupSize ; i++) {
                if(!card_counts.containsKey(i)){
                    return false;
                }
                int count = card_counts.get(i);
                if(count == 1){
                    card_counts.remove(i);
                } else{
                    card_counts.replace(i, count-1);
                }
            }
        }
        return true;
    }
}