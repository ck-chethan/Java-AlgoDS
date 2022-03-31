package com.chethan.scaler.Arrays;

public class MaxEvenMinOddDiff {
    public static void main(String[] args) {
        int[] A = {98, 83, 54, 57, 36, 83, 7, 98, -3, 37};
        int maxEvn = Integer.MIN_VALUE;
        int minOdd = Integer.MAX_VALUE;

        for(int num: A){
            int modN = num % 2;
            if(modN==0 && num > maxEvn){
                maxEvn = num;
            } else if((modN == 1 || modN == -1) && (num < minOdd)) {
                minOdd = num;
            }
        }
        System.out.format("%d - (%d) = %d", maxEvn, minOdd, maxEvn-minOdd);
    }
}
