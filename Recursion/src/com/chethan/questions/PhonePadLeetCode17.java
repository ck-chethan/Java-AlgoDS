package com.chethan.questions;

import java.util.ArrayList;

public class PhonePadLeetCode17 {
    public static void main(String[] args) {
        String dig = "29";
        ArrayList<String> res = padList("", dig);
        System.out.println(res);
    }

    static ArrayList<String> padList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();
        if(digit <= 6){
            for (int i = (digit -2) * 3; i < (digit-1) * 3; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(padList(p + ch, up.substring(1)));
            }
        }
        else if(digit == 7){
            for (int i = (digit -2) * 3; i <= (digit-1) * 3; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(padList(p + ch, up.substring(1)));
            }
        }
        else if(digit == 8){
            for (int i = (digit -2) * 3 + 1; i <= (digit-1) * 3; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(padList(p + ch, up.substring(1)));
            }
        }
        else if(digit == 9){
            for (int i = (digit -2) * 3 + 1; i <= (digit-1) * 3 + 1; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(padList(p + ch, up.substring(1)));
            }
        }
        return ans;
    }
}