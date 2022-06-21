package com.chethan.leetCode.medium;
// https://leetcode.com/problems/filter-restaurants-by-vegan-friendly-price-and-distance/
// 1333. Filter Restaurants by Vegan-Friendly, Price and Distance - Medium

import java.util.*;

public class FilterRestaurantsByVeganFriendlyPriceAndDistance {
    public static void main(String[] args) {
        int[][] restaurants = {{1, 4, 1, 40, 10}, {2, 8, 0, 50, 5}, {3, 8, 1, 30, 4}, {4, 10, 0, 10, 3}, {5, 1, 1, 15, 1}};
        int veganFriendly = 1;
        int maxPrice = 50;
        int maxDistance = 10;
        List<Integer> res = filterRestaurants(restaurants, veganFriendly, maxPrice, maxDistance);
        System.out.println(res);
    }
    public static List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        HashMap<Integer, int[]> map = new HashMap<>();
        List<Integer> IDs = new ArrayList<>();
        for (int[] r : restaurants) {
            if (r[2] >= veganFriendly && r[3] <= maxPrice && r[4] <= maxDistance) {
                IDs.add(r[0]);
                map.put(r[0], r);
            }
        }
        IDs.sort((id1, id2) -> {
            int rating1 = map.get(id1)[1], rating2 = map.get(id2)[1];
            if (rating1 == rating2) return id2 - id1; // If same rating, order them by id from highest to lowest
            return rating2 - rating1; // Ordered by rating from highest to lowest
        });
        return IDs;
    }
}

