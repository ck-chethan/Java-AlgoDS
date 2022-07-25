package com.chethan.leetCode.easy.Hashing;

// 2006. Count Number of Pairs With Absolute Difference K - Easy

import java.util.HashMap;

public class CountNumberOfPairsWithAbsoluteDifferenceK {
    public static void main(String[] args) {
        int[] nums = {7, 7, 8, 3, 1, 2, 7, 2, 9, 5};
        int k = 6;
        int res = countKDifference(nums, k);
        System.out.println(res);
    }

    private static int countKDifference(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int val1 = num - k;
            int val2 = num + k;
            if (map.containsKey(val1)) {
                count += map.get(val1);
            }
            if (map.containsKey(val2)) {
                count += map.get(val2);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }

    public int countKDifference2(int[] nums, int k) {
        int[] count=new int[101];
        int kMax=100;
        int ans=0;
        for(int n:nums)
            count[n]++;

        for (int i = k + 1; i <= kMax; ++i)
            ans += count[i] * count[i - k];
        return ans;
    }
}
