package com.chethan.leetCode.medium;

// https://leetcode.com/problems/zigzag-conversion/
// 6. Zigzag Conversion - Leetcode - Medium

class ZigzagConversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String res = convert(s, numRows);
        System.out.println(res);
    }
    static String convert(String s, int numRows) {
        if(numRows<2 || s.length()==1)
            return s;
        String[] mat=new String[numRows];
        boolean dir=true;
        int row=0;
        for(int i=0;i<s.length();i++){
            if(mat[row]!=null){
                mat[row]+=s.charAt(i);
            }else{
                mat[row]=""+s.charAt(i);
            }

            if(row==0){
                dir=true;
            }else if(row==numRows-1){
                dir=false;
            }
            if(dir){
                row++;
            }else{
                row--;
            }
        }
        String ans="";
        for(String str:mat){
            if(str!=null)
                ans+=str;
        }
        return ans;
    }
}