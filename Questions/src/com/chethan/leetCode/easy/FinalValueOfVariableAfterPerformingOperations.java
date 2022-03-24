package com.chethan.leetCode.easy;

// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
// 2011. Final Value of Variable After Performing Operations - Leetcode - Easy

class FinalValueOfVariableAfterPerformingOperations {
    public static void main(String[] args) {
        String[] operations = {"--X", "X++", "X++"};
        int res = finalValueAfterOperations2(operations);
        System.out.println(res);
    }
    public static int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for(String str: operations){
            if(str.equals("++X") || str.equals("X++")) count++;
            if(str.equals("--X") || str.equals("X--")) count--;
        }
        return count;
    }

    public static int finalValueAfterOperations2(String[] operations) {
        return finalValue(operations, 0, operations.length);
    }
    public static int finalValue(String[] operations, int start, int end){
        if(start==end){
            return 0;
        }
        if(operations[start].equals("X++") || operations[start].equals("++X"))
            return finalValue(operations, start+1, end)+1;
        return finalValue(operations, start+1, end)-1;
    }
}