package com.chethan.strings;

public class RemoveCharacterFromString {
    public static void main(String[] args) {
        String str = "abaccadavrrvrhhhkhdkr";
        char tar = 'a';
        String res = removeChar(str, tar, "", 0, str.length());
        System.out.println(res);
        method1("", str, tar);
    }

    static String removeChar(String str, char tar, String ans, int s, int e) {
        if(s == e){
            return ans;
        }
        if(!(str.charAt(s) == tar)){
            ans += str.charAt(s);
        }
        s++;
        return removeChar(str, tar, ans, s, e);
    }

    static void method1(String p, String up, char tar) {
        if(up.isEmpty()){
            System.out.print(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == tar){
            method1(p, up.substring(1), tar);
        } else{
            method1(p + ch, up.substring(1), tar);
        }
    }
}
