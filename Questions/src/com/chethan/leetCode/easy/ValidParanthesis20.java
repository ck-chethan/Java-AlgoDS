package com.chethan.leetCode.easy;

import java.util.Stack;

// 20. Valid Parentheses - Leetcode - Easy
// https://leetcode.com/problems/valid-parentheses/

class ValidParanthesis20 {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
       if(s.length() % 2 != 0) return false;
        
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()) {
            if(c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            }else if(c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }else if(c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty(); 
    }
}