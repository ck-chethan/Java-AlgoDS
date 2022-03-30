package com.chethan.leetCode.medium;

// https://leetcode.com/problems/house-robber/
// 198. House Robber - Leetcode - Medium - DP

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int res = rob3(nums);
        System.out.println(res);

    }

    public static int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int a = nums[0];
        int b = Math.max(nums[0], nums[1]);
        if (nums.length == 2) return b;
        for (int i = 2; i < nums.length; i++) {
            int temp = Math.max(a + nums[i], b);
            a = b;
            b = temp;
        }
        return b;
    }

    public static int rob2(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        if(nums.length == 1){
            return nums[0];
        }
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i =2 ;i < nums.length ;i++){
            dp[i] = Math.max(nums[i] + dp[i-2] , dp[i-1]);
        }
        return dp[nums.length -1];
    }

    public static int rob3(int[] nums) {
        return robberbro(nums, 0, 0);
    }

    static int robberbro(int[] arr, int idx, int amount) {
        if (idx >= arr.length) {
            return amount;
        }

        int pick = robberbro(arr, idx + 2, amount + arr[idx]);
        int npick = robberbro(arr, idx + 1, amount);

        return Math.max(pick, npick);
    }
}
