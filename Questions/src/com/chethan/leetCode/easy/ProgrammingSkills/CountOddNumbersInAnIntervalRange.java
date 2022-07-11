package com.chethan.leetCode.easy.ProgrammingSkills;
// 1523. Count Odd Numbers in an Interval Range - Easy
public class CountOddNumbersInAnIntervalRange {
    public static void main(String[] args) {
        int low = 7;
        int high = 9;
        int res = countOdds(low, high);
        System.out.println(res);
    }
    public static int countOdds(int low, int high) {
        int nos = high - low + 1;
        if(low%2==1 && high%2==1){
            return nos/2+1;
        }
        return nos/2;
    }
}
