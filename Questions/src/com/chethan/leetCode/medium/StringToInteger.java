package com.chethan.leetCode.medium;

//8. String to Integer (atoi) - Leetcode - Medium
//https://leetcode.com/problems/string-to-integer-atoi/

class StringToInteger {
    public static void main(String[] args) {
        String s = "4193 with words";
        int out = myAtoi2(s);
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

    public static int myAtoi2(String s) {
        //trim the leading spaces in the string
        s = s.trim();
        //set default sign as positive
        int sign = 1;
        int res = 0;

        for(int i = 0; i < s.length(); i++) {
            //check for sign
            if(i == 0 && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
                if(s.charAt(i) == '-') {
                    sign = -1;
                }
                continue;
            }
            //if the char is not digit, break the loop
            if(s.charAt(i) < '0' || s.charAt(i) > '9') break;

            //check if the number is out of range
            if(res >= Integer.MAX_VALUE / 10 + 1) return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            if(res == Integer.MAX_VALUE / 10) {
                if(sign == 1 && Character.getNumericValue(s.charAt(i)) >= 8) {
                    return Integer.MAX_VALUE;
                } else if(sign == -1 && Character.getNumericValue(s.charAt(i)) > 8) {
                    return Integer.MIN_VALUE;
                }
            }
            res = res * 10 + Character.getNumericValue(s.charAt(i));
        }
        return res*sign;
    }
}