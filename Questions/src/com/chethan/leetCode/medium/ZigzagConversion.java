package com.chethan.leetCode.medium;

// https://leetcode.com/problems/zigzag-conversion/
// 6. Zigzag Conversion - Leetcode - Medium

import java.util.ArrayList;
import java.util.List;

class ZigzagConversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String res = convert2(s, numRows);
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
        StringBuilder ans= new StringBuilder();
        for(String str:mat){
            if(str!=null)
                ans.append(str);
        }
        return ans.toString();
    }

    static public String convert2(String s, int numRows) {

        if (numRows == 1) return s;

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++)
            rows.add(new StringBuilder());

        int curRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) ret.append(row);
        return ret.toString();
    }
}