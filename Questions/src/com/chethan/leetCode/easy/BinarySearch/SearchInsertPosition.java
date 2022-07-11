package com.chethan.leetCode.easy.BinarySearch;
// 35. Search Insert Position - Easy
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        int res = searchInsert(nums, target);
        System.out.println(res);
    }
    public static int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l<=r){
            int m = l + (r-l)/2;
            if(nums[m] < target){
                l = m+1;
            }else if(nums[m] > target){
                r = m - 1;
            }else{
                return m;
            }
        }
        return l;
    }
}
