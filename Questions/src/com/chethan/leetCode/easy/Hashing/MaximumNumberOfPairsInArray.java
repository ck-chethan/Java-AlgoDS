package com.chethan.leetCode.easy.Hashing;

import java.util.Arrays;
import java.util.HashMap;
// 2341. Maximum Number of Pairs in Array - Easy
public class MaximumNumberOfPairsInArray {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 1, 3, 2, 2};
        int[] res = numberOfPairs(nums);
        System.out.println(Arrays.toString(res));
    }

    private static int[] numberOfPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x: nums){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        int[] res = {0, 0};
        for (int val: map.values()) {
            res[0] += val/2;
            if (val%2==1){
                res[1] += 1;
            }
        }
        return res;
    }

    public int[] numberOfPairs2(int[] nums) {
        int[] freq = new int[101];
        for (int num: nums) {
            freq[num]++;
        }
        int[] res = new int[2];
        for (int count: freq) {
            res[0] += count / 2;
            res[1] += count % 2;
        }
        return res;
    }

}
