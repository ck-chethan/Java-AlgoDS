package com.chethan.strings;

public class SubSequence {
    public static void main(String[] args) {
        String str = "abc";
        subseq("", str);
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
}
