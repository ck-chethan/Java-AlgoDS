package com.chethan.leetCode.medium;

// https://leetcode.com/problems/remove-k-digits/
// 402. Remove K Digits - Leetcode - Medium

import java.util.Stack;

class RemoveKDigits {
    public static void main(String[] args) {
        String num = "1432219";
        int k = 3;
        String res = removeKdigits2(num, k);
        System.out.println(res);
    }
    static String removeKdigits(String num, int k) {
        // calculate the `target` which is the length of returned string
        int n = num.length(), target = n - k;
        if (target == 0) return "0";
        // stack contains the characters within returned string
        char[] stack = new char[target];
        for (int i = 0, j = 0; i < n; i++) {
            // if num[i] is less than the most recently added element (top element of stack), we pop it out of stack
            while (j > 0 && i < n - (target - j) && stack[j - 1] > num.charAt(i))
                j--;
            // we push the num[i] into the stack (if the stack is not full)
            if (j < target) stack[j++] = num.charAt(i);
        }
        // get rid of leading zeros before returning the result string
        int offset = 0;
        while (offset < target - 1 && stack[offset] == '0') offset++;
        return new String(stack, offset, target - offset);
    }

    static String removeKdigits2(String num, int k) {
        if(k==num.length() || k>num.length()){
            return "0";
        }
        Stack<Character> st=new Stack<>();
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            while(!st.isEmpty() && k>0 && st.peek()>ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }

        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
            sb.append(st.pop());
        sb.reverse();
        while(sb.length()>1 && sb.charAt(0)=='0')
            sb.deleteCharAt(0);
        return sb.toString();
    }
}