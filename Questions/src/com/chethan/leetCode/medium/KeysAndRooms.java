package com.chethan.leetCode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

// https://leetcode.com/problems/keys-and-rooms/
// Leetcode - Medium - 841

class KeysAndRooms {
    public static void main(String[] args) {
        int[][] inps = {{1}, {2}, {3}, {}};
        List<List<Integer>> rooms = new ArrayList<>();
        for (int[] ints : inps) {
            List<Integer> room = new ArrayList<>();
            for (int inp : ints) {
                room.add(inp);
            }
            rooms.add(room);
        }
        System.out.println(rooms);

        boolean res = canVisitAllRooms(rooms);
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
}