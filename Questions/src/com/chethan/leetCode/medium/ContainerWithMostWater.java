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
            if(Math.min(height[i], height[j]) * (j - i) > max){
                max = Math.min(height[i], height[j]) * (j - i);
            }
            int nextItem = Math.max(height[i + 1], height[j - 1]);
            if(height[i+1] == nextItem){
                i++;
            } else{
                j--;
            }
        }
        return max;
    }
}