package com.chethan;

class MissingNumber268 {
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