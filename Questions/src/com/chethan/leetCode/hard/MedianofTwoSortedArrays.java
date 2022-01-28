package com.chethan.leetCode.hard;

// https://leetcode.com/problems/median-of-two-sorted-arrays/
// 4. Median of Two Sorted Arrays - Leetcode - Hard

class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double res = findMedianSortedArrays2(nums1, nums2);
        System.out.println(res);
    }
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num1Length = nums1.length;
        int num2Length = nums2.length;
        int sum = num1Length + num2Length;

        int[] newArray = new int[num1Length + num2Length];

        int num1Index = 0;
        int num2Index = 0;


        for (int i = 0; i < sum; i++) {

            if (num1Index >= nums1.length) {
                newArray[i] = nums2[num2Index];
                num2Index++;
            } else if (num2Index >= nums2.length) {
                newArray[i] = nums1[num1Index];
                num1Index++;
            } else {
                if (nums1[num1Index] == nums2[num2Index]) {
                    newArray[i] = nums1[num1Index];
                    num1Index++;

                } else if (nums1[num1Index] > nums2[num2Index]) {
                    newArray[i] = nums2[num2Index];
                    num2Index++;
                } else if (nums1[num1Index] < nums2[num2Index]) {
                    newArray[i] = nums1[num1Index];
                    num1Index++;
                }
            }


        }
        
        return calculateMedian(newArray);
        
    }
        static  double calculateMedian(int[] newArray) {
        int length = newArray.length;
        if (newArray.length % 2 == 0) {
            int sum = newArray[length / 2] + newArray[(length / 2) - 1];
            return (double) sum / 2;
        } else {
            return newArray[length /2];
        }
    }

    static double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int i=0, j=0, k=0;
        int n = nums1.length + nums2.length;
        double median;
        int[] res = new int[nums1.length + nums2.length];
        while (i<nums1.length && j<nums2.length){
            if (nums1[i] <= nums2[j]){
                res[k] = nums1[i];
                i++;
            }
            else {
                res[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i<nums1.length){
            res[k] = nums1[i];
            i++; k++;
        }
        while (j<nums2.length){
            res[k] = nums2[j];
            j++; k++;
        }

        if (res.length%2==0){
            median = (res[(n/2)-1]+res[n/2])/2f;
        }
        else {
            median = res[n/2];
        }
        return median;
    }
}