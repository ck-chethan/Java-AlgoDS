package com.chethan;

// Time Complexity => O(logN)
public class SquareRootNumberUsingBinarySearch {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        double ans = sqrtOfNum(n, p);
        System.out.printf("%.3f",ans);
    }

    static int sqrtofPerfectSquare(int n){
        int s = 0;
        int e = n;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(mid*mid > n){
                e = mid - 1;
            }
            if(mid*mid < n){
                s = mid + 1;
            }
            if(mid*mid == n){
                return mid;
            }
        }
        return -1;
    }

    static double sqrtOfNum(int n, int p){
        int s = 0;
        int e = n;
        double root = 0.0;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(mid*mid == n){
                return mid;
            }
            if(mid*mid > n){
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while(root * root <= n){
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }
}
