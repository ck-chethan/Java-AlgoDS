package com.chethan.leetCode.easy;

// https://leetcode.com/problems/first-bad-version/
// Leetcode - Easy - 278

class FirstBadVer {
    public static void main(String[] args) {
        int n = 15;
        int bad = -4;
        int res = firstBadVersion(n, bad);
        System.out.println(res);
    }
    static int firstBadVersion(int n, int bad) {
        int s = 1;
        int e = n;
        while(s<e){
            int mid = s + (e-s)/2;
            if(isBadVersion(mid, bad)){
                e = mid;
            }
            else{
                s = mid + 1;
            }
        }
        return s;

    }

    static boolean isBadVersion(int mid, int bad) {
        return mid >= bad;
    }
}