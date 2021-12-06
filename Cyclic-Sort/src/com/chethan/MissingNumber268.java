package com.chethan;

class MissingNumber268 {
    // https://leetcode.com/problems/missing-number/
    // Amazon

//    class Solution:
//    def missingNumber(self, nums: List[int]) -> int:
//            nums.sort()
//            for i in range(len(nums)):
//            if nums[i] == i+1:
//            return nums[i]-1
//            return len(nums)

    public static void main(String[] args) {
        int[] arr = {2, 1};
        int res = missingNumber(arr);
        System.out.print(res);
    }

    static int missingNumber(int[] nums) {
        sort(nums);
        for(int i=0; i < nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }
    
    static void sort(int[] arr){
        int i = 0;
        while(i< arr.length){
            if(arr[i] <arr.length && arr[i] != arr[arr[i]]) {
                swap2elements(arr, i, arr[i]);
            }
            else{
                i++;
            }
        }
    }

    static void swap2elements(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}