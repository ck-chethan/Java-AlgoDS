package com.chethan.leetCode.medium;

import java.util.*;

// https://leetcode.com/problems/keys-and-rooms/
// Leetcode - Medium - 841

class KeysAndRooms {
    public static void main(String[] args) {
        int[][] inps = {{1}, {2}, {1, 2}, {}};
        List<List<Integer>> rooms = new ArrayList<>();
        for (int[] ints : inps) {
            List<Integer> room = new ArrayList<>();
            for (int inp : ints) {
                room.add(inp);
            }
            rooms.add(room);
        }
        System.out.println(rooms);

        boolean res = canVisitAllRooms2(rooms);
        System.out.println(res);
    }
    static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] seen = new boolean[rooms.size()];
        seen[0] = true;

        Stack<Integer> keys = new Stack<>();
        keys.add(0);
        while(!keys.isEmpty()){
            int currentKey = keys.pop();
            for (int newKey: rooms.get(currentKey)){
                if(!seen[newKey]){
                    seen[newKey] = true;
                    keys.add(newKey);
                }
            }
        }

        for(boolean visited: seen){
            if(!visited){
                return false;
            }
        }
        return true;
    }

    static boolean canVisitAllRooms2(List<List<Integer>> rooms) {
        Set<Integer> s = new HashSet<>();
        s.add(0);
        helper(0,rooms,s);
        return s.size()==rooms.size();
    }
    static void helper(int key, List<List<Integer>> rooms, Set<Integer> s)
    {
        List<Integer> l = rooms.get(key);
        for (Integer integer : l) {
            if (!s.contains(integer)) {
                s.add(integer);
                helper(integer, rooms, s);
            }
        }
    }
}