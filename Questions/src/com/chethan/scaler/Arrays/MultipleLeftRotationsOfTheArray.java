package com.chethan.scaler.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleLeftRotationsOfTheArray {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList< ArrayList<Integer> > ans = new ArrayList<>();
        int n = a.size();
        for(int x : b) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i = 0; i < n; i++)  temp.add(a.get( (i+x) % n ));
            ans.add(temp);
        }
        return ans;
    }
}
