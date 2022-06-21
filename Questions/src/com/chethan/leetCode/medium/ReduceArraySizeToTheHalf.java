package com.chethan.leetCode.medium;
// 1338. Reduce Array Size to The Half - Medium

import java.util.*;
import java.util.stream.Collectors;

public class ReduceArraySizeToTheHalf {
    public static void main(String[] args) {
        int[] arr = {1,9};
        int res = minSetSize(arr);
        System.out.println(res);
    }

    public static int minSetSize(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int N = arr.length;
        for (int x : arr) {
            if (!hm.containsKey(x)) {
                hm.put(x, 0);
            }
            hm.put(x, hm.get(x) + 1);
        }
        List<Integer> sortedHm = new ArrayList<>();
                hm.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> sortedHm.add(x.getValue()));

        int ans = 0;
        int n = N/2;
        for (Integer a : sortedHm) {
            n -= a;
            ans += 1;
            if (n <= 0) break;
        }
        return ans;
    }
}
