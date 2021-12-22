package com.chethan.strings;

public class RemoveStringFromString {
    public static void main(String[] args) {
        String str = "bzapplecbbd";
        String tar = "apple";
        String res = skip(str, tar);
        System.out.println(res);
        String tar1 = "app";
        String out = skipAppNotApple(str, tar1, tar);
        System.out.println(out);
    }
    static String skip(String up, String tar) {
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith(tar)){
            return skip(up.substring(tar.length()), tar);
        } else{
            return up.charAt(0) + skip(up.substring(1), tar);
        }
    }

    static String skipAppNotApple(String up, String tar, String tar1) {
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith(tar) && !up.startsWith(tar1)){
            return skipAppNotApple(up.substring(tar.length()), tar, tar1);
        } else{
            return up.charAt(0) + skipAppNotApple(up.substring(1), tar, tar1);
        }
    }
}
