package com.chethan.strings;

public class RemoveCharacterFromString {
    public static void main(String[] args) {
        String str = "abaccadavrrvrhhhkhdkr";
        char tar = 'a';
        String res = removeChar(str, tar, "", 0, str.length());
        System.out.print(res);
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
}
