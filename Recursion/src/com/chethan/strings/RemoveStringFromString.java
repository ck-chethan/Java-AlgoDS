package com.chethan.strings;

public class RemoveStringFromString {
    public static void main(String[] args) {
        String str = "bzapplecbbd";
        String tar = "apple";
        String res = skip(str, tar);
        System.out.println(res);
    }
    static String skip(String up, String tar) {
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith(tar)){
            return skip(up.substring(5), tar);
        } else{
            return up.charAt(0) + skip(up.substring(1), tar);
        }
    }
}
