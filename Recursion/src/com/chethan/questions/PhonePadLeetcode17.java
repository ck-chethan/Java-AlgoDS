package com.chethan.questions;

import java.util.ArrayList;

class PhonePadLeetcode17 {
    public static void main(String[] args) {
        String dig = "12";
        pad("", dig);
    }

    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            pad(p + ch, up.substring(1));
        }
    }
}