package com.chethan;

import java.util.Arrays;

class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0},{1,0,1},{0,0,0}};
        int[][] ans = flipAndInvertImage(image);
        for (int[] an : ans) {
            System.out.println(Arrays.toString(an));
        }
    }
    static int[][] flipAndInvertImage(int[][] image) {
        for (int k = 0; k < image.length; k++) {
            int i = 0;
            int j = image[k].length - 1;
            while (i <= j) {
                xorAndSwap(image, k, i, j);
                i++;
                j--;
            }
        }
        return image;
    }

    static void xorAndSwap(int[][] arr, int a, int b, int c) {
        int temp = arr[a][b];
        arr[a][b] = arr[a][c] ^ 1;//To Complement a number
        arr[a][c] = temp ^ 1;//To Complement a number
    }
}