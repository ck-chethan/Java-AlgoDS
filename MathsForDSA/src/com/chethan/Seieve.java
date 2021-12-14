package com.chethan;

// Prime in range Time complexity improved to O(N*log(logN))
// Auxiliary space or extra space taken = O(N)
public class Seieve {
    public static void main(String[] args) {
        int n = 37;
        boolean[] primes = new boolean[n + 1];
        seive(n, primes);
    }

    // False means number in array is false
    static void seive(int n, boolean[] primes){
        for (int i = 2; i*i < n; i++) {
            if(!primes[i]){
                for (int j = 2*i; j <= n; j=j+i) {
                    // This loop runs
                    // n/2 + n/3 + n/5 + n/7 + .....-->Harmonic progression for Primes
                    // Using Taylor series we'll get O(N*log(logN))
                    primes[j] = true;//Means this factor is already visited.
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!primes[i]){
                System.out.print(i + " ");
            }
        }
    }
}
