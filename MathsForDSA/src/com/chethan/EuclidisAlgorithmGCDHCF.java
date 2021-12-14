package com.chethan;

// Euclid's Algorithm
// gcd(a, b) = gcd(rem(b,a),a)
// Ex:- gcd(105, 224) = gcd(rem(224, 105), 105)
// => gcd(14, 105) = gcd(rem(105, 14), 14)
// => gcd(7, 14) = gcd(rem(14,7),7)
// => gcd(0.7) = 7

public class EuclidisAlgorithmGCDHCF {
    public static void main(String[] args) {
        int ans = gcd(224, 105);
        System.out.print(ans);
    }

    static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b % a, a);
    }
}
