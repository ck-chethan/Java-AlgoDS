package com.chethan.leetCode.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

// 1353. Maximum Number of Events That Can Be Attended - Medium
public class MaximumNumberOfEventsThatCanBeAttended {
    public static void main(String[] args) {
        int[][] events = {{1, 2}, {2, 3}, {3, 4}, {1,2}};
        int res = maxEvents(events);
        System.out.println(res);
    }

    public static int maxEvents(int[][] events) {
        int ans = 0;
        Arrays.sort(events, Comparator.comparingInt(a->a[1]));
        Set<Integer> days = new HashSet<>();
        for(int i=1; i<100000; i++){
            days.add(i);
        }
        int daysSeen = 0;
        for(int[] event: events){
            if(event[1] > daysSeen){
                if(daysSeen < event[0]) {
                    daysSeen = event[0];
                    ans+=1;
                }
                else if(daysSeen <= event[1]) {
                    daysSeen = event[1];
                    ans += 1;
                }
                else{

                }

            }

        }
        return ans;
    }
}
