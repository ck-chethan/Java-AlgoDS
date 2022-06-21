package com.chethan.leetCode.medium;
// 1306. Jump Game III - Medium
public class JumpGameIII {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 0, 3, 1, 2};
        int start = 5;
        boolean res = canReach(arr, start);
        System.out.println(res);
    }

    public static boolean canReach(int[] arr, int start) {
        if(start<0 || start >= arr.length || arr[start] < 0){
            return false;
        }
        arr[start] *= -1;
        if(arr[start] == 0){
            return true;
        }
        return canReach(arr, start + arr[start]) || canReach(arr, start - arr[start]);
    }
}
