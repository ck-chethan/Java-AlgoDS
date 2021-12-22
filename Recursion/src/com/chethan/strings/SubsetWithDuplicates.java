package com.chethan.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Time complexity:
// O(N * 2^N)
// Total Number of Levels = N
// 2^N -> Number of subsets

// Space complexity: O(2^N * N)

public class SubsetWithDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 2};
        List<List<Integer>> res = subsetDuplicate(arr);
        System.out.println(res);
    }

    static List<List<Integer>> subsetDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int end = 0;
        for (int i = 0; i < arr.length; i++){
            int start = 0;
            // if current & previous element is same then, s = e + 1
            if(i > 0 && arr[i] == arr[i - 1]){
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}