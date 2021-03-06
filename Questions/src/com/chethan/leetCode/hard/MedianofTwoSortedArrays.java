package com.chethan.leetCode.hard;

// https://leetcode.com/problems/median-of-two-sorted-arrays/
// 4. Median of Two Sorted Arrays - Leetcode - Hard

class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double res = findMedianSortedArrays4(nums1, nums2);
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

    static double findMedianSortedArrays3(int[] nums1, int[] nums2) {
        int[] arr = merge(nums1, nums2);
        if(arr.length%2==0){
            return (arr[arr.length/2]+arr[arr.length/2-1])/2.0;
        }
        return (arr[arr.length/2]);
    }
    static int[] merge(int[] arr1, int[] arr2){
        int[] arr = new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]>arr2[j])arr[k++]=arr2[j++];
            else arr[k++]=arr1[i++];
        }
        while(i<arr1.length) arr[k++] = arr1[i++];
        while(j<arr2.length) arr[k++] = arr2[j++];
        return arr;
    }

    static double findMedianSortedArrays4(int[] nums1, int[] nums2) {
        if (nums1 == null) return findMedianSortedArrays(new int[0], nums2);
        if (nums2 == null) return findMedianSortedArrays(nums1, new int[0]);
        if (nums1.length > nums2.length) return findMedianSortedArrays(nums2, nums1);
        int m = nums1.length, n = nums2.length;
        int k = (m + n) / 2;
        int l = 0, r = m - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums1[mid] < nums2[k - mid - 1]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        double candidate1 = Math.min(l == m ? Integer.MAX_VALUE : nums1[l], k - l == n ? Integer.MAX_VALUE : nums2[k - l]);
        if ((m + n) % 2 == 1) return candidate1;
        double candidate2 = Math.max(l == 0 ? Integer.MIN_VALUE : nums1[l - 1], k - l == 0 ? Integer.MIN_VALUE : nums2[k - l - 1]);
        return (candidate1 + candidate2) / 2;
    }
}