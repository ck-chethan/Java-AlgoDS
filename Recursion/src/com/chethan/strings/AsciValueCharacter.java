package com.chethan.strings;

import java.util.ArrayList;

public class AsciValueCharacter {
    public static void main(String[] args) {
        String str = "abc";
        subseqAscii("", str);
        ArrayList<String> res = subseqAscii2("", str);
        System.out.println();
        System.out.println(res);
    }

    static void subseqAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseqAscii(p, up.substring(1));
        subseqAscii(p+ch, up.substring(1));
        subseqAscii(p + (ch+0), up.substring(1));
    }

    static ArrayList<String> subseqAscii2(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subseqAscii2(p, up.substring(1));
        ArrayList<String> right = subseqAscii2(p+ch, up.substring(1));
        ArrayList<String> ascii = subseqAscii2(p+(ch + 0), up.substring(1));
        left.addAll(right);
        left.addAll(ascii);
        return left;
    }
}
