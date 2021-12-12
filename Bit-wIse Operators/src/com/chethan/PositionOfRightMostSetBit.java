package com.chethan;

public class PositionOfRightMostSetBit {
    public static void main(String[] args) {
        int n = 224;
        int res = findRightMostSetBitPosition(n);
        System.out.println(res);
    }

    private static int findRightMostSetBitPosition(int n) {
        int count = 0;
        int i = 1;
//        long start = System.currentTimeMillis();
//        long end = start + 1 * 1000; // 05 seconds * 1000 ms/sec
//        while (System.currentTimeMillis() < end) {
        if(n == 0){
            return -1;
        }
        while(true){
            int res;
            res = (n & i);
            i = 1 << ++count;
            if (res != 0) {
                return count;
            }
        }
    }
}
