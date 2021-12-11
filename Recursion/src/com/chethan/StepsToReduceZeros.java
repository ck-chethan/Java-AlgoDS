package com.chethan;

class StepsToReduceZeros {
    public static void main(String[] args) {
        int ans = numberOfSteps(123);
        System.out.print(ans);
    }
    static int numberOfSteps(int num) {
        if (num == 0) {
            return 0;
        }
        int count = 0;
        while (num > 0) {
            count++;
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
        }
        return count;
    }
}