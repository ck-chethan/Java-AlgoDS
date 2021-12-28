package com.chethan.questions;

import java.util.ArrayList;

public class NumberOfDiceRollsWithTargetSum {
    public static void main(String[] args) {
        int target = 4;
        int face = 6;
        dice("",target);
        diceFace("", target, face);
        System.out.println(diceList("",target));
    }

    static void dice(String p, int target) {
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }

    static void diceFace(String p, int target, int face) {
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= face && i <= target; i++) {
            diceFace(p + i, (target - i), face);
        }
    }

    static ArrayList<String> diceList(String p, int target) {
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceList(p + i, target - i));
        }
        return list;
    }
}
