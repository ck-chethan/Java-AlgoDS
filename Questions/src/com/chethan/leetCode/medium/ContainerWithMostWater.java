package com.chethan.leetCode.medium;

// https://leetcode.com/problems/container-with-most-water/
// Leetcode - Medium - 9

class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,2,4,3};
        int res = maxArea(height);
        System.out.println(res);
    }
    static int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;
        while(i < j){
            max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
            if(height[i] < height[j]){
                i++;
            } else{
                j--;
            }
        }
        return max;
    }

    static int maxArea2(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;
        while(i < j){
            if(height[i] < height[j]){
                max = Math.max(max, height[i] * (j - i));
                i++;
            } else{
                max = Math.max(max, height[j] * (j - i));
                j--;
            }
        }
        return max;
    }
}