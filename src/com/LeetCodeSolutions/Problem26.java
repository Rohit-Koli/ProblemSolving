package com.LeetCodeSolutions;

import java.util.HashSet;
//Remove Duplicate Elements
public class Problem26 {
    public static int removeDuplicates(int[] nums) {
        var set=  new HashSet<Integer>();
        for(int i:nums){
            set.add(i);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] arr={1,1,2};
        System.out.println(removeDuplicates(arr));
    }
}
