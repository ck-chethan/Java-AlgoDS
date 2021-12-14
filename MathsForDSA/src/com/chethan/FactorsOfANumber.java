package com.chethan;

// Factors
//Ex: 20 -> 1, 2, 4, 5, 10, 20

import java.util.ArrayList;

public class FactorsOfANumber {
    public static void main(String[] args) {
        int n = 36;
        method3(n);
    }

    static void method1(int n){
        // Time Complexity = O(N)
        for (int i = 1; i <= n; i++) {
            if((n % i) == 0){
                System.out.print(i + " ");
            }
        }
    }

    static void method2(int n){
        // Time Complexity = O(Sqrt(N))
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if((n % i) == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " " + n / i + " ");
                }
            }
        }
    }

    static void method3(int n){
        // Both Time and Space Complexity = O(Sqrt(N))
        // To sort the result
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if((n % i) == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        //This will take Sqrt(N) Time
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
