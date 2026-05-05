package com.LeetCodeSolutions;
/*
* Find the Index of the First Occurrence in a String
* */
public class Problem28 {
    public static int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)){
            return -1;
        }
        int left=0,right=0;
        while(right<haystack.length()){

            left++;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad","sad"));
        System.out.println(strStr("leetcode","leeto"));
    }
}
