package com.chethan.leetCode.easy;

import java.util.HashMap;

// 1512. Number of Good Pairs - Easy

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int res = numIdenticalPairs(nums);
        System.out.println(res);
    }

    private static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            if (hm.containsKey(num)) {
                count += hm.get(num);
                hm.put(num, hm.get(num) + 1);
            } else {
                hm.put(num, 1);
            }
        }

        return count;
    }
}
