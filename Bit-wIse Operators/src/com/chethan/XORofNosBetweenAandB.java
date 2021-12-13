package com.chethan;

// XOR from 0 to b
// Then XOR the above result with 0 to (a-1)
// i.e, ans = f(b) ^ f(a-1)
public class XORofNosBetweenAandB {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        int ans = res(b) ^ res(a - 1);
        System.out.println(ans);

        // To only verify but it'll give Time Limit exceed for large numbers (TLE).
        int ans1 = 0;
        for (int i = a; i <= b; i++) {
            ans1 = ans1 ^ i;
        }
        System.out.println(ans1);
    }

    static int res(int a) {
        return switch (a % 4) {
            case 0 -> a;
            case 1 -> 1;
            case 2 -> a + 1;
            default -> 0;
        };
    }
}