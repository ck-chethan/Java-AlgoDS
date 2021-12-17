package com.chethan.patterns;

public class Triangle {
    public static void main(String[] args) {
        int n =5;
        pattern2(n,0);
    }

    static void pattern2(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            pattern2(r,c + 1);
            System.out.print("*" + " ");
        }else{
            pattern2(r-1, 0);
            if(!(r==1)){
                System.out.println();
            }
        }
    }
}
