package com.chethan.strings;

import java.util.ArrayList;
import java.util.List;

// Time complexity:
// O(N * 2^N)
// Total Number of Levels = N
// 2^N -> Number of subsets

// Space complexity: O(2^N * N)
public class Subset {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> res = subset(arr);
        System.out.println(res);
    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num: arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }
}
