package com.LeetCodeSolutions;

import java.util.Arrays;

public class Problem455 {
    public static int findContentChildren(int[] g, int[] s) {
        int left=0,right=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(left<s.length && right<g.length){
            if(s[left]>=g[right]){
                right++;
            }
            left++;
        }
        return right;
    }

    public static void main(String[] args) {
        int[] g={1,2,3};//Child Greed
        int[] s={1,1};//Cookies
        System.out.println(findContentChildren(g,s));
    }
}
