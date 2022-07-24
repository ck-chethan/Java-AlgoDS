package com.chethan.leetCode.easy.Hashing;

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

    public static int numIdenticalPairs2(int[] nums) {
        int gPair =0;
        int[] ans = new int[101];
        for (int num : nums) {
            ans[num]++;
        }
        for(int i=0;i<100;i++){
            int temp = ans[i];
            if(temp>0){
                gPair += ((temp)*(temp-1))/2;
            }
        }
        return gPair;
    }
}
