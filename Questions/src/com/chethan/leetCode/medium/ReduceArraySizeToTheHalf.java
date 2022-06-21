package com.chethan.leetCode.medium;
// 1338. Reduce Array Size to The Half - Medium

import java.util.*;
import java.util.stream.Collectors;

public class ReduceArraySizeToTheHalf {
    public static void main(String[] args) {
        int[] arr = {3,3,3,3,5,5,5,2,2,7};
        int res = minSetSize3(arr);
        System.out.println(res);
    }

    public static int minSetSize3(int[] arr) {
        int size = arr.length;
        HashMap<Integer, Integer> numCnt = new HashMap<>();
        for (int num : arr) {
            numCnt.put(num, numCnt.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> cnts = new ArrayList<>(numCnt.values());
        cnts.sort(Collections.reverseOrder());
        int rem = size / 2, pos = 0;
        while (rem > 0)
            rem -= cnts.get(pos++);
        return pos;
    }

    public static int minSetSize2(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer>[] list = new ArrayList[arr.length + 1];

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : map.keySet()) {
            int count = map.get(num);
            if (list[count] == null) {
                list[count] = new ArrayList<>();
            }
            list[count].add(num);
        }

        int steps = 0, res = 0;
        for (int i = arr.length; i > 0; i--) {
            List<Integer> cur = list[i];
            if (cur == null || cur.size() == 0) continue;
            for (int num : cur) {
                steps += i;
                res++;
                if (steps >= arr.length / 2)
                    return res;
            }
        }
        return arr.length;
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
