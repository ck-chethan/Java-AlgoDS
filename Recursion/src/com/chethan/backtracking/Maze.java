package com.chethan.backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(count(n, n));
        System.out.println(countDiagonal(n, n));
        System.out.println();
        path("", n, n);
        System.out.println();
        pathDiagonal("", n, n);
        System.out.println();
        System.out.println(pathRet("", n, n));
        System.out.println(pathRetDiagonal("", n, n));
    }

    static int count(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = count(r - 1, c);
        int right = count(r, c - 1);
        return left + right;
    }

    static void path(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r > 1) {
            path(p + 'D', r - 1, c);
        }
        if(c > 1) {
            path(p + 'R', r, c - 1);
        }
    }

    static ArrayList<String> pathRet(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r > 1) {
            list.addAll(pathRet(p + 'D', r - 1, c));
        }
        if(c > 1) {
            list.addAll(pathRet(p + 'R', r, c - 1));
        }
        return list;
    }

    static int countDiagonal(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = countDiagonal(r - 1, c);
        int right = countDiagonal(r, c - 1);
        int diagonal = countDiagonal(r - 1, c - 1);
        return left + right + diagonal;
    }

    static void pathDiagonal(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r > 1) {
            pathDiagonal(p + 'V', r - 1, c);
        }
        if(c > 1) {
            pathDiagonal(p + 'H', r, c - 1);
        }
        if(r > 1 && c > 1) {
            pathDiagonal(p + 'D', r - 1, c - 1);
        }
    }

    static ArrayList<String> pathRetDiagonal(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r > 1) {
            list.addAll(pathRetDiagonal(p + 'V', r - 1, c));
        }
        if(c > 1) {
            list.addAll(pathRetDiagonal(p + 'H', r, c - 1));
        }
        if(r > 1 && c > 1) {
            list.addAll(pathRetDiagonal(p + 'D',r - 1,c - 1));
        }
        return list;
    }
}
