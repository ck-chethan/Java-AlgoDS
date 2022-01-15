package com.chethan.leetCode.easy;

// https://leetcode.com/problems/self-dividing-numbers/
// Leetcode - Easy - 728

import java.util.ArrayList;
import java.util.List;

class SelfDividingNumbers {
    public static void main(String[] args) {
        int left = 1, right = 22;
        List<Integer> res = selfDividingNumbers2(left, right);
        System.out.println(res);
    }
    static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> out = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int len = String.valueOf(i).length();
            int num = i;
            int count = 0;
            while(num > 0) {
                int n = num % 10;
                if (n > 0) {
                    if (!(i % n == 0)) {
                        break;
                    } else {
                        count++;
                    }
                }
                num /= 10;
            }

            if(count == len) {
                out.add(i);
            }
        }
        return out;
    }

    static List<Integer> selfDividingNumbers2(int left, int right) {
        List<Integer> selfDivNums = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if(isSelfDividing(i)) selfDivNums.add(i);
        }
        return selfDivNums;
    }

    static boolean isSelfDividing(int num) {
        for(char c: String.valueOf(num).toCharArray()){
            if(c == '0' || (num % (c - '0')) > 0){
                return false;
            }
        }
        return true;
    }
}