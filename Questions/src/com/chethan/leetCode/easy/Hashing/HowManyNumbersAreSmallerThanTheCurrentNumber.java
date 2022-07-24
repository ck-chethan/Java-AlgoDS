package com.chethan.leetCode.easy.Hashing;

import java.util.Arrays;
import java.util.HashMap;

// 1365. How Many Numbers Are Smaller Than the Current Number - Easy

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        int[] res = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(res));
    }

    private static int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] output = new int[nums.length];
        for (int num: nums) {
            hm.put(num,hm.getOrDefault(num, 0)+1);
        }
        System.out.println(hm);
        int[] numsCopy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        int k = 0;
        for (int i=0; i< nums.length; i++) {
            if (i == 0) {
                hm.put(nums[i], k);
                k = 1;
            }
            else if (nums[i] == nums[i-1]) {
                k += 1;
            } else {
                hm.put(nums[i], k);
                k += 1;
            }
        }
        for (int i=0; i<nums.length; i++) {
            output[i] = hm.get(numsCopy[i]);
        }
        return output;
    }

    public static int[] smallerNumbersThanCurrent2(int[] nums) {
        int[] ans = new int[nums.length];
        int[] numCount = new int[101];
        for (int num : nums) {
            numCount[num]++;
        }
        for (int i = 0; i < nums.length; i++) {
            int c = nums[i];
            int count = 0;
            for (int j = 0; j < c; j++) {
                count += numCount[j];
            }
            ans[i] = count;
        }
        return ans;
    }

    public int[] smallerNumbersThanCurrent3(int[] nums) {
        int[] ans = new int[nums.length];
        int[] temp = nums.clone();
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }
        }
        for(int i=0; i<temp.length; i++){
            ans[i] = map.get(temp[i]);
        }
        return ans;
    }
}
