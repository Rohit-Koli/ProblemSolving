package com.LeetCodeSolutions;
/*
Majority Element
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.
Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */
import java.util.HashMap;
import java.util.Map;

public class Problem169 {

    public static int solution(int[] arr){
        Map<Integer,Integer> mp = new HashMap<>();
        for (int i:arr){
            mp.put(i, mp.getOrDefault(i,0)+1);
        }
        int count=0;
        int n=0;
        for(Map.Entry<Integer,Integer> m:mp.entrySet()){
            if (m.getValue()>count){
                count=m.getValue();
                n=m.getKey();
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] nums1={2,2,1,1,1,2,2};
        int[] nums2={3,2,3};
        System.out.println(solution(nums1));
        System.out.println(solution(nums2));
    }
}
