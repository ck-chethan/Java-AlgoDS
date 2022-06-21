package com.chethan.leetCode.medium;

// 55. Jump Game - Medium

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        boolean res = canJump(nums);
        System.out.println(res);
    }
    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int reachable = 0;
        for(int i=0; i<n; i++){
            if(reachable<i){
                return false;
            }
            reachable = Math.max(reachable, i+nums[i]);
        }
        return true;
    }

    public static boolean canJump2(int[] nums) {
        int goal = nums.length-1;
        for(int i=nums.length-1; i>=0; i--){
            if(i + nums[i] >= goal){
                goal = i;
            }
        }
        return goal == 0;
    }
}
