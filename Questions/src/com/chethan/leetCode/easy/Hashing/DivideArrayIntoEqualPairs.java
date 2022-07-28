package com.chethan.leetCode.easy.Hashing;

// 2206. Divide Array Into Equal Pairs - Easy

import java.util.HashMap;

public class DivideArrayIntoEqualPairs {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 2, 2, 2};
        boolean res = divideArray(nums);
        System.out.println(res);
    }

    public static boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            map.put(nums[i], (map.getOrDefault(nums[i], 0)+1));
        }
        int n = nums.length/2;
        for (int val: map.values()) {
            if (val%2!=0) {
                return false;
            }
        }
        return true;
    }
}
