package com.chethan;

// For a given value n
// Sqrt(N)=> root = (X + N/X)/2
// Where X-> Closest sqrt of a number we've assumed
// error = |root - x|
// We'll find the closest root when err<1
// Complexity = O(logN * F(N))
// F(N) = cost of calculating f(x)/f'(x) with n digit precision
public class NewtonRaphsonMethodSQRT {
    public static void main(String[] args) {
        int n = 36;
        System.out.printf("%.3f", sqrt(n));
    }

    static double sqrt(double n){
        double x = n;
        double root;
        while(true){
            root = 0.5*(x + (n/x));
            if(Math.abs(root - x) < 0.25){
                break;
            }
            x = root;
        }
        return root;
    }
}
