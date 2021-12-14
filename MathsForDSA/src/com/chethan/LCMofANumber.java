package com.chethan;

// LCM(a, b) => Min number divisible by both a & b.
// d = gcd(a, b)
// f = a/d & g = b/d
// a = fd & b = gd
// Assume LCM = c
// lcm(a,b) = lcm(fd, gd)
// WKT f&g don't have any other common factor since we have already taken out the common factor
// Assume, a=9 b=18 => d=9
// f=1, g=2 -> This don't have any common factor
// a=fd & b = gd
// lcm = f*g*d = a/d*g/d*d = a*b/d = Product of 2 Nos/GCD of 2Nos
// a*b = fd * gd = d * fgd = hcf * lcm

public class LCMofANumber {
    public static void main(String[] args) {
        int a = 105, b = 224;
        int ans = lcm(a, b);
        System.out.print(ans);
    }

    static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b % a, a);
    }

    static int lcm(int a, int b){
        return (a * b)/gcd(a,b);
    }
}
