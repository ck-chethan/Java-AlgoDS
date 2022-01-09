package com.chethan.leetCode.easy;

// https://leetcode.com/problems/robot-return-to-origin/
// Leetcode - Easy - 657

class RobotReturntoOrigin {
    public static void main(String[] args) {
        String moves = "UDD";
        boolean res = judgeCircle(moves);
        System.out.println(res);
    }
    static boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for(char c: moves.toCharArray()){
            if(c == 'U') y += 1;
            if(c == 'D') y -= 1;
            if(c == 'L') x += 1;
            if(c == 'R') x -= 1;
        }
        return x == 0 && y == 0;
    }
}