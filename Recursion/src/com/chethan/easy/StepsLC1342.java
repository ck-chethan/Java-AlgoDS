package com.chethan.easy;

public class StepsLC1342 {
    public static void main(String[] args) {
        int n = 14;
        int res = method1(n);
        System.out.println(res);
    }

     static int method1(int num) {
        int a = 0;
        while (num > 0) {
            a++;
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
        }
        return a;
    }

}
