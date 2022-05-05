package com.chethan.scaler.ArraysAndMaths;

import java.util.List;

/*Q4. N/3 Repeat Number
Problem Description
You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
If so, return the integer. If not, return -1.
If there are multiple solutions, return any one.

Problem Constraints
1 <= N <= 7*105
1 <= A[i] <= 109

Input Format
The only argument is an integer array A.

Output Format
Return an integer.

Example Input
[1 2 3 1 1]

Example Output
1

Example Explanation
1 occurs 3 times which is more than 5/3 times.
*/
public class N3RepeatNumber {
    public int repeatedNumber(final List<Integer> a) {
        int N = a.size();
        int count1 = 0, count2 = 0;
        int first = Integer.MIN_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i=0; i<N; i++){
            if(a.get(i) == first){
                count1++;
            }
            else if(a.get(i) == second){
                count2++;
            }
            else if (count1 == 0) {
                count1++;
                first = a.get(i);
            }

            else if (count2 == 0) {
                count2++;
                second = a.get(i);
            }
            else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int i = 0; i < N; i++) {
            if (a.get(i) == first)
                count1++;

            else if (a.get(i) == second)
                count2++;
        }

        if (count1 > N / 3)
            return first;

        if (count2 > N / 3)
            return second;

        return -1;
    }
}
