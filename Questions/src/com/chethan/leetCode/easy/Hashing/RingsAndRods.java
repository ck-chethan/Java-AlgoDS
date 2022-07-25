package com.chethan.leetCode.easy.Hashing;

import java.util.HashMap;
import java.util.HashSet;

// 2103. Rings and Rods - Easy

public class RingsAndRods {
    public static void main(String[] args) {
        String rings = "B0R0G0R9R0B0G0";
        int res = countPoints(rings);
        System.out.println(res);
    }

    private static int countPoints(String rings) {
        HashMap<Integer, HashSet<Character>> map = new HashMap<>();
        for (int i=0; i < rings.length(); i+=2) {
            Character color = rings.charAt(i);
            int rod = rings.charAt(i+1);
            if (map.containsKey(rod)){
                HashSet<Character> ch = map.get(rod);
                ch.add(color);
                map.put(rod, ch);
            } else {
                HashSet<Character> ch = new HashSet<>();
                ch.add(color);
                map.put(rod, ch);
            }
        }
        int count = 0;
        for (HashSet<Character> ch: map.values()) {
            if (ch.size() == 3){
                count += 1;
            }
        }
        return count;
    }
}
