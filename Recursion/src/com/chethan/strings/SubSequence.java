package com.chethan.strings;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        String str = "abc";
        subseq("", str);
        ArrayList<String> res = subseq2("", str);
        System.out.println();
        System.out.println(res);
    }

    static void subseq(String p, String up){
        if(up.isEmpty()){
            if(p.isEmpty()) {
                System.out.print(p + ", ");
                return;
            }
            System.out.print(p + ", ");
            return;
        }

        char ch = up.charAt(0);
        subseq(p, up.substring(1));
        subseq(p+ch, up.substring(1));

    }

    static ArrayList<String> subseq2(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subseq2(p, up.substring(1));
        ArrayList<String> right = subseq2(p+ch, up.substring(1));
        left.addAll(right);
        return left;
    }
}
