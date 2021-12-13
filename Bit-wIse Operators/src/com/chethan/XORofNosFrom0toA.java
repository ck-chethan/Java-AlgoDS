package com.chethan;

//  If               0 -> a
// a % 4 = 0        Ans - a
// a % 4 = 1        Ans - 1
// a % 4 = 2        Ans - (a + 1)
// a % 4 = 3        Ans - 0

public class XORofNosFrom0toA {
    public static void main(String[] args) {
        int a = 4;
        int ans = res(a);
        System.out.println(ans);
    }
    static int res(int a){
        return switch (a % 4) {
            case 0 -> a;
            case 1 -> 1;
            case 2 -> a + 1;
            default -> 0;
        };
//        if(a % 4 == 0){
//            return a;
//        }
//        if(a % 4 == 1){
//            return 1;
//        }
//        if(a % 4 == 2){
//            return (a+1);
//        }
//        else {
//            return 0;
//        }
    }
}
