package com.chethan.leetCode.medium;

//8. String to Integer (atoi) - Leetcode - Medium
//https://leetcode.com/problems/string-to-integer-atoi/

class StringToInteger {
    public static void main(String[] args) {
        String s = "4193 with words";
        int out = myAtoi(s);
        System.out.println(out);
    }
    public static int myAtoi(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        
        int finalOut;
        
        char[] arr = s.toCharArray();
        int i=0;
        for(; i<arr.length; i++){
            if(arr[i] != ' ') {
                break;
            }
        }
        
        boolean isNegative = false;
        if(i<arr.length && (arr[i] == '-' || arr[i] == '+')){
            if(arr[i] == '-'){
                isNegative = true;
            }
            i++;
        }
        
        long res = 0;
        for (; i < arr.length && Character.isDigit(arr[i]); i++) {
            res = res * 10 + Character.getNumericValue(arr[i]);
            if (res > Integer.MAX_VALUE) {
                break;
            }
        }
        
        long tempOut = res * (isNegative ? -1 : 1);
        
        if (tempOut < Integer.MIN_VALUE) {
            tempOut = Integer.MIN_VALUE;
        }
        
        if (tempOut > Integer.MAX_VALUE) {
            tempOut = Integer.MAX_VALUE;
        }
        
        finalOut = (int) tempOut;
        
        return finalOut;
    }
}