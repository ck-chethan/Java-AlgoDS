package com.chethan;

// Factors
//Ex: 20 -> 1, 2, 4, 5, 10, 20

public class FactorsOfANumber {
    public static void main(String[] args) {
        int n = 20;
        method1(n);
    }

    static void method1(int n){
        // Time Complexity = O(N)
        for (int i = 1; i <= n; i++) {
            if((n % i) == 0){
                System.out.print(i + " ");
            }
        }
    }
}
